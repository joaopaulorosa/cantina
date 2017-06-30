/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.joaopaulorosa.cantina.infra;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author joao
 */
public class ConexaoMySqlJDBC implements ConexaoJDBC{

    private Connection connection = null;
    
    public ConexaoMySqlJDBC() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        
        Properties properties = new Properties();
        properties.put("user", "joao");
        properties.put("password", "joao");
        
        this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cantina", properties);
        this.connection.setAutoCommit(false);
    }
    
    @Override
    public Connection getConnection() {
        return this.connection;
    }

    @Override
    public void close() {
        if(this.connection != null){
            try{
                this.connection.close();
            }catch(SQLException e){
                Logger.getLogger(ConexaoMySqlJDBC.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }

    @Override
    public void commit() throws SQLException {
        this.connection.commit();
        this.close();
    }

    @Override
    public void rollback() {
        if(this.connection != null){
            try{
                this.connection.rollback();
            }catch(SQLException e){
                Logger.getLogger(ConexaoMySqlJDBC.class.getName()).log(Level.SEVERE, null, e);
            }finally{
                this.close();
            }
        }
    }
    
}
