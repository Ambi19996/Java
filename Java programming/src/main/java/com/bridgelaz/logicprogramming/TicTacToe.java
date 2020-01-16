package com.bridgelaz.logicprogramming;

import java.util.Random;

import javax.swing.border.Border;

import com.bridgelabz.utility.utility;
import com.bridgelabz.utility.utilitylogi;

public class TicTacToe {
	public static int row, columns;

	public static char[][] board = new char[3][3];

	static char turns = 'x';

	

	public static void main(String[] args) {

		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {

				board[i][j] = '_';

			}

		}

		playgame();

	}



	public static void playgame() { /*to play the game*/

		boolean play = true;



		while (play) {

			System.out.println("please enter the row and columns");

			row =utility.inputinteger() - 1;

			columns =utility.inputinteger() - 1;

			board[row][columns] = turns;

			if (gameOver(row, columns)) {

				play = false;

				System.out.println("game over!" + turns + " try next time");

			}

			printBoard();



			if (turns == 'x')

				turns = '0';

			else {

				turns = 'x';

			}

		}

	}



	public static void printBoard() {/*just print the board*/

		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {

				System.out.print(board[i][j] + " | ");

			}

			System.out.println();

		}

	}



	public static boolean gameOver(int rmove, int cmove) {
		

		/*we check perpendicular*/
		if (board[0][cmove] == board[1][cmove] && board[0][cmove] == board[2][cmove])

			return true;

		/*we check perpendicular*/

		if (board[rmove][0] == board[rmove][1] && board[rmove][0] == board[rmove][2])

			return true;


		/*we diagonal*/
		if (board[0][0] == board[1][1] && board[0][0] == board[2][2] && board[1][1] != '_')

			return true;

		/*we check diagonal*/

		if (board[0][2] == board[1][1] && board[0][2] == board[2][0] && board[1][1] != '_')

			return true;

		return false;
	}
}
