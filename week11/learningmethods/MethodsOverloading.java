package week11.learningmethods;

public class MethodsOverloading {

	public static void main(String[] args) {
		int x = sum(1, 10);
		System.out.println(x);
		int y = sum(11, 20) + sum(51, 60);
		System.out.println(y);
		System.out.println(textTotal(y));
		printTotal(y);
		printTotal(1, 20);
	}
	
	public static void printTotal(int firstValue, int lastValue) {
		printTotal(sum(firstValue, lastValue));
	}
	
	public static void printTotal(int total) {
		System.out.println(textTotal(total));
	}
	
	public static String textTotal(int total) {
		return "Total: " + total;
	}
	
	public static int sum(int firstValue, int lastValue) {
		int sum = 0;
		for(int i = firstValue; i <= lastValue; i++) {
			sum = sum + i;
		}
		return sum;
	}
	
}
