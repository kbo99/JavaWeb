/**
 * 
 */
package com.kbo.form.interfaces;

import com.kbo.model.Persona;

/**
 * @author Giovanni
 *
 */
public interface IPersonaDAO {

	/**
	 * Busca Persona por ID
	 * @param perId
	 * @return
	 */
	Persona findPersonaById(Integer perId);
}
