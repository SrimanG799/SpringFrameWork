package com.ciq.gittest;

public class FebinaciSum {
	public static void main(String[] args) {
		
	int sum=0;
	int a=0;
	int b=1;
	sum=a+b;
	for(int i=3;i<=5;i++)
	{
		int c=a+b;
		sum=sum+c;
		a=b;
		b=c;
		
	}
	System.out.println(sum);
	

}
}