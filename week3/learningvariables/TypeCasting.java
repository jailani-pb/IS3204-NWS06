package week3.learningvariables;

public class TypeCasting {

	public static void main(String[] args) {
		/*
		 * Type casting from a smaller range
		 * to a larger range data type, you can do
		 * assignment normally.
		 */
		byte numberOfEmployee = 100;
//		numberOfEmployee = 200;
		short updatedEmployeeNumber = numberOfEmployee;
		System.out.println(updatedEmployeeNumber);
		
		/*
		 * Type Casting from a larger range 
		 * to a smaller range data type, you have to
		 * tell Java of your intention.
		 */
		int x = 200000;
		byte y = (byte) x;
		System.out.println(y);
	}
	
}
