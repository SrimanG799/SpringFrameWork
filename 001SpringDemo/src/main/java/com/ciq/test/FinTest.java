package com.ciq.test;

public class FinTest {
	public Integer save(Integer A,Integer B)
	{
		return A+B;
	}
	
	
	public int save(int a,int b)
	{
		return a+b;
	}
public static void main(String[] args) {
	FinTest f=new FinTest();
	System.out.println(f.save(40, 50));
	System.out.println(f.save(10, 20));
	System.out.println(f.save((Integer)20, (Integer)20));
	System.out.println(f.save(20, 5));
	
}
}
