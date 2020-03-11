package io.github.joaopaulorosa.cantina.model.cadastro.alunoTurma;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import io.github.joaopaulorosa.cantina.model.cadastro.aluno.Aluno;
import io.github.joaopaulorosa.cantina.model.cadastro.servicoContratado.ServicoContratado;
import io.github.joaopaulorosa.cantina.model.cadastro.turma.Turma;

@Entity
@Table(name = "TB_CAD_ALUNOTURMA")
public class AlunoTurma {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column(nullable = false)
	private Integer ano;
	@ManyToOne
	@JoinColumn(name = "idAluno", nullable = false)
	private Aluno aluno;
	@ManyToOne
	@JoinColumn(name = "idTurma", nullable = false)
	private Turma turma;

	@OneToMany
	@JoinColumn(name="idAlunoTurma")
	private List<ServicoContratado> servicos;

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
	public Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	public Turma getTurma() {
		return turma;
	}
	public void setTurma(Turma turma) {
		this.turma = turma;
	}

	public List<ServicoContratado> getServicos() {
		return servicos;
	}
	public void setServicos(List<ServicoContratado> servicos) {
		this.servicos = servicos;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((aluno == null) ? 0 : aluno.hashCode());
		result = prime * result + ((ano == null) ? 0 : ano.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((turma == null) ? 0 : turma.hashCode());
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
		AlunoTurma other = (AlunoTurma) obj;
		if (aluno == null) {
			if (other.aluno != null) {
				return false;
			}
		} else if (!aluno.equals(other.aluno)) {
			return false;
		}
		if (ano == null) {
			if (other.ano != null) {
				return false;
			}
		} else if (!ano.equals(other.ano)) {
			return false;
		}
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		if (turma == null) {
			if (other.turma != null) {
				return false;
			}
		} else if (!turma.equals(other.turma)) {
			return false;
		}
		return true;
	}
	@Override
	public String toString() {
		return "AlunoTurma [id=" + id + ", ano=" + ano + ", aluno=" + aluno + ", turma=" + turma + "]";
	}






}
