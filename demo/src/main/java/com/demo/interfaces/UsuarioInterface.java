package com.demo.interfaces;

import java.util.List;
import java.util.Map;

import com.demo.modelo.Usuario;

public interface UsuarioInterface {
	public List<Map<String,Object>>listar();
	public List<Map<String,Object>>listar(String id);
	public int add(Usuario a);
	public int edit(Usuario a);
	public int delete(String id);
}
