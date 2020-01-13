package com.bridgelabz.basicprogramming;

import com.bridgelabz.utility.utility;
import com.bridgelabz.utility.utilitylogi;

public class HarmonicNumber {
public static void main(String[] args) {
	System.out.println(" enter the number: ");
	int user=utility.inputinteger();
	double result=utilitylogi.HarmonicNumber(user);
	System.out.println(" Harmonic value is: " + result);
}
}
