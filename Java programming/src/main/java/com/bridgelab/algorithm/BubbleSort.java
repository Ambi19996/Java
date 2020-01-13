package com.bridgelab.algorithm;

import java.util.ArrayList;

import com.bridgelabz.utility.utility;
import com.bridgelabz.utility.utilitylogi;

public class BubbleSort {

	public static void main(String[] args) {
		
   int arr[]=new int[5];
   for (int i = 0; i < arr.length; i++) {
	System.out.println("Enter the array:");
	arr[i]=utility.inputinteger();
}
int[] store=utilitylogi.bubbleSort(arr);
int[]  printStore=utilitylogi.printing(arr);
System.out.println(" second higest "+ arr[1] ) ;
	}

}
