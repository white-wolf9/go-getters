package com.example.demo.services;

import java.util.HashMap;

import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.UserDao;
import com.example.demo.datatransferobject.UserDTO;
import com.example.demo.entity.User;
import com.example.demo.responseobjects.Status;

@Component
public class UserServices {
	
	@Autowired
	UserDao udao;
	
	@Transactional
	public Status addToDB(UserDTO userDTO) {
		
        User user = new User();
        user.setAge(userDTO.getAge());
        user.setEmail(userDTO.getEmail());
        user.setName(userDTO.getName());
        user.setCountry(userDTO.getCountry());
        user.setState(userDTO.getState());
        user.setCity(userDTO.getCity());
		/*
		 * try{ BeanUtils.copyProperties(userDTO,user); } catch(Exception e) {
		 * e.printStackTrace(); }
		 */
        Status status_response = udao.addUser(user);
        
        return status_response;
	}

	public User fetchById(int id) {
		return udao.fetchById(id);
	}
}
