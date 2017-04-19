/**
 * 
 */
package com.kbo.model.form.vo;

import java.util.List;

/**
 * @author Giovanni
 *
 */
public class GrpComponenteVO implements java.io.Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5881912373484549994L;
	
	private Integer comId;
	private List<ComponenteVO> listComponenteVO;
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
