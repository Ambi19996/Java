package com.bridgelabz.junittest;

import com.bridgelabz.utility.utility;

public class MonthlyPayment {

	public static void main(String[] args) {
     System.out.println("Enter the value: ");
     double principal=utility.inputdouble();
     double year=utility.inputdouble();
     double rate=utility.inputdouble();
     /*logics of loan paymens*/
     double rateing=(rate/100) /12;
     double numberofYear=12 * year;
     double payment=(principal*rateing) /(1-Math.pow(1+rateing, -numberofYear));
System.out.println("payment is: " + payment);
	}

}
