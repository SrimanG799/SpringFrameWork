package com.spring.model;

public class Student {
	private int sid;
	private String name;
	private String branch;
	private Address address;
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(int sid, String name, String branch, Address address) {
		super();
		this.sid = sid;
		this.name = name;
		this.branch = branch;
		this.address = address;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", branch=" + branch + ", address=" + address + "]";
	}

	
}
