package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex8 {
	
	public static void openTextFile() throws FileNotFoundException {
		
		FileInputStream fis = new FileInputStream("src/main/a.txt");
	}

	public static void main(String[] args) {
		
		try {
			openTextFile();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
