/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.joaopaulorosa.cantina.model.old;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import io.github.joaopaulorosa.cantina.model.old.enumerado.TipoEndereco;

/**
 *
 * @author joao
 */
@Entity
@Table(name = "endereco")
public class EnderecoOld implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    @Column(length = 200, nullable = false)
    private String logradouro;
    
    @Column(length = 45)
    private String complemento;
    
    @Column(length = 45, nullable = false)
    private String cep;
    
    @Column(length = 45, nullable = false)
    private String bairro;
    
    @Column(length = 45, nullable = false)
    private String cidade;
    
    @Column(length = 45, nullable = false)
    private String estado;
    
    @Column(length = 45, nullable = false)
    private String pais;
    
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TipoEndereco tipo;
    
    @ManyToOne(optional = false)
    @JoinColumn(name = "responsavel_id", nullable = false)
    private ResponsavelOld responsavel;
    
    @Column(columnDefinition = "TINYINT default true")
    private boolean ativado;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public TipoEndereco getTipo() {
        return tipo;
    }

    public void setTipo(TipoEndereco tipo) {
        this.tipo = tipo;
    }

    public ResponsavelOld getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(ResponsavelOld responsavel) {
        this.responsavel = responsavel;
    }

    public boolean isAtivado() {
        return ativado;
    }

    public void setAtivado(boolean ativado) {
        this.ativado = ativado;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.id);
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
        final EnderecoOld other = (EnderecoOld) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Endereco{" + "id=" + id + ", logradouro=" + logradouro + ", complemento=" + complemento + ", cep=" + cep + ", bairro=" + bairro + ", cidade=" + cidade + ", estado=" + estado + ", pais=" + pais + ", tipo=" + tipo + ", responsavel=" + responsavel + ", ativado=" + ativado + '}';
    }
    
    
    
}
