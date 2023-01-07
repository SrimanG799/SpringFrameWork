package com.iac;

public class EbillOur {
	public static void main(String[] args) {
		
	
	
	int	units = 159;
	double bill = 0;
	if(units<=50){
	  bill  = units*1;
	}
	else if(units <=100){
	  bill = 50*1 + (units-50)*3.5;
	}
	else if(units <=200){
	  bill = 50*1 + 50*3.5 + (units-100)*5;
	}
	else if(units>200){
	  bill = 50*1 + 50*3.5 + 100*5 + (units-200) *7;
	}


	System.out.println(bill);

}
}


