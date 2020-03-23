/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.joaopaulorosa.cantina.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import io.github.joaopaulorosa.cantina.model.enums.EnumTipoEscolaridade;

/**
 *
 * @author joao
 */
@SuppressWarnings("serial")
@Entity
@Table(name="TB_CAD_TURMA")
public class Turma implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column(length = 20, nullable = false)
	private String nome;
	@Enumerated(EnumType.STRING)
	@Column(length = 16, nullable = false, columnDefinition="varchar(50)")
	private EnumTipoEscolaridade tipoEscolaridade;


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

	public EnumTipoEscolaridade getTipoEscolaridade() {
		return tipoEscolaridade;
	}

	public void setTipoEscolaridade(EnumTipoEscolaridade tipoEscolaridade) {
		this.tipoEscolaridade = tipoEscolaridade;
	}

	@Override
	public int hashCode() {
		int hash = 5;
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
		final Turma other = (Turma) obj;
		if (!Objects.equals(this.id, other.id)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Turma{" + "id=" + id + ", nome=" + nome + '}';
	}



}
