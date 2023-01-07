package com.spring.bean;

public class Employee {
	private int empid;
	private String campany;
	private String name;
	private double salary;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(int empid, String campany, String name, double salary) {
		super();
		this.empid = empid;
		this.campany = campany;
		this.name = name;
		this.salary = salary;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getCampany() {
		return campany;
	}
	public void setCampany(String campany) {
		this.campany = campany;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", campany=" + campany + ", name=" + name + ", salary=" + salary + "]";
	}
}
	
	