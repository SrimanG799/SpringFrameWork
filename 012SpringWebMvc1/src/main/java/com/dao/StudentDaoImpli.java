package com.dao;

import java.util.List;

import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.model.Student;
@Repository
@Transactional
public class StudentDaoImpli implements StudentDao{
	
	@Autowired
HibernateTemplate hibernateTemplate;
	@Override
	public void insert(Student student) {
		// TODO Auto-generated method stub
		hibernateTemplate.save(student);
		
	}

	@Override
	public void update(Student student) {
		// TODO Auto-generated method stub
		hibernateTemplate.update(student);
		
	}

	@Override
	public Student getbyId(Integer id) {
		// TODO Auto-generated method stub
		return hibernateTemplate.get(Student.class, id);
		
	}

	@Override
	public List<Student> getAll() {
		// TODO Auto-generated method stub
		return hibernateTemplate.loadAll(Student.class);
	}

}
