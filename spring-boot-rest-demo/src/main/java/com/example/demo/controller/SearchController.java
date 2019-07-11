package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.datatransferobject.UserDTO;
import com.example.demo.entity.User;
import com.example.demo.services.UserServices;

@RestController
@ComponentScan("com.example")
public class SearchController {

	@Autowired
	UserServices userServ;
	
	@RequestMapping(value = "/search", method = RequestMethod.POST)
	public UserDTO showDetails(@RequestBody UserDTO userDTO) {
		User user = userServ.fetchByEmail(userDTO.getEmail());
		UserDTO userDTO_response = new UserDTO();
		userDTO_response.setName(user.getName());
		userDTO_response.setAge(user.getAge());
		userDTO_response.setEmail(user.getEmail());
		userDTO_response.setCountry(user.getCountry());
		userDTO_response.setCity(user.getCity());
		userDTO_response.setState(user.getState());
		return userDTO_response;
				
	}
}
