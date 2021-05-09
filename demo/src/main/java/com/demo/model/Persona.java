package com.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
/*
 * Clase para definicion de la tabla persona, asi como de sus atributos
 * @Version 1.0 08/05/2021
 * @author Francisco Minajas
 * 
 * */
@Entity
public class Persona {
	@Id
	@GeneratedValue
	private Integer idPersona;
	@Column
	private String nombre;
	@Column
	private String apellidop;
	@Column
	private String apellidom;
	@Column
	private Integer tipo;
	@Column
	private String username;
	@Column
	private String password;
	public Integer getIdPersona() {
		return idPersona;
	}
	public void setIdPersona(Integer idPersona) {
		this.idPersona = idPersona;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidop() {
		return apellidop;
	}
	public void setApellidop(String apellidop) {
		this.apellidop = apellidop;
	}
	public String getApellidom() {
		return apellidom;
	}
	public void setApellidom(String apellidom) {
		this.apellidom = apellidom;
	}
	public Integer getTipo() {
		return tipo;
	}
	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
