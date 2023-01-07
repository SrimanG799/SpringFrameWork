package com.iac;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CommanListElemnts {
	public static void main(String[] args) {
		List l1=new ArrayList();
		List l2=new ArrayList();
		l1.add(59);
		l1.add(65);
		l1.add(75);
		l1.add(55);
		l1.add(52);
		l1.add(32);
		
		
		l2.add(77);
		l2.add(78);
		l2.add(75);
		l2.add(32);
		
//retainAll() used for return common elements between two list store's in first Object(this)		
		
//		l2.retainAll(l1);
		
//		System.out.println(l2);
		
		
		for (Object object : l2) {
			if(l1.contains(object))
				
			{
				System.out.println(object);
			}
		}
	}

}
