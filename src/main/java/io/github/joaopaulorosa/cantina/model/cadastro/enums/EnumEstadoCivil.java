package io.github.joaopaulorosa.cantina.model.cadastro.enums;

import java.io.Serializable;
import java.util.Map;

public enum EnumEstadoCivil implements Serializable{

	SOLTEIRO("SO", "Solteiro(a)"),
	CASADO("CA", "Casado(a)"),
	DIVORCIADO("DI", "Divorciado(a)"),
	VIUVO("VI", "Viúvo(a)"),
	SEPARADO("SE", "Separado(a)"),
	UNIAOESTAVEL("UE", "União Estável");

	private static Map<String, EnumEstadoCivil> relations;
	private String sigla;
	private String descricao;

	EnumEstadoCivil(String sigla, String descricao){
		this.sigla = sigla;
		this.descricao = descricao;
	}

	public static EnumEstadoCivil get(String sigla){
		if (relations.containsKey(sigla)) {
			return relations.get(sigla);
		} else {
			return null;
		}
	}

	public static Map<String, EnumEstadoCivil> getRelations() {
		return relations;
	}

	public static void setRelations(Map<String, EnumEstadoCivil> relations) {
		EnumEstadoCivil.relations = relations;
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
