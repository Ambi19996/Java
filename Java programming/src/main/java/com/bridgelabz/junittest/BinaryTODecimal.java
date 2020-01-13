package com.bridgelabz.junittest;

import com.bridgelabz.utility.utility;
import com.bridgelabz.utility.utilitylogi;

public class BinaryTODecimal {
public static void main(String[] args) {
	System.out.println("Enter the user value");
	int user=utility.inputinteger();
	int print=utilitylogi.binarytoDecimals(user);
	System.out.println(" " + print);
}
}
