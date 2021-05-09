package com.demo.model;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/*
 * Clase para definir la estructura de la tabla proyecto con hibernet
 * @Version 1.0 08/05/2021
 * @author Francisco Minajas
 * 
 * */

@Entity
public class Proyecto {
	@Id
	@GeneratedValue
	private Integer idProyecto;
	@Column
	private String nombre;
	@Column
	private String descripcion;
	@Column
	private Integer projectManager;
	@Column 
	private ArrayList<Integer> desarrollador;
	
	//getters and setters
	public Integer getIdProyecto() {
		return idProyecto;
	}
	public void setIdProyecto(Integer idProyecto) {
		this.idProyecto = idProyecto;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Integer getProjectManager() {
		return projectManager;
	}
	public void setProjectManager(Integer projectManager) {
		this.projectManager = projectManager;
	}
	public ArrayList<Integer> getDesarrollador() {
		return desarrollador;
	}
	public void setDesarrollador(ArrayList<Integer> desarrollador) {
		this.desarrollador = desarrollador;
	}
	
}
