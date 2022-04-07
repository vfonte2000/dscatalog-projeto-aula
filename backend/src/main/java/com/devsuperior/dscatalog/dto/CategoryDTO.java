package com.devsuperior.dscatalog.dto;

import java.io.Serializable;

oi

import com.devsuperior.dscatalog.entities.Category;

public class CategoryDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String nome;

	public CategoryDTO() {

	}

	public CategoryDTO(Long id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	public CategoryDTO(Category entity) {
		this.id = entity.getId();
		this.nome = entity.getnome();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getnome() {
		return nome;
	}

	public void setnome(String nome) {
		this.nome = nome;
	}

}
