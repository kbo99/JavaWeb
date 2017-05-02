package com.kbo.model;
// Generated 23/04/2017 04:07:46 PM by Hibernate Tools 4.0.0.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Entidad generated by hbm2java
 */
public class Entidad implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String entId;
	private String entNom;
	private int paiId;
	private String entAbr;

	public Entidad() {
	}

	public Entidad(String entId, int paiId) {
		this.entId = entId;
		this.paiId = paiId;
	}

	public Entidad(String entId, String entNom, int paiId, String entAbr, Set municipios) {
		this.entId = entId;
		this.entNom = entNom;
		this.paiId = paiId;
		this.entAbr = entAbr;
	}

	public String getEntId() {
		return this.entId;
	}

	public void setEntId(String entId) {
		this.entId = entId;
	}

	public String getEntNom() {
		return this.entNom;
	}

	public void setEntNom(String entNom) {
		this.entNom = entNom;
	}

	public int getPaiId() {
		return this.paiId;
	}

	public void setPaiId(int paiId) {
		this.paiId = paiId;
	}

	public String getEntAbr() {
		return this.entAbr;
	}

	public void setEntAbr(String entAbr) {
		this.entAbr = entAbr;
	}

}