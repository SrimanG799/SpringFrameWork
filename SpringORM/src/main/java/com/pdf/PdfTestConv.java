package com.pdf;

import java.io.FileOutputStream;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ciq.controller.EmpController;
import com.ciq.model.Employee;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class PdfTestConv {
	public static void main(String[] args) {
		
ApplicationContext apc=new ClassPathXmlApplicationContext("springOrm.xml");
		
		EmpController empController=(EmpController) apc.getBean("empcntr");
		//Employee emp=empController.getById(4);
		List<Employee> employee=empController.findAll();
		
		System.out.println(employee);
		
		Document doc=new Document(PageSize.A4);
		
	//	doc.newPage();
		
		
		
		try {
			PdfWriter pdfw=PdfWriter.getInstance(doc, new FileOutputStream("employetotable.pdf"));
			System.out.println("pdf created");
			
			doc.open();
			for (Employee emp : employee) {
				
				
				
			
			doc.add(new Paragraph(emp.getEmpid()+" "+emp.getName()+" "+emp.getCampany()+" "+emp.getRoll()+" "+emp.getSalary()));
			

			
		
			
			}
		}
			catch (Exception e) {
			
		
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			doc.close();
		}
		
	}
	}



