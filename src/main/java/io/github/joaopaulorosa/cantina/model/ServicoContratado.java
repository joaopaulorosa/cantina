package io.github.joaopaulorosa.cantina.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "TB_CAD_SERVICOCONTRATADO")
public class ServicoContratado implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@ManyToOne
	@JoinColumn(name = "idAlunoTurma", nullable = false)
	private AlunoTurma alunoTurma;
	@ManyToOne
	@JoinColumn(name = "idServico", nullable = false)
	private Servico servico;
	@Column
	private Double valorLimiteDiario;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public AlunoTurma getAlunoTurma() {
		return alunoTurma;
	}
	public void setAlunoTurma(AlunoTurma alunoTurma) {
		this.alunoTurma = alunoTurma;
	}
	public Servico getServico() {
		return servico;
	}
	public void setServico(Servico servico) {
		this.servico = servico;
	}
	public Double getValorLimiteDiario() {
		return valorLimiteDiario;
	}
	public void setValorLimiteDiario(Double valorLimiteDiario) {
		this.valorLimiteDiario = valorLimiteDiario;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		ServicoContratado other = (ServicoContratado) obj;
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		return true;
	}
	@Override
	public String toString() {
		return "ServicoContratado [id=" + id + ", alunoTurma=" + alunoTurma + ", servico=" + servico + "]";
	}



}
