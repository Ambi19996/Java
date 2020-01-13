package com.bridgelaz.functionalprogramming;

import com.bridgelabz.utility.utility;
import com.bridgelabz.utility.utilitylogi;

public class WindChill {

	public static void main(String[] args) {
 System.out.println("enter the value");
 double t=utility.inputdouble();
 System.out.println("enter the number");
 double v=utility.inputdouble();
 double w = 0;
 if (t<=50&&v>=120) {
	 double printing=utilitylogi.WindChillCalcSpeed(t,v,w);

	 System.out.println(printing);
}
 else {
	 System.out.println("out of range");
 }
	}

}
