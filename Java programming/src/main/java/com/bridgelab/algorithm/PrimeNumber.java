package com.bridgelab.algorithm;

import java.util.ArrayList;

import com.bridgelabz.utility.utility;
import com.bridgelabz.utility.utilitylogi;

public class PrimeNumber {
	public static void main(String[] args) {
		int input=0;
		String primenumber="";
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		for (int i = 0; i <=100; i++) {
			int counter=0;
			
			for (input = i; input >=1; input--) {
				if(i%input==0) {
					counter=counter+1;
				}
			}
			if(counter==2) {
				primenumber=primenumber+i;
				list.add(i);
			}
		}
	System.out.println(primenumber);	
	}

}
