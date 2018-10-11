package week14.learningjavaio;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileScannerClass {

	public static void main(String[] args) {
		File file = new File("data.xml");
		try {
			Scanner readFile = new Scanner(file);
			
			while(readFile.hasNextLine()) {
				System.out.println(readFile.nextLine());
			}
			
			readFile.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
