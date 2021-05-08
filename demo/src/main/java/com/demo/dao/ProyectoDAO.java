package com.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.model.Proyecto;

public interface ProyectoDAO extends JpaRepository<Proyecto,Integer> {

}
