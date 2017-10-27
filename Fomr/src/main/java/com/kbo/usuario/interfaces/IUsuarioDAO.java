package com.kbo.usuario.interfaces;

import com.kbo.form.interfaces.IBaseServiceDAO;
import com.kbo.model.Usuario;

/**
 * @author Giovanni
 *
 */
public interface IUsuarioDAO {

	/**
	 * Busca usuari por Id
	 * 
	 * @return
	 */
	Usuario getUsuById();

	/**
	 * Valida Login
	 * @param usuario
	 * @return
	 */
	Usuario findLogin(Usuario usuario);
}
