package week12.learningstrings;

public class MatchingString {

	public static void main(String[] args) {
		String pra = "IS3204 Programming Application";
		System.out.println(pra.equals("IS3204 Programming Application"));
		System.out.println(pra.equals("Programming"));
		System.out.println(pra.contains("Programming"));
		
		// .contains cannot check if the word has other
		// characters in front and at the back
		String pra2 = "Programming Application";
		System.out.println(pra2.contains("Programming"));
		
		// Use .matches method with regular expression (regex)
		System.out.println(pra.matches(".+Programming.+"));
		System.out.println(pra2.matches(".+Programming.+"));
		
		// Check if the word Programming is at the front or middle
		// but not at the end
		System.out.println(pra.matches(".*Programming.+"));
		System.out.println(pra2.matches(".*Programming.+"));
		
		// Check if the word Programming has seven characters in front
		System.out.println(pra.matches(".......Programming.*"));
		System.out.println(pra2.matches(".......Programming.*"));
		
		String validEmail = "jailani.rahman@pb.edu.bn";
		checkEmail(validEmail);
		String inValidEmail = "jailani@rahman@pb.edu.bn";
		checkEmail(inValidEmail);
		String inValidEmail2 = "jailani.rahman.pb.edu.bn";
		checkEmail(inValidEmail2);
		String inValidEmail3 = "jailani rahman@pb.edu.bn";
		checkEmail(inValidEmail3);
	}
	
	public static void checkEmail(String email) {
		if(email.matches("[a-zA-Z0-9._]+@[a-zA-Z0-9._]+")) {
			System.out.println(email + " is valid.");
		} else {
			System.out.println(email + " is not valid.");
		}
	}
	
}






