package com.example.sample1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.sample1.Entity.Student;


@Repository

public interface StudentRepository extends JpaRepository<Student,Integer> {
	
	public java.util.List<Student> findAll();

	public Student findByName(String name);

	public Student findByAge(int age);

	
	
	}
