package com.bridgelab.datastructure;

import java.util.Scanner;

import com.bridgelabz.utility.utility;
import com.bridgelabz.utility.utilitylogi;

public class Palindrome {
     static Node front;
     static Node rear;
	public static void main(String[] args) {
		
		Palindrome queue=new Palindrome();
System.out.println("Enter the String : ");
String user=utility.inputString();
char[] word=user.toCharArray();
boolean result=utilitylogi.ckeckPalindrome(user);
System.out.println(result);


	

	}
class Node{
	String data;
	Node prev;
	Node next;

}	
}
		
	
