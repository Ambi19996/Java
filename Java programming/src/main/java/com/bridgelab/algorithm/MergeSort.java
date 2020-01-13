package com.bridgelab.algorithm;

import java.util.ArrayList;

import com.bridgelabz.utility.utility;
import com.bridgelabz.utility.utilitylogi;

public class MergeSort {
public static int user[]=new int[6];
	public static void main(String[] args) {
		ArrayList<Integer>list=new ArrayList<Integer>();
   System.out.println("Enter the arrays");
		
   for (int i = 0; i < user.length; i++) {
	user[i]=utility.inputinteger();
}
   System.out.println("before the merge");
  list=mergePrint(user,0,user.length-1,list);
  System.out.println("###################################");
    list=utilitylogi.mergeingSort(0,user.length-1,list);
    System.out.println("****************");
    

	}

	private static ArrayList<Integer> mergePrint(int[] user, int start, int end, ArrayList<Integer> list) {
	for (int k = 0; k < user.length; k++) {
		System.out.print(user[k] + " " );
	}
	System.out.println();
		return list;
	}

}
