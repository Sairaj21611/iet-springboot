package com.demo.BhaiyaMVC.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.BhaiyaMVC.beans.Student;
import com.demo.BhaiyaMVC.dao.StudentDao;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	StudentDao sdao;

	@Override
	public List<Student> getAllStudents() {
		List<Student> slist = sdao.findAll();
		return slist;
	}

	@Override
	public void insertStuds(Student s) {
		sdao.save(s);
		
	}
}
