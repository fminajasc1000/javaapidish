package com.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.model.User;

/*
 * Clase JPA
 * @Version 1.0 08/05/2021
 * @author Francisco Minajas
 * 
 * */
public interface UserDAO extends JpaRepository<User,Integer> {

}