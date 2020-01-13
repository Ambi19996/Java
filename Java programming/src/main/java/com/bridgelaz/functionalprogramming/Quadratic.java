package com.bridgelaz.functionalprogramming;

import java.util.HashMap;
import java.util.Map;

import com.bridgelabz.utility.utility;
import com.bridgelabz.utility.utilitylogi;

public class Quadratic {
	
	public static void main(String[] args) {
		Map<String,Float>map=new HashMap();
		System.out.println("enter the number: ");
		int a=utility.inputinteger();
		System.out.println("enter the number: ");
		int b=utility.inputinteger();
		System.out.println("enter the number: ");
		int c=utility.inputinteger();
		
		Map<String, Float> printing=utilitylogi.QuadraticValues(a,b,c);
		for(Map.Entry<String, Float>mm:printing.entrySet()) {
	System.out.println(" getkey " + mm.getKey() + "getvalue " + mm.getValue());
		}
		
	}

}
