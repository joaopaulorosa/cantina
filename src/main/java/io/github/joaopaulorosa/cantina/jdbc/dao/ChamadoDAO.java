/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.joaopaulorosa.cantina.jdbc.dao;

import io.github.joaopaulorosa.cantina.data.Chamado;
import io.github.joaopaulorosa.cantina.enumerado.chamado.StatusChamado;
import io.github.joaopaulorosa.cantina.infra.ConexaoJDBC;
import io.github.joaopaulorosa.cantina.infra.ConexaoMySqlJDBC;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author joao
 */
public class ChamadoDAO {
    private final ConexaoJDBC conexao;
    
    public ChamadoDAO() throws ClassNotFoundException, SQLException{
        this.conexao = new ConexaoMySqlJDBC();
    }
    
    public Long inserir(Chamado chamado) throws SQLException{
        Long id = null;
        String sqlQuery = "INSERT INTO tb_chamado (assunto, status, mensagem) VALUES (?, ?, ?)";
        
        try{
            PreparedStatement stmt = this.conexao.getConnection().prepareStatement(sqlQuery);
            stmt.setString(1, chamado.getAssunto());
            stmt.setString(2, chamado.getStatus().toString());
            stmt.setString(3, chamado.getMensagem());
            
            int i = stmt.executeUpdate();
            
//            if(i > 0){
//                PreparedStatement stmt2 = this.conexao.getConnection().prepareStatement("SELECT LAST_INSERT_ID()");
//                ResultSet rs = stmt2.executeQuery();
//                if(rs.next()){
//                    id = rs.getLong("id");
//                }
//            }
            this.conexao.commit();
        }catch(SQLException e){
            this.conexao.rollback();
            throw e;
        }
        return id;
    }
    
    public int alterar(Chamado chamado) throws SQLException{
        String sqlQuery = "UPDATE tb_chamado SET assunto = ?, status = ?, mensagem = ? WHERE id = ?";
        int linhasAfetadas = 0;
        
        try{
            PreparedStatement stmt = this.conexao.getConnection().prepareStatement(sqlQuery);
            stmt.setString(1, chamado.getAssunto());
            stmt.setString(2, chamado.getStatus().toString());
            stmt.setString(3, chamado.getMensagem());
            stmt.setLong(4, chamado.getId());
            
            linhasAfetadas = stmt.executeUpdate();
            this.conexao.commit();
        }catch(SQLException e){
            this.conexao.rollback();
            throw e;
        }
        return linhasAfetadas;
    }
    
    public int excluir(long id) throws SQLException{
        String sqlQuery = "DELETE FROM tb_chamado WHERE id = ?";
        int linhasAfetadas = 0;
        
        try{
            PreparedStatement stmt = this.conexao.getConnection().prepareStatement(sqlQuery);
            stmt.setLong(1, id);
            
            linhasAfetadas = stmt.executeUpdate();
            this.conexao.commit();
        }catch(SQLException e){
            this.conexao.rollback();
            throw e;
        }
        return linhasAfetadas;
    }
    
    public Chamado selecionar(long id) throws SQLException{
        String sqlQuery = "SELECT * FROM tb_chamado WHERE id = ?";
        
        try{
            PreparedStatement stmt = this.conexao.getConnection().prepareStatement(sqlQuery);
            stmt.setLong(1, id);
            ResultSet rs = stmt.executeQuery();
            if(rs.next()){
                return parser(rs);
            }
        }catch(SQLException e){
            throw e;
        }
        return null;
    }
    
    public List<Chamado> listar() throws SQLException{
        String sqlQuery = "SELECT * FROM tb_chamado ORDER BY id";
        
        try{
            PreparedStatement stmt = this.conexao.getConnection().prepareStatement(sqlQuery);
            ResultSet rs = stmt.executeQuery();
            List<Chamado> chamados = new ArrayList<>();
            while(rs.next()){
                chamados.add(parser(rs));
            }
            return chamados;
        }catch(SQLException e){
            throw e;
        }
    }

    private Chamado parser(ResultSet rs) throws SQLException {
        Chamado c = new Chamado();
        c.setId(rs.getLong("id"));
        c.setAssunto(rs.getString("assunto"));
        c.setMensagem(rs.getString("mensagem"));
        c.setStatus(StatusChamado.valueOf(rs.getString("status")));
        return c;
    }
}
