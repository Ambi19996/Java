package com.bridgelab.datastructure;

import com.bridgelabz.utility.utility;
import com.bridgelabz.utility.utilitylogi;

public class Stack {
	public static void main(String[] args) {
		System.out.println("enter the equvilent : ");
		String readstring=utility.inputString();
		char[] balance=readstring.toCharArray();
		boolean result=utilitylogi.checkBalanceOrnot(balance);
		System.out.println(result);
	}

	

}
