package com.bridgelaz.logicprogramming;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.bridgelabz.utility.utility;
import com.bridgelabz.utility.utilitylogi;

public class Coupon {

	public static void main(String[] args) {
		
		System.out.println("Enter the couponnuber");
		int number=utility.inputinteger();
			
		
		HashSet<Integer>set=new HashSet<Integer>();

	set=utilitylogi.RepatedNotAllowedCoupon(number,set);
	System.out.println("value is" + set);
	for (Integer i:set) {
		System.out.println(i);
	}
       System.out.println("size " + set.size());

	}

}
