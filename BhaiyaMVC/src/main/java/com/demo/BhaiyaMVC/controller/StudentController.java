package com.demo.BhaiyaMVC.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.demo.BhaiyaMVC.beans.Student;
import com.demo.BhaiyaMVC.service.StudentService;

@Controller
@RequestMapping("/student")
public class StudentController {

	@Autowired
	StudentService sservice;

	@GetMapping("/allstudents")
	public ModelAndView getAllStudent() {
		List<Student> slist = sservice.getAllStudents();

		return new ModelAndView("showstudent", "slist", slist);

	}

	@GetMapping("/addstudent")
	public String addStudent(Model m) {
		m.addAttribute("student", new Student());
		return "insertstudent";

	}
	
	@PostMapping("/insertstudent")
	public ModelAndView insertStud(@ModelAttribute Student s) {
		
		sservice.insertStuds(s);
		
		return new ModelAndView("redirect:/student/allstudents");
		
	}

}
