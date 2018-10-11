package week13.learningregex;

public class CharacterClass {

	public static void main(String[] args) {
		String pra = "IS3204 Programming Application";
		System.out.println(pra);
		// Replace letter a to #
		System.out.println(pra.replaceAll("a", "#"));
		// Replace letter a, i or o to #
		System.out.println(pra.replaceAll("[aio]", "#"));
		// Replace any letters from a until z to #
		System.out.println(pra.replaceAll("[a-z]", "#"));
		// Replace any characters except a, i or o to #
		System.out.println(pra.replaceAll("[^aio]", "#"));
		// Replace any letters a, m until t or z to #
		System.out.println(pra.replaceAll("[am-tz]", "#"));
		// Exercise:
		// Replace the word Programming to #
		System.out.println(pra.replaceAll("Programming", "#"));
		// Replace any digits 0 until 9 to #
		System.out.println(pra.replaceAll("[0-9]", "#"));
		// Replace any non-digits to #
		System.out.println(pra.replaceAll("[^0-9]", "#"));
		// Replace any letters from A until Z or digits 0 until 9 to #
		System.out.println(pra.replaceAll("[A-Z0-9]", "#"));
		// Replace any letters from d until o to #
		System.out.println(pra.replaceAll("[d-o]", "#"));
		// Replace any letters from H until Q to #
		System.out.println(pra.replaceAll("[H-Q]", "#"));
		// Replace any digits 3 until 7 or 9 to #
		System.out.println(pra.replaceAll("[3-79]", "#"));
		
		// Replace any letters from a until k except for c or g to #
		System.out.println(pra.replaceAll("[a-k&&[^cg]]", "#"));
	}
	
}







