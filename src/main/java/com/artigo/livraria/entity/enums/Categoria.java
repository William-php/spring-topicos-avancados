package com.artigo.livraria.entity.enums;

public enum Categoria {
	ADMINISTRACAO(1),
	MEDICINA(2),
	INFORMATICA(3),
	MATEMATICA(4),
	ECONOMIA(5);
	
	private int n;
	
	private Categoria(int n) {
		this.n = n;
	}
}
