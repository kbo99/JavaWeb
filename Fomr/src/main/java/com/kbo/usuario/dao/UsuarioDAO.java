package com.kbo.usuario.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.orm.hibernate4.HibernateCallback;

import com.kbo.hibernate.BaseServiceDao;
import com.kbo.model.Persona;
import com.kbo.model.Usuario;
import com.kbo.usuario.interfaces.IUsuarioDAO;

public class UsuarioDAO extends BaseServiceDao implements IUsuarioDAO {

	public Usuario getUsuById() {


		return null;
	}

	public Usuario findLogin(final Usuario usuario) {

		try {
            return (Usuario) getHibernateTemplate().execute(
                    new HibernateCallback<Object>() {
                        public Object doInHibernate(Session s)throws HibernateException {
                            return s.createCriteria(Usuario.class)
                            		.add(Restrictions.eq("usuUsuario", usuario.getUsuUsuario()))
                            		.add(Restrictions.eq("usuPassword", usuario.getUsuPassword()))
                            		.uniqueResult();
                        }
                    });
        } catch (DataIntegrityViolationException  e) {
            throw  getConstraintException(e.getCause());
        }
	}

}
