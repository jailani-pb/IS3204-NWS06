package week14.learningjavaio;

import java.io.File;
import java.util.Date;

public class FileClass {

	public static void main(String[] args) {
		// Windows:
		// "C:\\Users\\PC-NAME\\NWS06.txt"
		// "D:\\NWS06.txt"
		File file = new File("/home/jailanihar/NWS06.txt");
		System.out.println("Does it exists? " + file.exists());
		System.out.println("Is it a directory? " + file.isDirectory());
		System.out.println("Is it a file? " + file.isFile());
		System.out.println("Absolute Path: " + file.getAbsolutePath());
		System.out.println("File name: " + file.getName());
		System.out.println("Last modified: " +
								new Date(file.lastModified()));
		// Before running the next statements,
		// make sure you are not reading any important files.
		File file2 = new File("/home/jailanihar/NWS06-PRA.txt");
		file.renameTo(file2);
		file2.delete();
	}
	
}




