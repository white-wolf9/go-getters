package com.example.demo.responseobjects;

import org.springframework.stereotype.Component;

@Component
public class Status {

	private int id;
	private String message;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
