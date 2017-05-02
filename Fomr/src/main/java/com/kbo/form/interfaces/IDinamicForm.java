/**
 * 
 */
package com.kbo.form.interfaces;

import java.util.List;

import com.kbo.form.vo.FormVO;

/**
 * @author gdejesus
 *
 */
public interface IDinamicForm {

	/**
	 * Busca formulario y filtra campos por permisos
	 * @param frmId id del formulario
	 * @param group lista de permisos del usuario que solicita
	 * @return
	 */
	FormVO findFormVO (Integer frmId, List<String> group);
	
}
