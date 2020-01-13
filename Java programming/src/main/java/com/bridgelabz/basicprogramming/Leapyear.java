package com.bridgelabz.basicprogramming;

import com.bridgelabz.utility.utility;
import com.bridgelabz.utility.utilitylogi;

public class Leapyear {
	public static void main(String[] args) {
		System.out.println(" Enter the year: ");
		int year=utility.inputinteger();
		boolean result=utilitylogi.CheckLeapYearOrNot(year);
		if(result==true) /*where checking the condition boolean
		                   result is true or not   */
		{
			System.out.println("its is leapyear");
		}
		else 
		{
			System.out.println("not leayear");
		}
	}

}
