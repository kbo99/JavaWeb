package com.kbo.model;
// Generated 23/04/2017 04:07:46 PM by Hibernate Tools 4.0.0.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Grupo generated by hbm2java
 */
public class Grupo implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer grpId;
	private String grpNombre;
	private String grpDesc;
	private Character grpEstatus;
	private Set usuGrupos = new HashSet(0);

	public Grupo() {
	}

	public Grupo(String grpNombre) {
		this.grpNombre = grpNombre;
	}

	public Grupo(String grpNombre, String grpDesc, Character grpEstatus, Set usuGrupos) {
		this.grpNombre = grpNombre;
		this.grpDesc = grpDesc;
		this.grpEstatus = grpEstatus;
		this.usuGrupos = usuGrupos;
	}

	public Integer getGrpId() {
		return this.grpId;
	}

	public void setGrpId(Integer grpId) {
		this.grpId = grpId;
	}

	public String getGrpNombre() {
		return this.grpNombre;
	}

	public void setGrpNombre(String grpNombre) {
		this.grpNombre = grpNombre;
	}

	public String getGrpDesc() {
		return this.grpDesc;
	}

	public void setGrpDesc(String grpDesc) {
		this.grpDesc = grpDesc;
	}

	public Character getGrpEstatus() {
		return this.grpEstatus;
	}

	public void setGrpEstatus(Character grpEstatus) {
		this.grpEstatus = grpEstatus;
	}

	public Set getUsuGrupos() {
		return this.usuGrupos;
	}

	public void setUsuGrupos(Set usuGrupos) {
		this.usuGrupos = usuGrupos;
	}

}
