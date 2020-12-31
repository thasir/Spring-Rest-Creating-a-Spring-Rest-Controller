package com.luv2code.springdemo.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.springdemo.entity.Student;

@RestController
@RequestMapping("/api")
public class StudentRestController {
	@GetMapping("/students")
	public List<Student> getStudents() {
		List<Student> theStudents = new ArrayList<>();
		theStudents.add(new Student("Thasir", "Ahmed"));
		theStudents.add(new Student("Jimothy", "Timothy"));
		theStudents.add(new Student("Jim", "Bob"));

		return theStudents;

	}
}
