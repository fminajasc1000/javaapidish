package com.demo.controlador;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.modelo.Usuario;
import com.demo.service.UsuarioService;

@RestController
@RequestMapping(path = "/usuario")
public class UsuarioController {
	
	@Autowired
	UsuarioService service;
	
	@GetMapping("/listar")
	public List<Map<String, Object>> listar(){
		return service.listar();
	}
	
	@PostMapping("/agregar")
	public String addUsuario(@RequestBody Usuario usuario) {
		System.out.println("Controller"+usuario.toString());
		int r=service.add(usuario);
		if(r==0) {
			return "No se pudo registrar";
		}else {
			return "Exito";
		}
	}
	
	@PostMapping("/actualizar/{id}")
	public String updateUsuario(@RequestBody Usuario usuario, @PathVariable String id) {
		System.out.println("Controller"+usuario.toString());
		usuario.setId(id);
		int r=service.edit(usuario);
		if(r==0) {
			return "No se pudo actualizar";
		}else {
			return "Exito";
		}
	}
	
	@PostMapping("/eliminar/{id}")
	public String eliminarUsuario( @PathVariable String id) {
		int r=service.delete(id);
		if(r==0) {
			return "No se pudo actualizar";
		}else {
			return "Exito";
		}
	}
}
