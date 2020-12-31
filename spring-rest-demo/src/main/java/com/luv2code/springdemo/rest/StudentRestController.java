package com.luv2code.springdemo.rest;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.springdemo.entity.Student;

@RestController
@RequestMapping("/api")
public class StudentRestController {
	private List<Student> theStudents;

	@PostConstruct
	public void loadData() {
		theStudents = new ArrayList<>();
		theStudents.add(new Student("Thasir", "Ahmed"));
		theStudents.add(new Student("Jimothy", "Timothy"));
		theStudents.add(new Student("Jim", "Bob"));
	}

	@GetMapping("/students")
	public List<Student> getStudents() {

		return theStudents;
	}

	@GetMapping("/students/{studentId}")
	public Student getStudent(@PathVariable int studentId) {

		return theStudents.get(studentId);
	}
}
