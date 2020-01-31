package com.bridgelab.datastructure;

import java.util.Scanner;

import com.bridgelabz.utility.utility;
import com.bridgelabz.utility.utilitylogi;

class DoubleNode
{
char data;
DoubleNode next,prev;
}

public class PolindromChecker
{
	static DoubleNode front=null,rear=null,previous=null;
	public static void main(String[] args)
	{
		System.out.println("Enter the string to check polindrom or not");
		String str=utility.inputString();
		addStringToLinkedList(str);
		boolean res=checkPolindromorNot(str);
		if(res==true)
		System.out.println("Palindrom");
		else
		System.out.println("Not Palindrom");
	}
	public static void addStringToLinkedList(String str)
	{
		 
		for(int i=0;i<str.length();i++)
		{
			DoubleNode nn=new DoubleNode();
			nn.data=str.charAt(i);
			nn.next=nn.prev=null;
			if(rear==null)
			{
				rear=nn;
				front=rear;
				previous=rear;
			}
			else
			{
				nn.prev=rear;
				rear.next=nn;
				rear=nn;
			}
		}
	}
	public static boolean checkPolindromorNot(String str)
	{
		int c=0;
		DoubleNode first=front,last=rear;
		    for(int i=0;i<str.length()/2;i++)
		    {
		    if(first.data==last.data)
		    c++;
		    first=first.next;
		    last=last.prev;
		    }
		    if(c==str.length()/2)
		    return true;
		    else
		    return false;
	}
}
