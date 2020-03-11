package io.github.joaopaulorosa.cantina.model.cadastro.servicoTurma;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import io.github.joaopaulorosa.cantina.model.cadastro.servico.Servico;
import io.github.joaopaulorosa.cantina.model.cadastro.turma.Turma;

@SuppressWarnings("serial")
@Entity
@Table(name = "TB_CAD_SERVICOTURMA")
public class ServicoTurma implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@ManyToOne
	@JoinColumn(name = "idServico", nullable = false)
	private Servico servico;
	@ManyToOne
	@JoinColumn(name = "idTurma", nullable = false)
	private Turma turma;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Servico getServico() {
		return servico;
	}
	public void setServico(Servico servico) {
		this.servico = servico;
	}
	public Turma getTurma() {
		return turma;
	}
	public void setTurma(Turma turma) {
		this.turma = turma;
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
		ServicoTurma other = (ServicoTurma) obj;
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
		return "ServicoTurma [id=" + id + ", servico=" + servico + ", turma=" + turma + "]";
	}



}
