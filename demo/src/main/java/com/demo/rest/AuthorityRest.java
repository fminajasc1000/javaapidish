package com.demo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.dao.AuthorityDAO;
import com.demo.model.Authority;

/*
 * Clase para generar las ligas de comunicacion rest
 * @Version 1.0 08/05/2021
 * @author Francisco Minajas
 * 
 * */
@RestController
@RequestMapping("authority")
public class AuthorityRest {
	@Autowired
	private AuthorityDAO authorityDAO; // Inyeccion de dependencias
	
	//METODOS HTTP - SOLICITUD AL SERVIDOR
	/*
	 * Genera el metodo para almacenar informacion en la base de datos
	 * @param RequestBody contiene el JSON de la información de la clase proyecto
	 * */
	@PostMapping("/guardar")
	public void guardar(@RequestBody Authority authority) {
		authorityDAO.save(authority);
	}
	
	/*
	 * Lista la información almacenada en la base de datos de la clase proyecto
	 * @return un listado de todo el contenido de la tabla proyecto
	 * */
	
	@GetMapping("/listar")
	public List<Authority> listar(){
		return authorityDAO.findAll();
	}
	
	/*
	 * Elimina un registro del tipo persona, por id
	 * @param Integer id
	 * */
	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable("id") Integer id) {
		authorityDAO.deleteById(id);
	}
	
	/*
	 * Actualiza la informacion del objeto proyecto
	 * @param Proyecto 
	 * */
	@PutMapping("/actualizar")
	public void actualizar(@RequestBody Authority authority) {
		authorityDAO.save(authority);
	}
}