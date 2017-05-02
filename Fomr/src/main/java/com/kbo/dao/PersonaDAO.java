/**
 * 
 */
package com.kbo.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.orm.hibernate4.HibernateCallback;

import com.kbo.form.interfaces.IPersonaDAO;
import com.kbo.hibernate.BaseServiceDao;
import com.kbo.model.Persona;

/**
 * @author Giovanni
 *
 */
public class PersonaDAO extends BaseServiceDao implements IPersonaDAO {

	public Persona findPersonaById(final Integer perId) {
		try {
            return (Persona) getHibernateTemplate().execute(
                    new HibernateCallback<Object>() {
                        public Object doInHibernate(Session s)throws HibernateException {
                            return s.createCriteria(Persona.class)
                            		.add(Restrictions.eq("perId", perId))
                            		.uniqueResult();
                        }
                    });
        } catch (DataIntegrityViolationException  e) {
            throw  getConstraintException(e.getCause());
        }
	}

}
