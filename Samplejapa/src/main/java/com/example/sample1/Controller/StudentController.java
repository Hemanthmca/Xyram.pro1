package com.example.sample1.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.sample1.Entity.Student;
import com.example.sample1.Service.StudentService;


@RestController

public class StudentController
{
	@Autowired
	private StudentService service;
	
	@PostMapping("/addStudent")
	public Student addStudent(@RequestBody Student student)
	{
		return service.saveStudent(student);
	}
	
	@GetMapping("/student/{id}")
	public Student findStudentById(@RequestBody int id)
	{
		return service.getStudentById(id);
	}
	
	@GetMapping("/student")
	public List<Student> findStudent(@RequestBody Student student)
	{
		return service.getStudents();
	}
	
	
	
	@PutMapping("/update/{id}")
	public Student updateStudent(@RequestBody Student student)
	{
		return service.saveStudent(student);
	}
	
	@PutMapping("/update")
	public Student updateStudents(@RequestBody Student student)
	{
		return service.saveStudent(student);
		
	}

	@DeleteMapping("/delete/{id}")
	public String deleteStudent(@PathVariable  int id)
	{
		return service.deleteStudent(id);
	}
	
	@DeleteMapping("/delete")
	public String deleteStudents(@PathVariable int id)
	{
		return service.deleteStudent(id);
	}
	
	
}

