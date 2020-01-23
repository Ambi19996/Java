package com.bridgelab.datastructure;

import java.io.BufferedReader;
import java.io.FileReader;

public class OrderList {

	private static int data;

	public static void main(String[] args) {    /*to insert,rmove,search,isempty we check*/
		insert(10);
		insert(100);
		insert(20);
		insert(11);
		insert(7);
		insert(2);
		
		remove(3);
		
		boolean result=isempty();
System.out.println("its is empty: " + result + " its not ");
		boolean result1=search(20);
		System.out.println(result1);
		
		display();
			}
//	searching operation is done here
	private static boolean search(int data) {
		boolean flag=true;
		if (head==null) {
			return false;
		}
		else {
			Node current=head;
			while(current.next!=null) {
				if (data==current.data) {
					System.out.println("your searching value is: " + current.data );			
				}
				current=current.next;
			}
		}
		
		return flag;
		
		
	}
//	isempy operation is done here
	private static boolean isempty() {
		boolean flag=false;
		if (head==null) {
			return true;
		}
		return flag;
		
		
	}
//	delete  operation is done here
	private static int remove(int index) {
		if (head==null) {
			return data;
		}
		
		else{
			Node current=head;
			Node temp=null;
			
			for (int i = 0; i < index-1; i++) {
				current=current.next;
			}
			System.out.println("remove data is :" + current.next.data);
			temp=current.next;
			current.next=temp.next;
		}
		return data;
		
		
	}
//	create the node
	static class Node{
		int data;
		Node next;
	}
      static Node head;
//  	insertion  operation with sorting is done here
	private static void insert(int data) {
		Node node=new Node();
		node.data=data;
		node.next=null;
		
	if (head==null||node.data<=head.data) {
		
		node.next=head;
		head=node;
		}
	else {
		Node current=head;
		while(current.next!=null&&current.next.data<node.data) {
			current=current.next;	
		}
		node.next=current.next;
		current.next=node;
		
	}
	}
//	display all statement in the operation is done here
	private static void display() {

		
			Node current=head;
			while(current!=null) {
				System.out.println(current.data);
				current=current.next;
			}

		}
		
	}

