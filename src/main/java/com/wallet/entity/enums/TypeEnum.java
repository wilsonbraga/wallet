package com.wallet.entity.enums;

public enum TypeEnum {
	
	EN("ENTRADA"),
	SA("SAÍDA");
	
	private  final String descricao;
	
	TypeEnum(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public static TypeEnum getEnum(String descricao) {
		for(TypeEnum t : values()) {
			if(descricao.equals(t.getDescricao())) {
				return t;
			}
		}
		return null;
	}
	
}
