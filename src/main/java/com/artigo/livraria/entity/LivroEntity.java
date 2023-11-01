package com.artigo.livraria.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import com.artigo.livraria.entity.enums.*;

@Entity
@Table(name = "livro")
public class LivroEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long isbn;
	private String title;
	private Integer edition;
	private String author;
	private Categoria category;
	private Modelo model;
	public Long getIsbn() {
		return isbn;
	}
	public void setIsbn(Long isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Integer getEdition() {
		return edition;
	}
	public void setEdition(Integer edition) {
		this.edition = edition;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Categoria getCategory() {
		return category;
	}
	public void setCategory(Categoria category) {
		this.category = category;
	}
	public Modelo getModel() {
		return model;
	}
	public void setModel(Modelo model) {
		this.model = model;
	}
	
	
	@Override
	public String toString() {
		return "Book\n========================" +
				"\nTitle: " + title +
				"\nEdition: " + edition +
				"\nAuthor: " + author +
				"\nCategory: " + category +
				"\nModel: " + model + "\n";
		
	}
}
