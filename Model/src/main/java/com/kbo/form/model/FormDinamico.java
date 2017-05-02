package com.kbo.form.model;
// Generated 23/04/2017 04:07:46 PM by Hibernate Tools 4.0.0.Final

import java.util.HashSet;
import java.util.Set;

/**
 * FormDinamico generated by hbm2java
 */
public class FormDinamico implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer forId;
	private String forDesc;
	private String forDinamicocol;
	private Set seccionForms = new HashSet(0);

	public FormDinamico() {
	}

	public FormDinamico(String forDesc, String forDinamicocol, Set seccionForms) {
		this.forDesc = forDesc;
		this.forDinamicocol = forDinamicocol;
		this.seccionForms = seccionForms;
	}

	public Integer getForId() {
		return this.forId;
	}

	public void setForId(Integer forId) {
		this.forId = forId;
	}

	public String getForDesc() {
		return this.forDesc;
	}

	public void setForDesc(String forDesc) {
		this.forDesc = forDesc;
	}

	public String getForDinamicocol() {
		return this.forDinamicocol;
	}

	public void setForDinamicocol(String forDinamicocol) {
		this.forDinamicocol = forDinamicocol;
	}

	public Set getSeccionForms() {
		return this.seccionForms;
	}

	public void setSeccionForms(Set seccionForms) {
		this.seccionForms = seccionForms;
	}

}