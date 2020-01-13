package com.bridgelabz.junittest;

import com.bridgelabz.utility.utility;

public class SqrtNegativeNumber {
public static void main(String[] args) {
	System.out.println("Enter the value");
	double c=utility.inputdouble();
	double epsilon=1e-15;
	double t=c;
	while(Math.abs(t - c/t) > epsilon*t ) {
	t=(c/t+t)/2.0;	
	}
	System.out.println(t);
}
}
