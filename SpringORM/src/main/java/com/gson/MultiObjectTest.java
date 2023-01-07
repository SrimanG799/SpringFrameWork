package com.gson;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ciq.controller.EmpController;
import com.ciq.model.Employee;
import com.google.gson.Gson;


public class MultiObjectTest {
	public static void main(String[] args) {
		
	

	ApplicationContext apc=new ClassPathXmlApplicationContext("springOrm.xml");
	
	EmpController empController=(EmpController) apc.getBean("empcntr");
	List<Employee> emplist=empController.findAll();

	Gson json=new Gson();
	try {
		PrintWriter pw=new PrintWriter("MultiLineEmp2.json");
		
		
		for (Employee employee : emplist) {
			json.toJson(employee,pw.append("\n"));
		}
	pw.flush();
	pw.close();
		
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}

	