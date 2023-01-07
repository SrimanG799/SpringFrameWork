package com.out.print;

public class Employee extends Student {
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(int a, int b) {
		super(a, b);
		// TODO Auto-generated constructor stub
	}
	int c;
	int d;
	@Override
	public void add(int a, int b) {
		System.out.println(a+b);
		
	}
	public static void main(String[] args) {
		
		
		Student st=new Employee();
		
		System.out.println(Runtime.getRuntime().toString()); //if we use get class it gives only child class name
		st.add(4, 6);
	}
}

	