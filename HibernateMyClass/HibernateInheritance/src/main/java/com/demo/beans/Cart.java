package com.demo.beans;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Cart {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	@OneToOne(fetch = FetchType.LAZY , mappedBy = "c" )
	Items i;
	
	@Override
	public String toString() {
		return "Cart [id=" + id + ", name=" + name + "]";
	}
	public Cart() {
		super();
	}
	public Cart(String name) {
		super();
		this.name = name;
	}
	public Cart(int id, String name) {
		super();
		this.id = id;
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
