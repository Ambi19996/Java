package com.bridgelab.datastructure;

public class Runner {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		System.out.println("check emptu or not");
		list.isempty();
		list.insert(6);
		list.insert(17);
		list.insert(16);
		list.insert(26);
		list.insertAtStart(77);
		list.insertAtPlace(3, 44);
		list.deleteAt(2);
		
		System.out.println("check emptu or not");
		list.isempty();
		

		list.show();
		System.out.println("check present or not");
		list.search(26);

	}
}
