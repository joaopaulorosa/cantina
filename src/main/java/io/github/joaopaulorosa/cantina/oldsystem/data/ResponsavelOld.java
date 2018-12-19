/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.joaopaulorosa.cantina.oldsystem.data;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author joao
 */
@Entity
@Table(name = "responsavel")
public class ResponsavelOld implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    @Column(length = 100, nullable = false)
    private String nome;
    
    @Column(length = 45, nullable = false)
    private String cpf;

    @OneToMany
    @JoinColumn(name = "responsavel_id")
    private List<BoletoOld> boletos;
    
    @OneToMany
    @JoinColumn(name = "responsavel_id")
    private List<EmailOld> emails;
    
    @OneToMany
    @JoinColumn(name = "responsavel_id")
    private List<EnderecoOld> enderecos;
    
    @OneToMany
    @JoinColumn(name = "responsavel_id")
    private List<MovimentacaoOld> movimentacoes;
    
    @OneToMany
    @JoinColumn(name = "responsavel_id")
    private List<TelefoneOld> telefones;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public List<BoletoOld> getBoletos() {
        return boletos;
    }

    public void setBoletos(List<BoletoOld> boletos) {
        this.boletos = boletos;
    }

    public List<EmailOld> getEmails() {
        return emails;
    }

    public void setEmails(List<EmailOld> emails) {
        this.emails = emails;
    }

    public List<EnderecoOld> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<EnderecoOld> enderecos) {
        this.enderecos = enderecos;
    }

    public List<MovimentacaoOld> getMovimentacoes() {
        return movimentacoes;
    }

    public void setMovimentacoes(List<MovimentacaoOld> movimentacoes) {
        this.movimentacoes = movimentacoes;
    }

    public List<TelefoneOld> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<TelefoneOld> telefones) {
        this.telefones = telefones;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 61 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ResponsavelOld other = (ResponsavelOld) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Responsavel{" + "id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", boletos=" + boletos + ", emails=" + emails + ", enderecos=" + enderecos + ", movimentacoes=" + movimentacoes + ", telefones=" + telefones + '}';
    }
    
    
    
}
