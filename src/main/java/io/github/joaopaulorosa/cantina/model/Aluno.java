/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.joaopaulorosa.cantina.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;

import io.github.joaopaulorosa.cantina.model.enums.EnumTipoSexo;

/**
 *
 * @author joao
 */
@SuppressWarnings("serial")
@Entity
@Table(name="TB_CAD_ALUNO")
public class Aluno implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column(length = 100, nullable = false)
	private String nome;
	@Column(length = 100)
	private String apelido;
	@Column(length = 200)
	private String observacao;
	@Enumerated(EnumType.STRING)
	@Column(length = 16, nullable = false, columnDefinition="varchar(50)")
	private EnumTipoSexo tipoSexo;
	@Column(nullable = false)
	private Date dataNascimento;
	@ManyToOne
	@JoinColumn(name = "idResponsavel", nullable = false)
	private Responsavel responsavel;
	@OneToMany
	@JoinColumn(name = "idAluno")
	private List<AlunoTurma> turmas;

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

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public Responsavel getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(Responsavel responsavel) {
		this.responsavel = responsavel;
	}

	public List<AlunoTurma> getTurmas() {
		return turmas;
	}

	public void setTurmas(List<AlunoTurma> turmas) {
		this.turmas = turmas;
	}

	public EnumTipoSexo getTipoSexo() {
		return tipoSexo;
	}

	public void setTipoSexo(EnumTipoSexo tipoSexo) {
		this.tipoSexo = tipoSexo;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	@Override
	public int hashCode() {
		int hash = 5;
		hash = 67 * hash + Objects.hashCode(this.id);
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
		final Aluno other = (Aluno) obj;
		if (!Objects.equals(this.id, other.id)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Aluno{" + "id=" + id + ", nome=" + nome + '}';
	}



}
