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

import io.github.joaopaulorosa.cantina.model.old.enumerado.TipoEmail;

/**
 *
 * @author joao
 */
@Entity
@Table(name = "email")
public class EmailOld implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    @Column(length = 200, nullable = false)
    private String email;
    
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TipoEmail tipo;
    
    @ManyToOne(optional = false)
    @JoinColumn(name = "responsavel_id", nullable = false)
    private ResponsavelOld responsavel;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public TipoEmail getTipo() {
        return tipo;
    }

    public void setTipo(TipoEmail tipo) {
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
        int hash = 5;
        hash = 73 * hash + Objects.hashCode(this.id);
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
        final EmailOld other = (EmailOld) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Email{" + "id=" + id + ", email=" + email + ", tipo=" + tipo + ", responsavel=" + responsavel + '}';
    }
    
    
}
