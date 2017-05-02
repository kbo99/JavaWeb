/**
 * 
 */
package com.kbo.model.Fomr;

import java.util.Date;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kbo.dao.PersonaDAO;
import com.kbo.form.interfaces.IPersonaDAO;
import com.kbo.model.Persona;

/**
 * @author Giovanni
 *
 */
public class MainTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContextBean.xml");
		
		IPersonaDAO personDAO = context.getBean(PersonaDAO.class);
		
//		Persona person = new Persona();
//		person.setPerNombre("Pankaj");
//		person.setPerAppaterno("asdasd");
//		person.setPerFalta(new Date());
//		
//		personDAO.store(person);
		
		Persona per = personDAO.findPersonaById(1);
		
		System.out.println(per);
		
	}

}
