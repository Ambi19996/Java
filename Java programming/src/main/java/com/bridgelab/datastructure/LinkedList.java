package com.bridgelab.datastructure;

import java.security.PublicKey;

public class LinkedList {
	Node head;

	public void insert(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;

		if (head == null) {
			head = node;
		} else {
			Node n = head;
			while (n.next != null) {
				n = n.next;
			}
			n.next = node;
			node.size++;
		}
	}

	public void insertAtStart(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		node.next = head;

		head = node;
		node.size++;
	}

	public void insertAtPlace(int index, int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		if (index == 0) {
			
		} else {
			Node n = head;
			for (int i = 0; i < index - 1; i++) {
				n = n.next;
			}
			node.next = n.next;
			n.next = node;
			node.size++;
		}
	}

	public void deleteAt(int index) {

		if (head == null) {
			head = head.next;
		}

		else {
			Node n = head;
			Node n1 = null;

			for (int i = 0; i < index - 1; i++) {
				n = n.next;
			}
			n1 = n.next;
			n.next = n1.next;
			System.out.println("delete number " + n1.data);
		}

	}
	public boolean isempty() {
	boolean flag=false;
	if (head==null) {
		flag=true;
	
	}
	System.out.println(flag);
	return flag;
	}
	
	
	public void search(int data) {
		
		if (head==null) {
			System.out.println("empty");
		}
		else {
			Node n=head;
			while(n!=null){
				
				if (n.data==data) {
					System.out.println("its is found");
					
				}
				n=n.next;
			}
		}
		
	}

	public void show() {
		Node n = head;
		while (n.next != null) {
			System.out.println(n.data);
			n = n.next;
		}
		System.out.println(n.data);
	}

}
