package com.bridgelab.datastructure;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.StringTokenizer;

public class UnorderList {

	// node class
	public static class Node {

		String data;
		Node next = null;
	}

//	linkedList class
	public static class LinkedList {
		Node head;

//		linked list insertion

		public void insert(String data) {
			Node node = new Node();
			node.data = data;
			node.next = null;
			if (head == null) {
				head = node;
			} else {
				Node current = head;
				while (current.next != null) {
					current = current.next;
				}
				current.next = node;
			}

		}

//		linked list insert At start

		public void insertAtStart(String data) {
			Node node = new Node();
			node.data = data;
			node.next = null;
			node.next = head;
			head = node;
		}

//		linked list insertionAt place

		public void insertAt(int index, String data) {
			Node node = new Node();
			node.data = data;
			node.next = null;
			if (index == 0) {
				insert(data);
			} else {
				Node n = head;
				for (int i = 0; i < index - 1; i++) {
					n = n.next;
				}
				node.next = n.next;
				n.next = node;
			}
		}

//		linked list deletions

		public void delete(int index) {

			if (head == null) {
				System.out.println("hnkgvhsfd");
			} else {
				Node current = head;
				Node nodecurrent = null;
				for (int i = 0; i < index - 1; i++) {

					current = current.next;

				}

				System.out.println(" delet char " + current.next.data);
				nodecurrent = current.next;
				current.next = nodecurrent.next;
			}

		}

//		search and check conditionn it is present or not

		public boolean search(String data) {
			boolean flag = true;
			if (head == null) {
				flag = false;
			} else {
				Node current = head;
				while (current != null) {
					if (data.equals(current.data)) {
						System.out.println(current.data);
					}
					current = current.next;
				}

			}
			return true;

		}

//		isempty to check

		public void isempty() {
			boolean flag = false;
			if (head == null) {
				flag = true;
			}
			System.out.println("true or false: " + flag);
		}
		
//		
		public int size() {
			
			int count=0;
			if (head==null) {
				return 0;
			}
			else {
				Node current=head;
				while(current!=null) {
					 count=count+1;
					 current=current.next;
				}
			}
			return count;
		}

//		show the node of the list

		public void show() {
			Node currentshow = head;

			while (currentshow.next != null) {
				System.out.println(currentshow.data);
				currentshow = currentshow.next;
			}
			System.out.println(currentshow.data);
		}

	}

//	main

	public static void main(String[] args) {
		LinkedList list = new LinkedList();

		try {

			BufferedReader br = new BufferedReader(new FileReader("/home/user/Desktop/Unorder"));
			String readstring = br.readLine();

			String[] split = readstring.split(" ");
			for (String arraysplit : split) {

				list.insert(arraysplit);
			}
			list.isempty();
			list.insertAtStart("arul");
			list.insertAt(3, "nandhumani");
			list.delete(3);
			list.search("ambi");
			list.isempty();
			int print=list.size();
			System.out.println("size is " + print);
			list.show();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
