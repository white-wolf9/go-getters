package com.example.demo.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ComponentScan("com.example")
public class HelloController {
	
	@RequestMapping(value = "/hello")
	   public String hello() {
	      return "Hello World";
	   }

}
