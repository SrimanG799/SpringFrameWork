package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {
	@Id
	//@GeneratedValue(strategy = )
	@Column(name = "id")
int sid;
	@Column(name = "name")
String sname;
	@Column(name = "college")
String scollege;
	@Column(name = "course")
String scourse;
public Student() {
	// TODO Auto-generated constructor stub
}
public Student(int sid, String sname, String scollege, String scourse) {
	super();
	this.sid = sid;
	this.sname = sname;
	this.scollege = scollege;
	this.scourse = scourse;
}

public int getId() {
	return sid;
}
public void setId(int sid) {
	this.sid = sid;
}
public String getName() {
	return sname;
}
public void setName(String sname) {
	this.sname = sname;
}
public String getCollege() {
	return scollege;
}
public void setCollege(String college) {
	this.scollege = scollege;
}
public String getCourse() {
	return scourse;
}
public void setCourse(String scourse) {
	this.scourse = scourse;
}
@Override
public String toString() {
	return "Student [id=" + sid + ", name=" + sname + ", college=" + scollege + ", course=" + scourse + "]";
}

}
