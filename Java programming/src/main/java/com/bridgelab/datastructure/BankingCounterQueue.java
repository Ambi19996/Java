package com.bridgelab.datastructure;

import com.bridgelabz.utility.utility;
import com.bridgelabz.utility.utilitylogi;;

public class BankingCounterQueue {
	static Node rear=null;
	static Node front=null;


	static class Node {
	double data;
	Node next;
	}

	public static void main(String[] args) {

	System.out.println("press 1 to deposit and 2 to withdraw");
	int choice =utility.inputinteger();


	enQueue(1000);
	enQueue(500);


	double totalBalance = 0;
	if (choice == 1) {
	System.out.println("Enter the amount to deposit or withdraw");
	double amount =utility.inputdouble();
	enQueue(amount);
	display();
	double balance=calculateBalance();
	System.out.println(balance);

	}
	else
	{

	deQueue();
	display();
	double balance=calculateBalance();
	System.out.println(balance);
	}

	}




	public static void enQueue(double amount)
	{
	Node node=new Node();
	node.data=amount;
	node.next=null;

	if(front==null)
	{
	front=node;
	rear=node;


	}
	else
	{

	rear.next=node;
	rear=node;

	}
	}

	public static void deQueue() {
	front=front.next;
	}



	public static void display() {


	if (front== null) {
	System.out.println("empty");

	} else {
	Node n = front;
	while (n!= null) {

	System.out.println(n.data);

	n = n.next;
	}

	}
	}

	public static double calculateBalance() {
	double balance =0.0;
	if(rear==null)
	{

	return 0;
	}
	else
	{

	Node n=front;
	while(n.next!=null)
	{

	balance=balance+n.data;
	n=n.next;
	}
	balance=balance+n.data;
	}

	return balance;
	}

}