package io.github.joaopaulorosa.cantina.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "TB_CAD_SERVICO")
public class Servico implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column(length = 100, nullable = false)
	private String nome;
	@Column(nullable = false, columnDefinition = "TINYINT default false")
	private Boolean permiteCompraBalcao;
	@Column(nullable = false, columnDefinition = "TINYINT default false")
	private Boolean defineLimiteDiario;
	@Column(nullable = false, columnDefinition = "TINYINT default false")
	private Boolean isValorFixoMensal;
	@Column
	private Double valorFixoMensal;
	@OneToMany
	@JoinColumn(name="idServico")
	private List<ServicoTurma> turmas;

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
	public Boolean getPermiteCompraBalcao() {
		return permiteCompraBalcao;
	}
	public void setPermiteCompraBalcao(Boolean permiteCompraBalcao) {
		this.permiteCompraBalcao = permiteCompraBalcao;
	}
	public Boolean getDefineLimiteDiario() {
		return defineLimiteDiario;
	}
	public void setDefineLimiteDiario(Boolean defineLimiteDiario) {
		this.defineLimiteDiario = defineLimiteDiario;
	}
	public Boolean getIsValorFixoMensal() {
		return isValorFixoMensal;
	}
	public void setIsValorFixoMensal(Boolean isValorFixoMensal) {
		this.isValorFixoMensal = isValorFixoMensal;
	}
	public Double getValorFixoMensal() {
		return valorFixoMensal;
	}
	public void setValorFixoMensal(Double valorFixoMensal) {
		this.valorFixoMensal = valorFixoMensal;
	}

	public List<ServicoTurma> getTurmas() {
		return turmas;
	}
	public void setTurmas(List<ServicoTurma> turmas) {
		this.turmas = turmas;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
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
		Servico other = (Servico) obj;
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		if (nome == null) {
			if (other.nome != null) {
				return false;
			}
		} else if (!nome.equals(other.nome)) {
			return false;
		}
		return true;
	}
	@Override
	public String toString() {
		return "Servico [id=" + id + ", nome=" + nome + "]";
	}





}
