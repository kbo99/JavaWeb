package com.kbo.model;
// Generated 23/04/2017 04:07:46 PM by Hibernate Tools 4.0.0.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Municipio generated by hbm2java
 */
public class Municipio implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer munId;
	private Entidad entidad;
	private String cveMun;
	private String nomMun;
	private String cveCab;
	private String nomCab;
	private Set colonias = new HashSet(0);

	public Municipio() {
	}

	public Municipio(Entidad entidad, String cveMun) {
		this.entidad = entidad;
		this.cveMun = cveMun;
	}

	public Municipio(Entidad entidad, String cveMun, String nomMun, String cveCab, String nomCab, Set colonias) {
		this.entidad = entidad;
		this.cveMun = cveMun;
		this.nomMun = nomMun;
		this.cveCab = cveCab;
		this.nomCab = nomCab;
		this.colonias = colonias;
	}

	public Integer getMunId() {
		return this.munId;
	}

	public void setMunId(Integer munId) {
		this.munId = munId;
	}

	public Entidad getEntidad() {
		return this.entidad;
	}

	public void setEntidad(Entidad entidad) {
		this.entidad = entidad;
	}

	public String getCveMun() {
		return this.cveMun;
	}

	public void setCveMun(String cveMun) {
		this.cveMun = cveMun;
	}

	public String getNomMun() {
		return this.nomMun;
	}

	public void setNomMun(String nomMun) {
		this.nomMun = nomMun;
	}

	public String getCveCab() {
		return this.cveCab;
	}

	public void setCveCab(String cveCab) {
		this.cveCab = cveCab;
	}

	public String getNomCab() {
		return this.nomCab;
	}

	public void setNomCab(String nomCab) {
		this.nomCab = nomCab;
	}

	public Set getColonias() {
		return this.colonias;
	}

	public void setColonias(Set colonias) {
		this.colonias = colonias;
	}

}
