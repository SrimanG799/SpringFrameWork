package com.service;

import java.util.List;

import com.model.Student;

public interface StudentService {
void insert(Student student);
	
	void update(Student student);

	Student getbyId(Integer id);
	
	List<Student> getAll();

}
