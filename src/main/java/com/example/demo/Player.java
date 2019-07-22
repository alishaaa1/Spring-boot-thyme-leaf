package com.example.demo;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Player {
	@Id
	@GeneratedValue
	long id;
	String name;
	String position;
	
	public Player() {
		super();
	}

	public Player(String name, String position) {
		this();
		this.name = name;
		this.position = position;
	}
	 
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	
}
