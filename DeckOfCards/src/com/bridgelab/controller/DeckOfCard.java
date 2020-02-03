package com.bridgelab.controller;

import java.util.Random;

import com.bridgelab.Utility.Utility;
import com.bridgelab.Utility.Utilitylogics;

public class DeckOfCard {

	static Random random = new Random();

	static class Node {

		public Node(String data2) {
			this.data = data;
		}

		String data;
		Node next;
	}

	static Node node[] = new Node[4];

//     main method 
	public static void main(String[] args) {

		String[] suit = { "Deck", "Diamond", "Spades", "Heart" };
		String[] rank = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "1" };

		String[][] deck = Utilitylogics.cards(suit, rank);
		Utilitylogics.shuffle(deck);
		for (int i = 0; i < deck.length; i++) {
			for (int j = 0; j < deck[0].length; j++) {
				System.out.print(" " + "" + deck[i][j]);
			}
			System.out.println();
		}
		System.out.println("*************************************");

		Utilitylogics.distubute(deck);

		sort(1);
		sort(2);
		sort(3);
		sort(4);

		display();
	}

	private static void display() {
		for (int i = 0; i < 4; i++) {
			Node current = node[i];
			while (current.next != null) {
				System.out.print(" " + current.data);
				current = current.next;
			}
			System.out.println();
		}

	}

	private static void sort(int i) {
		i = i - 1;
		Node current = node[i];
		while (current != null) {
			Node check = node[i].next;
			while (check != null) {
				if (current.data.compareTo(check.data) < 0) {
					String temp = current.data;
					current.data = check.data;
					check.data = temp;
				}
				check = check.next;
			}
			current = current.next;
		}
		Node last = new Node(node[i].data);
		node[i] = node[i].next;
		current = node[i];
		while (current.next != null) {
			current = current.next;
		}
		current.next = last;
	}

}