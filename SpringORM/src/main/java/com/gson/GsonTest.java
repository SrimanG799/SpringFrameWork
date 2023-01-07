package com.gson;

import java.io.FileWriter;
import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ciq.controller.EmpController;
import com.ciq.model.Employee;
import com.google.gson.Gson;

public class GsonTest {
	public static void main(String[] args) {
ApplicationContext apc=new ClassPathXmlApplicationContext("springOrm.xml");
		
		EmpController empController=(EmpController) apc.getBean("empcntr");
		Employee emp=empController.getById(4);
		System.out.println(emp);
		Gson json=new Gson();
		String js=json.toJson(emp);
		try {
			FileWriter writer=new FileWriter("EmpJsonSingle.json");
			writer.write(js);
			writer.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
