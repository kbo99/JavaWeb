package com.kbo.model;
// Generated 23/04/2017 04:07:46 PM by Hibernate Tools 4.0.0.Final

import java.util.Date;

/**
 * DocDat generated by hbm2java
 */
public class DocDat implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer docId;
	private Integer perId;
	private Persona persona;
	private Date docFalta;
	private String docCedula;
	private Character docEstatus;

	public DocDat() {
	}

	public DocDat(Persona persona, Date docFalta) {
		this.persona = persona;
		this.docFalta = docFalta;
	}

	public DocDat(Persona persona, Date docFalta, String docCedula, Character docEstatus) {
		this.persona = persona;
		this.docFalta = docFalta;
		this.docCedula = docCedula;
		this.docEstatus = docEstatus;
	}

	public Integer getDocId() {
		return this.docId;
	}

	public void setDocId(Integer docId) {
		this.docId = docId;
	}

	/**
	 * @return the perId
	 */
	public Integer getPerId() {
		return perId;
	}

	/**
	 * @param perId the perId to set
	 */
	public void setPerId(Integer perId) {
		this.perId = perId;
	}

	public Persona getPersona() {
		return this.persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public Date getDocFalta() {
		return this.docFalta;
	}

	public void setDocFalta(Date docFalta) {
		this.docFalta = docFalta;
	}

	public String getDocCedula() {
		return this.docCedula;
	}

	public void setDocCedula(String docCedula) {
		this.docCedula = docCedula;
	}

	public Character getDocEstatus() {
		return this.docEstatus;
	}

	public void setDocEstatus(Character docEstatus) {
		this.docEstatus = docEstatus;
	}

}
