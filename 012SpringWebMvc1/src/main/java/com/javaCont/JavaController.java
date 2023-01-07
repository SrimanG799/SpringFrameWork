package com.javaCont;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.model.Student;
import com.service.StudentService;

@Controller("javaC")
public class JavaController {
	@Autowired
	StudentService studentService;
	public void insert(Student student) {
		
	studentService.insert(student);
		
	}
	
	public void update(Student student)
	{
		studentService.update(student);
		
	}
	public Student getById(Integer id)
	{
		return studentService.getbyId(id);
	}
	public List<Student> getAll()
	{
		return studentService.getAll();
	}

}
