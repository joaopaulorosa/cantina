package io.github.joaopaulorosa.cantina.model.cadastro.enums;

import java.io.Serializable;
import java.util.Map;

public enum EnumTipoEscolaridade implements Serializable{

	INFANTIL("IN", "Educação Infantil"), 
	FUNDAMENTAL1("F1", "Ensino Fundamental 1"), 
	FUNDAMENTAL2("F2", "Ensino Fundamental 2"), 
	MEDIO("ME", "Ensino Médio"),
	COLABORADOR("CO", "Colaborador");

	private static Map<String, EnumTipoEscolaridade> relations;
	private String sigla;
	private String descricao;

	EnumTipoEscolaridade(String sigla, String descricao){
		this.sigla = sigla;
		this.descricao = descricao;
	}

	public static EnumTipoEscolaridade get(String sigla){
		if (relations.containsKey(sigla)) {
			return relations.get(sigla);
		} else {
			return null;
		}
	}

	public static Map<String, EnumTipoEscolaridade> getRelations() {
		return relations;
	}

	public static void setRelations(Map<String, EnumTipoEscolaridade> relations) {
		EnumTipoEscolaridade.relations = relations;
	}


	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
