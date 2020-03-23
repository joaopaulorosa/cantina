/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.joaopaulorosa.cantina.model;

import java.io.Serializable;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;

import io.github.joaopaulorosa.cantina.model.enums.EnumEstadoCivil;
import io.github.joaopaulorosa.cantina.model.enums.EnumTipoSexo;

/**
 *
 * @author joao
 */
@SuppressWarnings("serial")
@Entity
@Table(name="TB_CAD_RESPONSAVEL")
public class Responsavel implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column(length = 100, nullable = false)
	private String nome;

	@Column(length = 11, nullable = false, unique = true)
	private String cpf;

	@Column(length = 15, nullable = false)
	private String cepEndereco;
	@Column(length = 100, nullable = false)
	private String logradouroEndereco;
	@Column(length = 100)
	private String complementoEndereco;
	@Column(length = 100, nullable = false)
	private String bairroEndereco;
	@Column(length = 100, nullable = false)
	private String cidadeEndereco;
	@Column(length = 2, nullable = false)
	private String ufEndereco;
	@Column(length = 50, nullable = false)
	private String paisEndereco;
	@Column(length = 100, nullable = false)
	private String email;
	@Column(length = 100)
	private String emailAlternativo;
	@Column(length = 2, nullable = false)
	private String dddTelefone;
	@Column(length = 10, nullable = false)
	private String telefone;
	@Column(length = 2)
	private String dddCelular;
	@Column(length = 10)
	private String celular;
	@Column(nullable = false, columnDefinition = "TINYINT default false")
	private Boolean possuiWhatsAppCelular;
	@Column(length = 100)
	private String profissao;
	@Column(length = 100)
	private String nomeEmpresa;
	@Column(length = 100)
	private String enderecoEmpresa;
	@Column(length = 100)
	private String dddTelefoneEmpresa;
	@Column(length = 100)
	private String telefoneEmpresa;
	@Column(length = 100)
	private String ramalTelefoneEmpresa;
	@Column(length = 100)
	private String emailEmpresa;
	@Enumerated(EnumType.STRING)
	@Column(length = 16, nullable = false, columnDefinition="varchar(50)")
	private EnumTipoSexo tipoSexo;
	@Enumerated(EnumType.STRING)
	@Column(length = 16, nullable = false, columnDefinition="varchar(50)")
	private EnumEstadoCivil estadoCivil;

	@OneToMany
	@JoinColumn(name="idResponsavel")
	private List<Aluno> alunos;


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

	public String getCepEndereco() {
		return cepEndereco;
	}

	public void setCepEndereco(String cepEndereco) {
		this.cepEndereco = cepEndereco;
	}

	public String getLogradouroEndereco() {
		return logradouroEndereco;
	}

	public void setLogradouroEndereco(String logradouroEndereco) {
		this.logradouroEndereco = logradouroEndereco;
	}

	public String getComplementoEndereco() {
		return complementoEndereco;
	}

	public void setComplementoEndereco(String complementoEndereco) {
		this.complementoEndereco = complementoEndereco;
	}

	public String getBairroEndereco() {
		return bairroEndereco;
	}

	public void setBairroEndereco(String bairroEndereco) {
		this.bairroEndereco = bairroEndereco;
	}

	public String getCidadeEndereco() {
		return cidadeEndereco;
	}

	public void setCidadeEndereco(String cidadeEndereco) {
		this.cidadeEndereco = cidadeEndereco;
	}

	public String getUfEndereco() {
		return ufEndereco;
	}

	public void setUfEndereco(String ufEndereco) {
		this.ufEndereco = ufEndereco;
	}

	public String getPaisEndereco() {
		return paisEndereco;
	}

	public void setPaisEndereco(String paisEndereco) {
		this.paisEndereco = paisEndereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmailAlternativo() {
		return emailAlternativo;
	}

	public void setEmailAlternativo(String emailAlternativo) {
		this.emailAlternativo = emailAlternativo;
	}

	public String getDddTelefone() {
		return dddTelefone;
	}

	public void setDddTelefone(String dddTelefone) {
		this.dddTelefone = dddTelefone;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getDddCelular() {
		return dddCelular;
	}

	public void setDddCelular(String dddCelular) {
		this.dddCelular = dddCelular;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public Boolean getPossuiWhatsAppCelular() {
		return possuiWhatsAppCelular;
	}

	public void setPossuiWhatsAppCelular(Boolean possuiWhatsAppCelular) {
		this.possuiWhatsAppCelular = possuiWhatsAppCelular;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}

	public String getEnderecoEmpresa() {
		return enderecoEmpresa;
	}

	public void setEnderecoEmpresa(String enderecoEmpresa) {
		this.enderecoEmpresa = enderecoEmpresa;
	}

	public String getDddTelefoneEmpresa() {
		return dddTelefoneEmpresa;
	}

	public void setDddTelefoneEmpresa(String dddTelefoneEmpresa) {
		this.dddTelefoneEmpresa = dddTelefoneEmpresa;
	}

	public String getTelefoneEmpresa() {
		return telefoneEmpresa;
	}

	public void setTelefoneEmpresa(String telefoneEmpresa) {
		this.telefoneEmpresa = telefoneEmpresa;
	}

	public String getRamalTelefoneEmpresa() {
		return ramalTelefoneEmpresa;
	}

	public void setRamalTelefoneEmpresa(String ramalTelefoneEmpresa) {
		this.ramalTelefoneEmpresa = ramalTelefoneEmpresa;
	}

	public String getEmailEmpresa() {
		return emailEmpresa;
	}

	public void setEmailEmpresa(String emailEmpresa) {
		this.emailEmpresa = emailEmpresa;
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}

	public EnumTipoSexo getTipoSexo() {
		return tipoSexo;
	}

	public void setTipoSexo(EnumTipoSexo tipoSexo) {
		this.tipoSexo = tipoSexo;
	}

	public EnumEstadoCivil getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(EnumEstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	@Override
	public int hashCode() {
		int hash = 7;
		hash = 31 * hash + Objects.hashCode(this.id);
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
		final Responsavel other = (Responsavel) obj;
		if (!Objects.equals(this.id, other.id)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Responsavel{" + "id=" + id + ", nome=" + nome + ", cpf=" + cpf + '}';
	}



}
