package com.bridgelab.algorithm;

import com.bridgelabz.utility.utility;
import com.bridgelabz.utility.utilitylogi;

/*binary serach word to find printing statment*/
public class BinarySearch {
public static void main(String[] args) {
	System.out.println(" Enter the array : ");
	String str[]=new String[5];
	for (int i = 0; i < str.length; i++) {
		str[i]=utility.inputString();
	}
System.out.println(" Enter the find value: ");
	String find=utility.inputString();
	int printing=utilitylogi.binarySearchtoFindStringitisPresentorNot(str,find);
	if (printing==-1)
		System.out.println("no element is present");
	else
		System.out.println("The elemet is present : " + printing);
		
	
}
}
