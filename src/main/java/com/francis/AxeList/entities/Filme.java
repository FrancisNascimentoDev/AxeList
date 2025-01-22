package com.francis.AxeList.entities;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "tb_filme")
public class Filme {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String titulo;
	private Integer ano;
	private String genero;
	private String plataforma;
	private String imgUrl;
	private String descricaoRapida;
	private String DescricaoLonga;
	
	public Filme() {
		
	}

	public Filme(Long id, String titulo, Integer ano, String genero, String plataforma, String imgUrl,
			String descricaoRapida, String descricaoLonga) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.ano = ano;
		this.genero = genero;
		this.plataforma = plataforma;
		this.imgUrl = imgUrl;
		this.descricaoRapida = descricaoRapida;
		DescricaoLonga = descricaoLonga;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getDescricaoRapida() {
		return descricaoRapida;
	}

	public void setDescricaoRapida(String descricaoRapida) {
		this.descricaoRapida = descricaoRapida;
	}

	public String getDescricaoLonga() {
		return DescricaoLonga;
	}

	public void setDescricaoLonga(String descricaoLonga) {
		DescricaoLonga = descricaoLonga;
	}

	 

	
	
	
	
}
