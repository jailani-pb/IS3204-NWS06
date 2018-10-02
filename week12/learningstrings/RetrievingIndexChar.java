package week12.learningstrings;

public class RetrievingIndexChar {

	public static void main(String[] args) {
		String pra = "IS3204 Programming Application";
		// Retrieve the index of character "a"
		// first instance of the character
		int firstIndexA = pra.indexOf("a");
		System.out.println(firstIndexA);
		// last instance of the character
		int lastIndexA = pra.lastIndexOf("a");
		System.out.println(lastIndexA);
		
		String validEmail = "jailani.rahman@pb.edu.bn";
		checkEmail(validEmail);
		String inValidEmail = "jailani@rahman@pb.edu.bn";
		checkEmail(inValidEmail);
		String inValidEmail2 = "jailani.rahman.pb.edu.bn";
		checkEmail(inValidEmail2);
	}
	
	public static void checkEmail(String email) {
		if(email.indexOf("@") == email.lastIndexOf("@") &&
				email.indexOf("@") != -1) {
			System.out.println(email + " is valid.");
		} else {
			System.out.println(email + " is not valid.");
		}
	}
	
}






