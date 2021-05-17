package com.demo.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.interfaces.UsuarioInterface;
import com.demo.modelo.Usuario;
import com.demo.modeloDAO.UsuarioDAO;

@Service
public class UsuarioService implements UsuarioInterface {
	
	@Autowired
	UsuarioDAO usuario;

	@Override
	public List<Map<String, Object>> listar() {
		// TODO Auto-generated method stub
		return usuario.listar();
	}

	@Override
	public List<Map<String, Object>> listar(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int add(Usuario a) {
		// TODO Auto-generated method stub
		System.out.println("SERVICE"+a.toString());
		return usuario.add(a);
	}

	@Override
	public int edit(Usuario a) {
		// TODO Auto-generated method stub
		return usuario.edit(a);
	}

	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		return usuario.delete(id);
	}
	
}
