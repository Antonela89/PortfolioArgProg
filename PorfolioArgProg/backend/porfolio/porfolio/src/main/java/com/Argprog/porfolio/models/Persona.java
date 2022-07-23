package com.Argprog.porfolio.models;


import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;


@Entity
public class Persona implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	private String nombre;
	private String apellido;
	private String titulo;
	private String acercaMi;
	private String urlFoto;
	
	//Constructores 
	public Persona() {
	}

	public Persona(Long id, String nombre, String apellido, String titulo, String acercaMi, String urlFoto) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.titulo = titulo;
		this.acercaMi = acercaMi;
		this.urlFoto = urlFoto;
	}

	//Getters and Setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAcercaMi() {
		return acercaMi;
	}

	public void setAcercaMi(String acercaMi) {
		this.acercaMi = acercaMi;
	}

	public String getUrlFoto() {
		return urlFoto;
	}

	public void setUrlFoto(String urlFoto) {
		this.urlFoto = urlFoto;
	}

}
