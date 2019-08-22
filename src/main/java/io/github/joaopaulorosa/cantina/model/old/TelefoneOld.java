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

import io.github.joaopaulorosa.cantina.model.old.enumerado.telefone.TipoTelefone;

/**
 *
 * @author joao
 */
@Entity
@Table(name = "telefone")
public class TelefoneOld implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    @Column(length = 45, nullable = false)
    private String telefone;
    
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TipoTelefone tipo;
    
    @ManyToOne(optional = false)
    @JoinColumn(name = "responsavel_id", nullable = false)
    private ResponsavelOld responsavel;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public TipoTelefone getTipo() {
        return tipo;
    }

    public void setTipo(TipoTelefone tipo) {
        this.tipo = tipo;
    }

    public ResponsavelOld getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(ResponsavelOld responsavel) {
        this.responsavel = responsavel;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.id);
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
        final TelefoneOld other = (TelefoneOld) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Telefone{" + "id=" + id + ", telefone=" + telefone + ", tipo=" + tipo + ", responsavel=" + responsavel + '}';
    }
    
    
    
}
