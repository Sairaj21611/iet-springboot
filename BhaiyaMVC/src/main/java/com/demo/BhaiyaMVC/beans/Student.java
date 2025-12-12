package com.demo.BhaiyaMVC.beans;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	private int sid;
	private String sname;
	private double marks;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private LocalDate dob;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int sid, String sname, double marks, LocalDate dob) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.marks = marks;
		this.dob = dob;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	public LocalDate getdob() {
		return dob;
	}
	public void setdob(LocalDate dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", marks=" + marks + ", dob=" + dob + "]";
	}

}
