package com.artigo.livraria.entity.enums;

public enum Modelo {
	FISICO(1),
	EBOOK(2);
	private int n;
	
	private Modelo(int n) {
		this.n = n;
	}
}
