package com.example.sample1.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sample1.Entity.Student;
import com.example.sample1.Repository.StudentRepository;

import antlr.collections.List;

@Service

public class StudentService {
	@Autowired
	private StudentRepository repository;
	
	public Student saveStudent(Student student)
	{
		return repository.save(student);
	}
	
	public Student saveStudents(Student students)
	{
		return repository.save(students);
		
	}

	
	public java.util.List<Student> getStudents()
	{
		return repository.findAll();
	}
	
	public Student getStudentById(int id)
	{
		
		return repository.findById(id).orElse(null);
	}
	
	public Student getStudentByName(String name)
	{
		return repository.findByName(name);
	}
	
	public Student getStudenByAge(int age)
	{
		return repository.findByAge(age);
	}
	
	public String deleteStudent(int id)
	{
		repository.deleteById(id);
		return "student removed !! "+id;
	}
	
	
	public Student updateStudent(Student student)
	{
		Student existingStudent = repository.findById(student.getId()).orElse(null);
		existingStudent.setName(student.getName());
		existingStudent.setAge(student.getAge());
		return student;
		
	}

	public Student createStudent(Student student) {
		
		return student;
	}
}
