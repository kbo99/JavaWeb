package com.kbo.hibernate;

import java.io.Serializable;

import org.hibernate.exception.ConstraintViolationException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import com.kbo.form.interfaces.IBaseServiceDAO;;

/**
 * 
 * @author Giovanni
 *
 */
public class BaseServiceDao  extends HibernateDaoSupport implements IBaseServiceDAO {

    /**
     * @see com.intercam.dao.interfaces.IBaseServiceDAO#store(java.lang.Object)
     */
	@Transactional(readOnly = false)
    public Serializable store(Object object) {
        try {
        	getHibernateTemplate().setCheckWriteOperations(false);
            return getHibernateTemplate().save(object);
        } catch (DataIntegrityViolationException  e) {
            throw  getConstraintException(e.getCause());
        }
    }

    /**
     * @see com.intercam.dao.interfaces.IBaseServiceDAO#update(java.lang.Object)
     */
    public void update(Object object) {
        try {
        	getHibernateTemplate().setCheckWriteOperations(false);
            getHibernateTemplate().update(object);
        } catch (DataIntegrityViolationException  e) {
            throw  getConstraintException(e.getCause());
        }
    }

    /**
     * @see com.intercam.dao.interfaces.IBaseServiceDAO#delete(java.lang.Object)
     */
    public void delete(Object object) {
        try {
        	getHibernateTemplate().setCheckWriteOperations(false);
            getHibernateTemplate().delete(object);
        } catch (DataIntegrityViolationException  e) {
            throw  getConstraintException(e.getCause());
        }
    }

    /**
     * @see com.intercam.dao.interfaces.IBaseServiceDAO#saveOrUpdate(java.lang.Object)
     */
    public void saveOrUpdate(Object object) {
        try {
        	getHibernateTemplate().setCheckWriteOperations(false);
            getHibernateTemplate().saveOrUpdate(object);
        } catch (DataIntegrityViolationException  e) {
            throw  getConstraintException(e.getCause());
        }
    }

    /**
     *
     * @see com.intercam.dao.interfaces.IBaseServiceDAO#store(java.lang.Object[])
     */
    public Serializable store(Object... lstObjects) {
        return this.store(lstObjects[0]);
    }

    /**
     * @see com.intercam.dao.interfaces.IBaseServiceDAO#update(java.lang.Object[])
     */
    public void update(Object... lstObjects) {
        this.update(lstObjects[0]);
    }


    /**
     * @see com.intercam.dao.interfaces.IBaseServiceDAO#delete(java.lang.Object[])
     */
    public void delete(Object... lstObjects) {
        this.delete(lstObjects[0]);
    }

    /**
     * @see com.intercam.dao.interfaces.IBaseServiceDAO#saveOrUpdate(java.lang.Object[])
     */
    public void saveOrUpdate(Object... lstObjects) {
        this.saveOrUpdate(lstObjects[0]);
    }

    /**
     *
     * @param cause     Causa de la excepcion
     * @return la exception traducida a regresar
     */
    public RuntimeException getConstraintException(Throwable cause) {
        RuntimeException result = new RuntimeException(cause);
        if (cause instanceof ConstraintViolationException) {
            result = new DataIntegrityViolationException(
                    "Constraint : " + ((ConstraintViolationException) cause).getConstraintName(),
                    cause.getCause());
        }
        return result;
    }


}
