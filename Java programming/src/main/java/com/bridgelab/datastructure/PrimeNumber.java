package com.bridgelab.datastructure;

import java.util.Scanner;

import com.bridgelabz.utility.utility;
import com.bridgelabz.utility.utilitylogi;

public class PrimeNumber {

	public static void main(String[] args) {
		System.out.println("Enter the row: ");
		int row = utility.inputinteger();
		System.out.println("Enter the columns: ");
		int columns = utility.inputinteger();

		int arr[][] = new int[row][columns];

		int temparr[] = new int[columns * row];

		int i = 0;
		int k = 1;
		int j;
		/* check the prime number its is correct store in array */
		while (i < row * columns) {
			if (utilitylogi.isPrime(k) == true) {
				temparr[i] = k;
				i++;
			}
			k++;
		}

		int x = 0;

		for (int j2 = 0; j2 < row; j2++) {
			for (int l = 0; l < columns; l++) {
				arr[j2][l] = temparr[x];
				x++;
			}
		}
		/* printing statements 2 d array */
		for (int l = 0; l < row; l++) {
			for (int l2 = 0; l2 < columns; l2++) {
				System.out.print(arr[l][l2] + " \t");
			}
			System.out.println();
		}
	}
}