package main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Quiz5 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요.");
		
		//"abc"를 입력하세요!
		
		try {
			int num = scanner.nextInt();			
		} catch (InputMismatchException e) {
			e.printStackTrace();
			
		}
		System.out.println("냥뇽녕");
	}

}
