package com.demo.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Sports {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	public Sports() {
		super();
	}
	public Sports(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Sports(String name) {
		super();
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
