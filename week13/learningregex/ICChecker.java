package week13.learningregex;

import java.util.Scanner;

public class ICChecker {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		String input = "";
		while(true) {
			System.out.println("Please input ic number or q to quit:");
			input = userInput.nextLine();
			if(!input.equals("q")) {
//				if(input.matches("^\\d{2}-\\d{6}$")) {
				if(input.matches("^(0[01]|51)-\\d{6}$")) {
					System.out.println(input + " is valid.");
				} else {
					System.out.println(input + " is not valid.");
				}
			} else {
				System.out.println("Application Terminated.");
				System.exit(0);
			}
		}
	}
	
}

