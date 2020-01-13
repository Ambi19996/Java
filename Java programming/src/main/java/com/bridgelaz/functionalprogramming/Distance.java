package com.bridgelaz.functionalprogramming;




import com.bridgelabz.utility.utility;
import com.bridgelabz.utility.utilitylogi;

public class Distance {

	public static void main(String[] args) {
		/*user enter the two values and catch the value printing*/

		int user1=utility.inputinteger();
		System.out.println("Enter the value: ");
	System.out.println("Enter the value");
	int user2=utility.inputinteger();
	double printing=utilitylogi.DistanceUsingMathFormat(user1,user2);
System.out.println("value of double: " + printing);
	}

}
