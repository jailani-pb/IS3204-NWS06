package week13.learningregex;

public class Quantifiers {

	public static void main(String[] args) {
		String msg = "abbbbbcccddddd";
		// zero or more times
		System.out.println(msg.replaceAll("^ab*", "#"));
		System.out.println(msg.replaceAll("^af*", "#"));
		// one or more times
		System.out.println(msg.replaceAll("^ab+", "#"));
		System.out.println(msg.replaceAll("^af+", "#"));
		// {n}, exactly n times
		System.out.println(msg.replaceAll("^ab{5}", "#"));
		System.out.println(msg.replaceAll("^ab{3}", "#"));
		System.out.println(msg.replaceAll("^ab{7}", "#"));
		// once or not at all
		System.out.println(msg.replaceAll("^ab?", "#"));
		System.out.println(msg.replaceAll("^af?", "#"));
		// {n,} at least n times
		System.out.println(msg.replaceAll("^ab{3,}", "#"));
		// {n,m} at least n times but not more than m times
		System.out.println(msg.replaceAll("^ab{3,7}", "#"));
		System.out.println(msg.replaceAll("^ab{3,4}", "#"));
	}
	
}







