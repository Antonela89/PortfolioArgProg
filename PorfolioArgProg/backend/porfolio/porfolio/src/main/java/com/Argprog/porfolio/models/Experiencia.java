package com.Argprog.porfolio.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Experiencia {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idExp;
	private String empresa;
	private int anoInicio;
	private int anoFin;
	private String descripcion;

	public Experiencia() {
	}

	public Experiencia(Long idExp, String empresa, int anoInicio, int anoFin, String descripcion) {
		this.idExp = idExp;
		this.empresa = empresa;
		this.anoInicio = anoInicio;
		this.anoFin = anoFin;
		this.descripcion = descripcion;
	}

	public Long getIdExp() {
		return idExp;
	}

	public void setIdExp(Long idExp) {
		this.idExp = idExp;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public int getAnoInicio() {
		return anoInicio;
	}

	public void setAnoInicio(int anoInicio) {
		this.anoInicio = anoInicio;
	}

	public int getAnoFin() {
		return anoFin;
	}

	public void setAnoFin(int anoFin) {
		this.anoFin = anoFin;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
		
}
