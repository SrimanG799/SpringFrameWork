package com.ciq.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.model.Student;
import com.service.StudentService;

@Controller 
public class HelloWorld {
	@Autowired
	StudentService studentService;
	@RequestMapping("/")
	public ModelAndView display()
	{
		return new ModelAndView("sriman");
		
	}
	
	
	
	
	@RequestMapping("/sri")
	public ModelAndView welcome()
	{
		return new ModelAndView("Hello");
	}
	@RequestMapping("/appli")
	public ModelAndView aplication()
	{
		return new ModelAndView("Form");
	}
	
	@RequestMapping(value="/appliform",method=RequestMethod.POST)
	public String save(Student student)
	{
		studentService.insert(student);
		return "Form";
		
	}
	@RequestMapping("/view")
	public List<Student> getAll()
	{
		return studentService.getAll();
		
	}
}
