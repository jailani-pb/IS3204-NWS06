package week10.learningarrays;

import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
//		char[][] ticTacToe = new char[3][3];
		char[][] ticTacToe = 
			{
					{' ', ' ', ' '},
					{' ', ' ', ' '},
					{' ', ' ', ' '}
			};
		
		Scanner userInput = new Scanner(System.in);
		String input = "";
		char playerSymbol = 'O';
		boolean player1Turn = true;
		boolean playerWins = false;
		boolean draw = false;
		
		while(playerWins == false && draw == false) {
			System.out.println("\\ y   0    1    2");
			System.out.println("x   ===============");
			for(byte x = 0; x < ticTacToe.length; x++) {
				System.out.print(x + "   ");
				for(byte y = 0; y < ticTacToe[x].length; y++) {
					System.out.print("| " + ticTacToe[x][y] + " |");
				}
				System.out.println();
				System.out.println("    ===============");
			}
			
			System.out.println("Player " + playerSymbol + " turn.");
			System.out.println("Please input xy coordinate:");
			input = userInput.nextLine();
			
			if(input.length() == 2) {
				char[] inputArray = input.toCharArray();
				int x = Character.getNumericValue(inputArray[0]);
				int y = Character.getNumericValue(inputArray[1]);
				
				if(x >= 0 && x < ticTacToe.length &&
						y >= 0 && y < ticTacToe[x].length) {
					
					if(ticTacToe[x][y] == ' ') {
						
						ticTacToe[x][y] = playerSymbol;
						
						// Check if player
						// Check for all rows
						for(int rows = 0; rows < 3; rows++) {
							if(ticTacToe[rows][0] == playerSymbol &&
									ticTacToe[rows][1] == playerSymbol &&
									ticTacToe[rows][2] == playerSymbol) {
								playerWins = true;
								break;
							}
						}
						// Check for all columns
						if(playerWins == false) {
							for(int columns = 0; columns < 3; columns++) {
								if(ticTacToe[0][columns] == playerSymbol &&
										ticTacToe[1][columns] == playerSymbol &&
										ticTacToe[2][columns] == playerSymbol) {
									playerWins = true;
									break;
								}
							}
						}
						// Check for diagonals
						if(playerWins == false) {
							if(ticTacToe[0][0] == playerSymbol &&
									ticTacToe[1][1] == playerSymbol &&
									ticTacToe[2][2] == playerSymbol) {
								playerWins = true;
							} else {
								if(ticTacToe[0][2] == playerSymbol &&
										ticTacToe[1][1] == playerSymbol &&
										ticTacToe[2][0] == playerSymbol) {
									playerWins = true;
								}
							}
						}
						
						if(playerWins == false) {
							if(player1Turn == true) {
								player1Turn = false;
								playerSymbol = 'X';
							} else {
								player1Turn = true;
								playerSymbol = 'O';
							}
						} else {
							System.out.println("Player " + playerSymbol + " wins.");
						}
					
					} else {
						System.out.println("Coordinate already used.");
					}
					
				} else {
					System.out.println("Invalid coordinate.");
				}
				
			} else {
				System.out.println("Invalid input.");
			}
		}
		
	}
	
}




