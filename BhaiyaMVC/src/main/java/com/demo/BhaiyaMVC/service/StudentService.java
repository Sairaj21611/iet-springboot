package com.demo.BhaiyaMVC.service;

import java.util.List;

import com.demo.BhaiyaMVC.beans.Student;

public interface StudentService {

	List<Student> getAllStudents();

	void insertStuds(Student s);

}
