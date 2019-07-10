package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.datatransferobject.UserDTO;
import com.example.demo.responseobjects.Status;
import com.example.demo.services.UserServices;

@RestController
@ComponentScan("com.example")
public class RegisterController {
	
	@Autowired
	UserServices userServ;

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	   public Status register(UserDTO userDTO) {
		
		return userServ.addToDB(userDTO);
	   }
}
