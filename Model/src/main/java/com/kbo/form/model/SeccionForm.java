package com.kbo.form.model;
// Generated 23/04/2017 04:07:46 PM by Hibernate Tools 4.0.0.Final

import java.util.HashSet;
import java.util.Set;

/**
 * SeccionForm generated by hbm2java
 */
public class SeccionForm implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer scfId;
	private Integer forId;
	private Integer scfDesc;
	private int scfOrden;
	private Set seccions = new HashSet(0);

	public SeccionForm() {
	}

	public Integer getScfId() {
		return this.scfId;
	}

	public void setScfId(Integer scfId) {
		this.scfId = scfId;
	}

	/**
	 * @return the forId
	 */
	public Integer getForId() {
		return forId;
	}

	/**
	 * @param forId the forId to set
	 */
	public void setForId(Integer forId) {
		this.forId = forId;
	}

	public Integer getScfDesc() {
		return this.scfDesc;
	}

	public void setScfDesc(Integer scfDesc) {
		this.scfDesc = scfDesc;
	}

	public int getScfOrden() {
		return this.scfOrden;
	}

	public void setScfOrden(int scfOrden) {
		this.scfOrden = scfOrden;
	}

	public Set getSeccions() {
		return this.seccions;
	}

	public void setSeccions(Set seccions) {
		this.seccions = seccions;
	}

}
