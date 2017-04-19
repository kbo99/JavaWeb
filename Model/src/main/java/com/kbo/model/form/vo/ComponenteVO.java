/**
 * 
 */
package com.kbo.model.form.vo;

import java.util.List;

/**
 * @author Giovanni
 *
 */
public class ComponenteVO implements java.io.Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3255122797713297182L;
	private Integer comId;
	private Integer comTpComponente;
	private String comDesc;
	private Integer comOrden;
	private String bindingVO;
	private String requerid;
	
	


	/**
	 * @return the comId
	 */
	public Integer getComId() {
		return comId;
	}


	/**
	 * @param comId the comId to set
	 */
	public void setComId(Integer comId) {
		this.comId = comId;
	}


	/**
	 * @return the comTpComponente
	 */
	public Integer getComTpComponente() {
		return comTpComponente;
	}


	/**
	 * @param comTpComponente the comTpComponente to set
	 */
	public void setComTpComponente(Integer comTpComponente) {
		this.comTpComponente = comTpComponente;
	}


	/**
	 * @return the comDesc
	 */
	public String getComDesc() {
		return comDesc;
	}


	/**
	 * @param comDesc the comDesc to set
	 */
	public void setComDesc(String comDesc) {
		this.comDesc = comDesc;
	}


	/**
	 * @return the comOrden
	 */
	public Integer getComOrden() {
		return comOrden;
	}


	/**
	 * @param comOrden the comOrden to set
	 */
	public void setComOrden(Integer comOrden) {
		this.comOrden = comOrden;
	}


	/**
	 * @return the bindingVO
	 */
	public String getBindingVO() {
		return bindingVO;
	}


	/**
	 * @param bindingVO the bindingVO to set
	 */
	public void setBindingVO(String bindingVO) {
		this.bindingVO = bindingVO;
	}


	/**
	 * @return the requerid
	 */
	public String getRequerid() {
		return requerid;
	}


	/**
	 * @param requerid the requerid to set
	 */
	public void setRequerid(String requerid) {
		this.requerid = requerid;
	}
}
