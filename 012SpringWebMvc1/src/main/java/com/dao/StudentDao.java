package com.dao;

import java.util.List;

import com.model.Student;

public interface StudentDao {
	
	void insert(Student student);
	
	void update(Student student);
	
	Student getbyId(Integer id);
	
	List<Student> getAll();

}
