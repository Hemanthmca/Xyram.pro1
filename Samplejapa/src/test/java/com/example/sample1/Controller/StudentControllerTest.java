package com.example.sample1.Controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.sample1.Entity.Student;
import com.example.sample1.Repository.StudentRepository;
import com.example.sample1.Service.StudentService;

@SpringBootTest
class StudentControllerTest {
	
	@InjectMocks
	private StudentController studentController;
	
	@Mock
	StudentService studentService;
	
	@Mock
	private StudentRepository repository;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testAddStudent() 
	   {
		  Student student = new Student();
		  student.setName("manu");
		  student.setId(12);
		  student.setAge(24);
		  Mockito.when(studentController.addStudent(student)).thenReturn(student);
		  assertNotNull(student);
	    }
	
	@Test
	void testFindStudentById() throws Exception
	{
		Student student = new Student();
		student.setId(3);
		Mockito.when(repository.findById(3)).thenReturn(null);
		Student s = studentService.getStudentById(3);
		assertNotSame(s,student.getId());
		
	}

	@Test
	void testUpdateStudent() 
	  {
		  Student s = new Student();
		  s.setId(4);
		  s.setName("loki");
		  s.setAge(23);
		 
	      Mockito.when(repository.save(s)).thenReturn(s);
		  studentService.updateStudent(s);
		  assertNotNull(s);
	   }

	@Test
	void testDeleteStudent() 
	{
		try
		{
		studentController.deleteStudent(2);
	    }
		catch(Exception e)
		{
			e.printStackTrace();
		}
		

	}
}