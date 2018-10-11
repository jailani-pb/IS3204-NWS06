package week13.learningregex;

public class PreDefinedCharClass {

	public static void main(String[] args) {
		String pra = "IS3204 Programming Application";
		System.out.println(pra);
		// Replace any characters to #
		System.out.println(pra.replaceAll(".", "#"));
		// Replace any digits 0 until 9 to #
		System.out.println(pra.replaceAll("\\d", "#"));
		// Replace any non-digits to #
		System.out.println(pra.replaceAll("\\D", "#"));
		// Replace any whitespace characters to #
		System.out.println(pra.replaceAll("\\s", "#"));
		// Replace any non-whitespace characters to #
		System.out.println(pra.replaceAll("\\S", "#"));
		// Replace any digits or any whitespace characters to #
		System.out.println(pra.replaceAll("[\\d\\s]", "#"));
		// Replace any word characters to #
		System.out.println(pra.replaceAll("\\w", "#"));
		// Replace any non-word characters to #
		System.out.println(pra.replaceAll("\\W", "#"));
	}
	
}



