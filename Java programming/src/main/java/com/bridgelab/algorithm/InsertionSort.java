package com.bridgelab.algorithm;

import java.util.ArrayList;

import com.bridgelabz.utility.utility;
import com.bridgelabz.utility.utilitylogi;
/*insertion sort main method and call method */

public class InsertionSort {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();

		System.out.println("Enter the number: ");
		int user[] = new int[6];
		for (int i = 0; i < user.length; i++) {
			user[i] = utility.inputinteger();
		}
		list = utilitylogi.insertionElement(user, list);
		list = printing(user, list);
	}

	/* with under main method just printing the araay list with sort order */
	private static ArrayList<Integer> printing(int[] user, ArrayList<Integer> list) {
		for (int i = 0; i < user.length; i++) {
			System.out.print(user[i] + " ");
		}
		System.out.println();
		return list;
	}

}
