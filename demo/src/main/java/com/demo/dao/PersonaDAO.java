package com.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.model.Persona;

public interface PersonaDAO extends JpaRepository<Persona,Integer> {

}
