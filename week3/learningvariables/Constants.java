package week3.learningvariables;

public class Constants {
	
	public static void main(String[] args) {
		final int MULTIPLIER = 4;
		final String MESSAGE = "Result of Multiplied Square by 4";
		int areaSquare = 10;
		int multipliedSquare;
		
		multipliedSquare = areaSquare * MULTIPLIER;
		System.out.println(MESSAGE);
		System.out.println(multipliedSquare);
		
//		MULTIPLIER = 10;
		areaSquare = 20;
		
		multipliedSquare = areaSquare * MULTIPLIER;
		System.out.println(MESSAGE);
		System.out.println(multipliedSquare);
	}
	
}
