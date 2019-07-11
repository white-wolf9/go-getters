package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table(name="TBL_BOOT_USER")
public class User {

	@Id
	@GeneratedValue
	@Column(name="U_ID")
	private int Id;
	@Column(name="NAME")
	private String name;
	@Column(name="AGE")
	private int age;
	@Column(name="EMAIL")
	private String email;
	@Column(name="COUNTRY")
	private String country;
	@Column(name="STATE")
	private String state;
	@Column(name="CITY")
	private String city;
	
	@Override
	public String toString() {
		return "User [Id=" + Id + ", name=" + name + ", age=" + age + ", email=" + email + ", country=" + country
				+ ", state=" + state + ", city=" + city + "]";
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
