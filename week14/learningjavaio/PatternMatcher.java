package week14.learningjavaio;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher {

	public static void main(String[] args) {
		File file = new File("data.xml");
		try {
			Scanner readFile = new Scanner(file);
			StringBuilder fileContent = new StringBuilder();
			while(readFile.hasNextLine()) {
				fileContent.append(readFile.nextLine());
			}
			System.out.println(fileContent);
			
			Pattern xmlFormat = 
					Pattern.compile("^<students>.*</students>$");
			Matcher xmlMatcher = xmlFormat.matcher(fileContent);
			
			if(xmlMatcher.matches()) {
				System.out.println("File is compatible.");
				
				Pattern studentData = 
					Pattern.compile(
							"<student>" +
							"<id>(.+?)</id>" +
							"<name>(.+?)</name>" +
							"</student>"
					);
				Matcher studentMatcher = studentData.matcher(fileContent);
				
				while(studentMatcher.find()) {
					System.out.println(studentMatcher.group(1));
					System.out.println(studentMatcher.group(2));
					System.out.println(studentMatcher.start());
					System.out.println(studentMatcher.end());
				}
				
			} else {
				System.out.println("File is not compatible.");
			}
			
			readFile.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}




