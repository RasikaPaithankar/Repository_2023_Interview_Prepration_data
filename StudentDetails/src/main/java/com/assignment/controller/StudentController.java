package com.assignment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.assignment.Entity.Student;
import com.assignment.RepositoryInterface.StudentRepository;

@Controller
@RequestMapping(path = "/demo")
public class StudentController {

	@Autowired
	StudentRepository studentRepository;

	@PostMapping(path = "/add")
	public @ResponseBody String addNewUser(@RequestParam String name, @RequestParam String email) {

		Student s = new Student();
		s.setName("abc");
		s.setAge(1);
		s.setAddress("dwbka");
		studentRepository.save(s);
		return "Saved";
	}

	@GetMapping(path = "/all")
	public @ResponseBody Iterable<Student> getAllUsers() {
		// This returns a JSON or XML with the users
		return studentRepository.findAll();
	}
}
