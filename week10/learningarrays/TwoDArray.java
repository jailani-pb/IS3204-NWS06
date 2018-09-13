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
						
						if(player1Turn == true) {
							player1Turn = false;
							playerSymbol = 'X';
						} else {
							player1Turn = true;
							playerSymbol = 'O';
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




