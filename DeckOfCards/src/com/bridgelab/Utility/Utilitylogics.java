package com.bridgelab.Utility;

import java.util.Random;

public class Utilitylogics {
	static Random random = new Random();

	public static String shuffled(String[][] card) {
		int row = random.nextInt();
		int columns = random.nextInt();

		return null;
	}

//	to shuffle the cards
	public static void shuffle(String[][] deck) {
		Random random = new Random();
		int row, columns;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 13; j++) {
				row = random.nextInt(4);
				columns = random.nextInt(13);
				String a = deck[row][columns];
				String b = deck[i][j];

				deck[row][columns] = b;
				deck[i][j] = a;

				System.out.print(" " + "\t" + deck[i][j]);
			}
		}
	}

//	Distubitute the player for  cards
	public static void distubute(String[][] deck) {
		String[][] player = new String[4][9];

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 9; j++) {
				player[i][j] = deck[i][j];
				System.out.print(" " + "\t" + player[i][j]);
			}
			System.out.println();
		}
	}

	public static String[][] cards(String[] suit, String[] rank) {
		String[][] deck = new String[suit.length][rank.length];

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 13; j++) {
				deck[i][j] = suit[i] + rank[j];
			}
		}
		return deck;
	}
}
