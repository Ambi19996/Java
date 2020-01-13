package com.bridgelabz.basicprogramming;

import com.bridgelabz.utility.utility;
import com.bridgelabz.utility.utilitylogi;
/*calculate power of 2 user given value its 
 * thats power of 2*/
public class PowerOf2 {
	public static void main(String[] args) {
		System.out.println("Enter the value");
		int user=utility.inputinteger();
		int power=utilitylogi.checkpower(user);
		System.out.println(power);
		
	}

}
