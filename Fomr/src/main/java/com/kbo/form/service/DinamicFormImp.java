package com.kbo.form.service;

import java.util.List;

import com.kbo.form.interfaces.IDinamicForm;
import com.kbo.form.interfaces.IFormDao;
import com.kbo.form.vo.FormVO;

/**
 * 
 * @author gdejesus
 *
 */
public class DinamicFormImp implements IDinamicForm {

	private IFormDao formDAO;
	
	/**
	 * @param formDAO the formDAO to set
	 */
	public void setFormDAO(IFormDao formDAO) {
		this.formDAO = formDAO;
	}

	public FormVO findFormVO(Integer frmId, List<String> group) {
		FormVO formVO = new FormVO();
		
		return formVO;
	}

}
