package com.greatlearning.studentapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/students")
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/list") // serve the URL /students/list
	public String listStudents( Model model ) {
		List<Student> students = studentService.findAll();
		
		model.addAttribute("students", students);
		
		return "list-students";
	}
}