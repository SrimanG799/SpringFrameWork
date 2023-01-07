package com.iac;

public class EleBill {
public static void main (String []args) {
		
		int units=300;
		double amount=0;
		
		if (units<=50) {
			
			amount=units*1;
			
		}
			else if(units>50) {
				
			amount=((units-50)*3.50);
				
			}else if(units>=100) {
				
			amount=((units-100)*5)-175;
				
			}else if(units>200)
				amount=(units*7)-125;
		
		
		System.out.println("Total units Consumed : "+units+" units");
		System.out.println("Units charges        : "+amount);
		
		
		System.out.println("Subcharges           : " );
		
		System.out.println("----------------------------------------");
		System.out.println("Total amount = "+amount);
		System.out.println("----------------------------------------");
		
	}

		
	}


