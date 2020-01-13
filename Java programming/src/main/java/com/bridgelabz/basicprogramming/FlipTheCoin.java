package com.bridgelabz.basicprogramming;

import com.bridgelabz.utility.utility;
import com.bridgelabz.utility.utilitylogi;

/*main method to showing flip count user give
 * and count head or tail percentage*/
public class FlipTheCoin {
	public static void main(String[] args) {
		System.out.println(" Enter the flip count:");

		int user=utility.inputinteger();
		
		double percentage=utilitylogi.PercentageOfFlip(user);
		System.out.println(percentage);
		
	}

}
