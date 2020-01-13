/**
 * 
 */
package com.bridgelabz.basicprogramming;

import java.util.ArrayList;

import com.bridgelabz.utility.utility;
import com.bridgelabz.utility.utilitylogi;

public class PrimeFactorial {

	public static void main(String[] args) {
		System.out.println("Enter the value");
		int user=utility.inputinteger();
		
	ArrayList Factorial=utilitylogi.PrimeFactorial(user);
	for (int i = 0; i < Factorial.size(); i++) {
		System.out.println(Factorial.get(i));
		
	}
	
	}
	

}
