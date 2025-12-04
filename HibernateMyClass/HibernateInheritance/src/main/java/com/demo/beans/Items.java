package com.demo.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Items {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private int qty;
	private double price;
	@OneToOne
	private Cart c;
	
	public Items() {
		super();
	}
	public Items(String name, int qty, double price , Cart c) {
		super();
		this.name = name;
		this.qty = qty;
		this.price = price;
		this.c =c;
	}
	public Items(int id, String name, int qty, double price , Cart c) {
		super();
		this.id = id;
		this.name = name;
		this.qty = qty;
		this.price = price;
		this.c =c;
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
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Items [id=" + id + ", name=" + name + ", qty=" + qty + ", price=" + price +"]";
	}
	
	
}
