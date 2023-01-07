package com.ciq.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;

@Entity
@Table
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="tid")
	Integer empid;
	@Column(name="tname")
	String name;
@Column(name="troll")
	String roll;
	@Column(name="tcompany")
	String campany;
	@Column(name="tsalary")
	double salary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(Integer empid, String name, String roll, String campany, double salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.roll = roll;
		this.campany = campany;
		this.salary = salary;
	}
	public Integer getEmpid() {
		return empid;
	}
	public void setEmpid(Integer empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRoll() {
		return roll;
	}
	public void setRoll(String roll) {
		this.roll = roll;
	}
	public String getCampany() {
		return campany;
	}
	public void setCampany(String campany) {
		this.campany = campany;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", roll=" + roll + ", campany=" + campany + ", salary="
				+ salary + "]";
	}
	
	

}
