package com.demo.BhaiyaMVC.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.BhaiyaMVC.beans.Student;

@Repository
public interface StudentDao extends JpaRepository<Student, Integer> {
	
}
