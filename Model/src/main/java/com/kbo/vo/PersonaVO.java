/**
 * 
 */
package com.kbo.vo;

import java.util.Date;

/**
 * @author Giovanni
 *
 */
public class PersonaVO implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer perId;
	private String perNombre;
	private String perApe;
	private Date perFNac;
	private String perEmail;
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
	/**
	 * @return the perNombre
	 */
	public String getPerNombre() {
		return perNombre;
	}
	/**
	 * @param perNombre the perNombre to set
	 */
	public void setPerNombre(String perNombre) {
		this.perNombre = perNombre;
	}
	/**
	 * @return the perApe
	 */
	public String getPerApe() {
		return perApe;
	}
	/**
	 * @param perApe the perApe to set
	 */
	public void setPerApe(String perApe) {
		this.perApe = perApe;
	}
	/**
	 * @return the perFNac
	 */
	public Date getPerFNac() {
		return perFNac;
	}
	/**
	 * @param perFNac the perFNac to set
	 */
	public void setPerFNac(Date perFNac) {
		this.perFNac = perFNac;
	}
	/**
	 * @return the perEmail
	 */
	public String getPerEmail() {
		return perEmail;
	}
	/**
	 * @param perEmail the perEmail to set
	 */
	public void setPerEmail(String perEmail) {
		this.perEmail = perEmail;
	}

}
