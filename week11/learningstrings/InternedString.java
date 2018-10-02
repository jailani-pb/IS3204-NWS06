package week11.learningstrings;

public class InternedString {

	public static void main(String[] args) {
		// Constructing Strings
		String s1 = "Java";
		String s2 = new String("Java");
		char[] c1 = {'J', 'a', 'v', 'a'};
		String s3 = new String(c1);
		
		// Strings are immutable (content cannot be changed)
		
		// Interned String
		String s4 = "HTML";
		String s5 = "HTML";
		String s6 = new String("HTML");
		System.out.println("s4 == s5 is " + (s4 == s5));
		System.out.println("s4 == s6 is " + (s4 == s6));
		// s4 and s5 are Interned Strings which refer to the same
		// memory location (refer to the same object)
		// s6 is a different object which refer to different memory location
		// Using == will compare the reference instead of the content
		
		// Strings comparison
		// Compare and get a boolean result
		System.out.println("Comparing s4, s5 and s6 using the equal method");
		System.out.println("s4 and s5 is " + s4.equals(s5));
		System.out.println("s4 and s6 is " + s4.equals(s6));
		System.out.println("hTML and s4 is " + "hTML".equals(s4));
		System.out.println("hTML and s4 (ignore case) is " 
				+ "hTML".equalsIgnoreCase(s4));
		
		// Compare and get the lexicographically differences
		// (Get the unicode value differences for each characters)
		System.out.println("Comparing s4, s5 and s6 with compareTo method");
		System.out.println("s4 and s5 is " + s4.compareTo(s5));
		System.out.println("ITML and s4 is " + "ITML".compareTo(s4));
		System.out.println("IXML and s4 is " + "IXML".compareTo(s4));
		System.out.println("HXML and s4 is " + "HXML".compareTo(s4));
		System.out.println("hTML and s4 is " + "hTML".compareTo(s4));
		System.out.println("hTML and s4 (ignore case) is " 
				+ "hTML".compareToIgnoreCase(s4));
		
		// Compare the prefix and suffix of Strings
		// and return a boolean result
		String ins03Student1 = "ins03_12345678@pb.edu.bn";
		String nws06Student1 = "nws06_12312312@pb.edu.bn";
		System.out.println("Check if student is from nws06");
		System.out.println(nws06Student1.startsWith("nws06"));
		System.out.println(ins03Student1.startsWith("nws06"));
		System.out.println("Check if student is from PB");
		System.out.println(nws06Student1.endsWith("@pb.edu.bn"));
		System.out.println(ins03Student1.endsWith("@pb.edu.bn"));
		
		// Retrieve specific character in a String (using index)
		String zeroToNine = "0123456789";
		System.out.println("Index 6: " + zeroToNine.charAt(6));
		System.out.println("Index 2: " + zeroToNine.charAt(2));
		
		// Retrieve number of characters in a String
		System.out.println(zeroToNine.length());
		
		// Combine (Concatenate) Strings
		System.out.println(s1 + " / " + s4);
		System.out.println(s1.concat(" / ").concat(s4));
		System.out.println(s1.concat(" / ".concat(s4)));
		
	}
	
}














