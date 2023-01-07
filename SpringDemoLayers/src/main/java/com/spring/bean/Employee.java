package com.spring.bean;

public class Employee {
	private int eid;
	private String name;
	private String dept;
	private double salary;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(int eid, String name, String dept, double sa) {
		super();
		this.eid = eid;
		this.name = name;
		this.dept = dept;
		this.salary= salary;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", dept=" + dept + ", salary=" + salary + "]";
	}
	

}
