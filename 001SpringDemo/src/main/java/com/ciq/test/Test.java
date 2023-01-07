package com.ciq.test;

import java.util.HashMap;

import com.coll.Student;



public class Test {
	public static void main(String[] args) {
		
		Student s1=new Student(1, "sriman");
		
		System.out.println(s1.hashCode());
		
		Student s2=new Student(1, "sriman");
		
		System.out.println(s2.hashCode());
		
		System.out.println(s1.equals(s2));
		
		Student s3=s2;
		
		HashMap hm=new HashMap();
		
		hm.put(new Student(1, "srimans").hashCode(), 1000);
		
		hm.put(new Student(1, "sriman").hashCode(), 5000);
		
	//	hm.put(s3, 102);
		
		System.out.println(hm.toString());
		
		
	}

}
