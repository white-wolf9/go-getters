package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.services.UserServices;

@RestController
@ComponentScan("com.example")
public class SearchController {

	@Autowired
	UserServices userServ;
	
	@RequestMapping(value = "/search", method = RequestMethod.POST)
	public User showDetails(@RequestBody int id) {
		return userServ.fetchById(id);
	}
}
