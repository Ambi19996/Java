package com.bridgelaz.logicprogramming;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import com.bridgelabz.utility.utility;
import com.bridgelabz.utility.utilitylogi;

public class Coupon {

	public static void main(String[] args) {
		
		System.out.println("Enter the couponnuber");
		int arr[]=new int[5];
		for (int i = 0; i < arr.length; i++) {
			int coupon_number=utility.inputinteger();
			arr[i]=coupon_number;
			
		}
		Map<Integer, Integer>map=new HashMap<Integer,Integer>();

	map=utilitylogi.RepatedNotAllowedCoupon(arr,map);
	
	for (Map.Entry<Integer,Integer>mm:map.entrySet()) {
		System.out.println("coupon no: " + mm.getKey());
	}



	}

}
