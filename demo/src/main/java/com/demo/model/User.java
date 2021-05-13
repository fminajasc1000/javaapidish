package com.demo.model;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.*;

/*
 * Clase para la defincion de la tabla usuario
 * @Version 1.0 08/05/2021
 * @author Francisco Minajas
 * 
 * */
@Entity
public class User implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 202817008551817518L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column
	private String nombre;
	@Column
    private String projectManager;
	@Column
    private String descripcion;
	@Column
    private String desarrollador1;
	@Column
    private String desarrollador2;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getProjectManager() {
		return projectManager;
	}
	public void setProjectManager(String projectManager) {
		this.projectManager = projectManager;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getDesarrollador1() {
		return desarrollador1;
	}
	public void setDesarrollador1(String desarrollador1) {
		this.desarrollador1 = desarrollador1;
	}
	public String getDesarrollador2() {
		return desarrollador2;
	}
	public void setDesarrollador2(String desarrollador2) {
		this.desarrollador2 = desarrollador2;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", nombre=" + nombre + ", projectManager=" + projectManager + ", descripcion="
				+ descripcion + ", desarrollador1=" + desarrollador1 + ", desarrollador2=" + desarrollador2 + "]";
	}
	
	//getters and setters
	
	
}
