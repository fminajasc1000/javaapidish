package com.demo.modeloDAO;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.interfaces.UsuarioInterface;
import com.demo.modelo.Usuario;

/*
 * Clase JPA
 * @Version 1.0 08/05/2021
 * @author Francisco Minajas
 * 
 * */
@Repository
public class UsuarioDAO implements UsuarioInterface {
	
	@Autowired
	JdbcTemplate template;

	@Override
	public List<Map<String, Object>> listar() {
		// TODO Auto-generated method stub
		List<Map<String, Object>> lista = template.queryForList("select * from usuario");
		return lista;
	}

	@Override
	public List<Map<String, Object>> listar(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int add(Usuario a) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO usuario (id, desarrollador1, desarrollador2, descripcion,"
				+ " nombre, project) VALUES ('"+a.getId()+"', '"+a.getDesarrollador1()+"', "
						+ "'"+a.getDesarrollador2()+"', '"+a.getDescripcion()+"', '"+a.getNombre()+"', "
								+ "'"+a.getProject()+"');";
		System.out.println("DAO"+a.toString());
		System.out.println(sql);
		template.update(sql);
		return template.update(sql);
	}

	@Override
	public int edit(Usuario a) {
		// TODO Auto-generated method stub
		String sql = "UPDATE usuario SET desarrollador1='"+a.getDesarrollador1()+"', "
				+ "desarrollador2='"+a.getDesarrollador2()+"', descripcion='"+a.getDesarrollador2()+"',"
						+ " nombre='"+a.getNombre()+"', project='"+a.getProject()+"' "
								+ "WHERE  id='"+a.getId()+"';";
		System.out.println("DAO"+a.toString());
		System.out.println(sql);
		template.update(sql);
		return template.update(sql);
	}

	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		String sql = "DELETE FROM usuario WHERE  id='"+id+"';";
		System.out.println(sql);
		return template.update(sql);
	}

}
