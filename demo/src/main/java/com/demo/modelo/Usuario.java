package com.demo.modelo;

import javax.persistence.*;

/*
 * Clase para la defincion de la tabla usuario
 * @Version 1.0 08/05/2021
 * @author Francisco Minajas
 * 
 * */
@Entity
public class Usuario{
	@Id
	private String id;
	@Column
	private String nombre;
	@Column
    private String project;
	@Column
    private String descripcion;
	@Column
    private String desarrollador1;
	@Column
    private String desarrollador2;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
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
	@Override
	public String toString() {
		return "User [id=" + id + ", nombre=" + nombre + ", project=" + project + ", descripcion="
				+ descripcion + ", desarrollador1=" + desarrollador1 + ", desarrollador2=" + desarrollador2 + "]";
	}
	public Usuario(String id, String nombre, String project, String descripcion, String desarrollador1,
			String desarrollador2) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.project = project;
		this.descripcion = descripcion;
		this.desarrollador1 = desarrollador1;
		this.desarrollador2 = desarrollador2;
	}
	public Usuario() {
	}
	
	//getters and setters
	
	
}
