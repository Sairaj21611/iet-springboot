package com.demo.beans;

import java.sql.Date;
import java.time.LocalDate;

public class Product {
	private int pid;
	private String pname;
	private int qty;
	private double price;
	private LocalDate pdate;
	
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(int pid, String pname, int qty, double price, LocalDate pdate) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.qty = qty;
		this.price = price;
		this.pdate = pdate;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
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

	public LocalDate getPdate() {
		return pdate;
	}

	public void setPdate(LocalDate pdate) {
		this.pdate = pdate;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", qty=" + qty + ", price=" + price + ", pdate=" + pdate
				+ "]";
	}
	
	
	
	
}


