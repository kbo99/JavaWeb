/**
 * 
 */
package com.kbo.form.vo;

import java.util.List;

/**
 * @author Giovanni
 *
 */
public class SeccionVO implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7428575781602511676L;
	
	private Integer secOrder;
	private String secDesc;
	private List<ComponenteVO> listComponenteVO;
	/**
	 * @return the secOrder
	 */
	public Integer getSecOrder() {
		return secOrder;
	}
	/**
	 * @param secOrder the secOrder to set
	 */
	public void setSecOrder(Integer secOrder) {
		this.secOrder = secOrder;
	}
	/**
	 * @return the secDesc
	 */
	public String getSecDesc() {
		return secDesc;
	}
	/**
	 * @param secDesc the secDesc to set
	 */
	public void setSecDesc(String secDesc) {
		this.secDesc = secDesc;
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
