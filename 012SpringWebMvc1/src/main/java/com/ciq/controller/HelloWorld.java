package com.ciq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//@Controller 
public class HelloWorld {
	@RequestMapping("/hello")
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
		return new ModelAndView("Shan");
	}
	

}
