package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.StudentDao;
import com.model.Student;
@Service
public class StudentServiceImpli implements StudentService{
	@Autowired
StudentDao studentDao;
	@Override
	public void insert(Student student) {
		// TODO Auto-generated method stub
		studentDao.insert(student);
	}

	@Override
	public void update(Student student) {
		// TODO Auto-generated method stub
		studentDao.update(student);
	}

	@Override
	public Student getbyId(Integer id) {
		// TODO Auto-generated method stub
		return studentDao.getbyId(id);
	}

	@Override
	public List<Student> getAll() {
		// TODO Auto-generated method stub
		return studentDao.getAll();
	}

}
