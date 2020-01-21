package com.bridgelab.datastructure;

public class PrimeNumber {

	public static void main(String[] args) {
int max=200;
boolean pnumber=true;
String primenumber="";
String result=primeNumberOrNot(max,pnumber,primenumber);
System.out.println(" " + result);
int print=arrayof100(result);
	}

	private static int arrayof100(String result) {
		int start=0;
		int end=100;
		
		
		return 0;
		
	}

	private static String primeNumberOrNot(int max, boolean pnumber, String primenumber) {
		
		for (int i = 1; i <= max; i++) {
			
				pnumber=checkPrime(i);
				if (pnumber) {
					primenumber=primenumber+i;
		}
		}
		
		return primenumber;
	}

	private static boolean checkPrime(int checknumber) {
		int temp;
		for (int j = 2; j <= checknumber/2; j++) {
		temp=checknumber%j;
		if (temp==0) {
			return false;
		}
		}
		return true;
	}

}
