package com.bridgelaz.functionalprogramming;

import java.util.ArrayList;

import com.bridgelabz.utility.utility;
import com.bridgelabz.utility.utilitylogi;

public class SumOfThreeInteger {

	public static void main(String[] args) {
		int i,j,k;
		int arr[]=new int[5];
		System.out.println("enter the array: ");
		for ( i = 0; i < 5; i++) {
			int a=utility.inputinteger();
			arr[i]=a;
		}
		ArrayList<Integer>list=new ArrayList<Integer>();
		list=utilitylogi.SumOfNumber(arr);
		for (i = 0;  i< list.size();) {
			System.out.print(list.get(i));
			System.out.print(list.get(i+1));
			System.out.print(list.get(i+2));
			i=i+3;
			System.out.println();
		}
		

	}

}
