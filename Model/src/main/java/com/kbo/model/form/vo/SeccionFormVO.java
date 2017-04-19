package com.kbo.model.form.vo;

import java.util.List;

/**
 * Relaciona las secciones con el formulario
 * @author Giovanni
 *
 */
public class SeccionFormVO implements java.io.Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5338002429924968529L;
	private Integer secId;
	private Integer FrmId;
	private Integer order;
	private String value;
	private List<ComponenteVO> listComponenteVO;
	
	public SeccionFormVO () {
		this.value = "";
	}
	
	/**
	 * @return the secId
	 */
	public Integer getSecId() {
		return secId;
	}
	/**
	 * @param secId the secId to set
	 */
	public void setSecId(Integer secId) {
		this.secId = secId;
	}
	/**
	 * @return the frmId
	 */
	public Integer getFrmId() {
		return FrmId;
	}
	/**
	 * @param frmId the frmId to set
	 */
	public void setFrmId(Integer frmId) {
		FrmId = frmId;
	}
	/**
	 * @return the order
	 */
	public Integer getOrder() {
		return order;
	}
	/**
	 * @param order the order to set
	 */
	public void setOrder(Integer order) {
		this.order = order;
	}
	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}
	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}
	/**
	 * @return the listComponenteVO
	 */
	public List<ComponenteVO> getListComponenteVO() {
		return listComponenteVO;
	}
	/**
	 * @param listComponenteVO the listComponenteVO to set
	 */
	public void setListComponenteVO(List<ComponenteVO> listComponenteVO) {
		this.listComponenteVO = listComponenteVO;
	}
	
	
}
