
package com.bridgelab.algorithm;

import java.util.Arrays;

import com.bridgelabz.utility.utility;


/*prime and anagram to take prime check wheater it correct or not*/
public class PrimeNumberAnagram {
public static void main(String[] args) {
	
	System.out.println("Enter the number1");
	int  user=utility.inputinteger();
	System.out.println("Enter the number2");
	int  user1=utility.inputinteger();
	int input=0;
	int count=0;

	boolean prime;
	prime=checkPrime(user,input);
	if(prime) {
		System.out.println(user+"its is primenumber");
	}
	else {
		System.out.println(user+"it is notprime");
	}
		
	Palidrome(user);

	Anagram(user,user1);
	}
	private static void Anagram(int user,int user1) {
		
		String str1=String.valueOf(user);
		String str2=String.valueOf(user1);

		char[] usercon1=str1.toCharArray();
		char[] usercon2=str2.toCharArray();
		
		Arrays.sort(usercon1);
		Arrays.sort(usercon2);
		
		StringBuffer bf1=new StringBuffer();
		StringBuffer bf2=new StringBuffer();
		
		for (int i = 0; i < usercon2.length; i++) {
			char a=usercon1[i];
			char b=usercon2[i];
			bf1.append(a);
			bf2.append(b);
		}
		if(bf1.toString().equals(bf2.toString())) {
			System.out.println("its is anagram");
		}
		else {
			System.out.println("its not a anagram");
		}		
		}		
	private static void Palidrome(int user) {
		int check=user;
		System.out.println("sum"+user);
	     int sum=0;int r;
			if(user>0&&user<9) {
				System.out.println("Enter the two digit number");
			} 
			else {
				while(user>0) {
					r=user%10;
					sum=(sum*10)+r;
					user=user/10;
					}
				System.out.println("sum"+user);
				if(sum==check) {
					System.out.println("its is palidrome");
				}
				else {
					System.out.println("its not palindrome");
				}
			}			
		}
		private static boolean checkPrime(int user, int input) {
		
			for (int i = 2; i <= user/2; i++) {
				if(user%i==0) {
					
				return false;
				}
			}
			return true;	
}
}
