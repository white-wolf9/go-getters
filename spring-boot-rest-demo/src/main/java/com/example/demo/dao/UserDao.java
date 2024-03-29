package com.example.demo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entity.User;
import com.example.demo.responseobjects.Status;

@Component
public class UserDao {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Autowired
	Status status_response;

	public Status addUser (User user) {
		/*
		 * persist only inserts
		 * merge returns update entity
		 */
		User user_response = entityManager.merge(user);
		
		status_response.setId(user_response.getId());
		status_response.setMessage("Your membership was successfully confirmed!");
		
        return status_response;
	}
	
	public User fetchByEmail(String email) {
		User user = (User) entityManager.createQuery("select u from User as u where email= :em").setParameter("em", email).getSingleResult();
		System.out.println(user);
		return user; 
	}
}
