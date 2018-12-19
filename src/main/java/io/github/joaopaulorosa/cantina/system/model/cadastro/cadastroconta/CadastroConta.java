/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.joaopaulorosa.cantina.system.model.cadastro.cadastroconta;

import io.github.joaopaulorosa.cantina.system.model.cadastro.aluno.Aluno;
import io.github.joaopaulorosa.cantina.system.model.cadastro.responsavel.Responsavel;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author joao
 */
@Entity
@Table(name="TB_CAD_CADASTROCONTA")
public class CadastroConta implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(nullable = false)
    private Integer ano;
    @Column(nullable = false, columnDefinition = "TINYINT default false")
    private Boolean ativa;
    @Column(nullable = false, columnDefinition = "TINYINT default false")
    private Boolean almoco;
    @Column(nullable = false, columnDefinition = "TINYINT default false")
    private Boolean pacoteMatutino;
    @Column(nullable = false, columnDefinition = "TINYINT default false")
    private Boolean pacoteVespertino;
    @Column(nullable = false, columnDefinition = "TINYINT default false")
    private Boolean lancheProgramado;
    @Column(nullable = false, columnDefinition = "TINYINT default false")
    private Boolean somenteLanche;
    @Column(nullable = false, columnDefinition = "TINYINT default false")
    private Boolean livre;
    
    @ManyToOne
    @JoinColumn(name = "idResponsavel", nullable = false)
    private Responsavel responsavel;
    
    @OneToMany
    @JoinColumn(name = "idCadastroConta")
    private List<Aluno> alunos;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Boolean getAtiva() {
        return ativa;
    }

    public void setAtiva(Boolean ativa) {
        this.ativa = ativa;
    }

    public Boolean getAlmoco() {
        return almoco;
    }

    public void setAlmoco(Boolean almoco) {
        this.almoco = almoco;
    }

    public Boolean getPacoteMatutino() {
        return pacoteMatutino;
    }

    public void setPacoteMatutino(Boolean pacoteMatutino) {
        this.pacoteMatutino = pacoteMatutino;
    }

    public Boolean getPacoteVespertino() {
        return pacoteVespertino;
    }

    public void setPacoteVespertino(Boolean pacoteVespertino) {
        this.pacoteVespertino = pacoteVespertino;
    }

    public Boolean getLancheProgramado() {
        return lancheProgramado;
    }

    public void setLancheProgramado(Boolean lancheProgramado) {
        this.lancheProgramado = lancheProgramado;
    }

    public Boolean getSomenteLanche() {
        return somenteLanche;
    }

    public void setSomenteLanche(Boolean somenteLanche) {
        this.somenteLanche = somenteLanche;
    }

    public Boolean getLivre() {
        return livre;
    }

    public void setLivre(Boolean livre) {
        this.livre = livre;
    }

    public Responsavel getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Responsavel responsavel) {
        this.responsavel = responsavel;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.id);
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
        final CadastroConta other = (CadastroConta) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CadastroConta{" + "id=" + id + ", responsavel=" + responsavel + ", alunos=" + alunos + '}';
    }
    
    
    
}
