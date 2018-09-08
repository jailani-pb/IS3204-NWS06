package week9.revisioniteration;

import java.util.Scanner;

public class LoopsBasic {

	public static void main(String[] args) {
		// for loop
		for(int i = 1; i <= 100; i++) {
			System.out.println(i + "Hello World");
		}
		for(int i = 100; i >= 1; i--) {
			System.out.println(i + "Hello World");
		}
		
		// while loop
		Scanner userInput = new Scanner(System.in);
//		System.out.println(userInput.nextLine());
		System.out.println("Input any value or q to quit");
		String input = userInput.nextLine();
		int counter = 0;
		while(!input.equals("q")) {
			if(input.equals("q")) {
				System.out.println("Leaving the while loop");
				break;
			}
			
			if(counter < 5) {
				System.out.println(counter + " : " + input);
			} else {
				System.out.println(counter + " : " + input);
				System.out.println("Adang tah");
			}
			System.out.println("Input any value or q to quit");
			input = userInput.nextLine();
			counter++;
		}
		
		// do-while loop
		Scanner userInput2 = new Scanner(System.in);
		System.out.println("Input2 any value or q to quit");
		String input2 = userInput2.nextLine();
		int counter2 = 0;
		do {
			if(input2.equals("q")) {
				System.out.println("Leaving the do-while loop");
				break;
			}
			
			if(counter2 < 5) {
				System.out.println(counter2 + " : " + input2);
			} else {
				System.out.println(counter2 + " : " + input2);
				System.out.println("Adang tah");
			}
			System.out.println("Input2 any value or q to quit");
			input2 = userInput2.nextLine();
			counter2++;
		} while (!input2.equals("q"));
	}
	
}
