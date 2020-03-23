package io.github.joaopaulorosa.cantina.model.enums;

import java.io.Serializable;
import java.util.Map;

public enum EnumTipoSexo implements Serializable{

	MASCULINO("MA", "Masculino"),
	FEMININO ("FE", "Feminino");

	private static Map<String, EnumTipoSexo> relations;
	private String sigla;
	private String descricao;

	EnumTipoSexo(String sigla, String descricao){
		this.sigla = sigla;
		this.descricao = descricao;
	}

	public static EnumTipoSexo get(String sigla){
		if (relations.containsKey(sigla)) {
			return relations.get(sigla);
		} else {
			return null;
		}
	}

	public static Map<String, EnumTipoSexo> getRelations() {
		return relations;
	}

	public static void setRelations(Map<String, EnumTipoSexo> relations) {
		EnumTipoSexo.relations = relations;
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
