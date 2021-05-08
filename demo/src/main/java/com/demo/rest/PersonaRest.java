package com.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.dao.PersonaDAO;
import com.demo.model.Persona;

@RestController
@RequestMapping("personas")
public class PersonaRest {
	
	//inyeccion de dependencias
	@Autowired
	private PersonaDAO personaDAO;
	
	//METODOS HTTP - SOLICITUD AL SERVIDOR
	
	/* 
	 * Definicion post
	 * localhost:8080/personas/guardar
	 * @RequestBody JAVA TO JSON
	 * 
	 * */
	@PostMapping("/guardar")
	public void guardar(@RequestBody Persona persona) {
		personaDAO.save(persona);
	}
}
