package com.spring.model;

public class Employee {
	private int eid;
	private String name;
	private double salary;
	private String roll;
	private Address address;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Employee(int eid, String name, double salary, String roll, Address address) {
		super();
		this.eid = eid;
		this.name = name;
		this.salary = salary;
		this.roll = roll;
		this.address = address;
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getRoll() {
		return roll;
	}
	public void setRoll(String roll) {
		this.roll = roll;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", salary=" + salary + ", roll=" + roll + ", address="
				+ address + "]";
	}
	
	

}
