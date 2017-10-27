package com.kbo.service.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kbo.vo.PersonaVO;


/**
 * 
 * @author Giovanni
 *
 */
@RestController
public class UserController {

	public static final String BASE_URL = "user/controller";
	
	@RequestMapping(UserController.BASE_URL)
	public PersonaVO getUser(@RequestParam(value = "user", defaultValue = "Yo") final String user) {
		PersonaVO persona = new PersonaVO();
		persona.setPerNombre(user);
		return persona;
	}
}
