package main;

import java.util.Scanner;

public class Quiz3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String str = "";
		
		do {
			System.out.println("문자를 입력하세요:");
			str = scanner.nextLine();
//		} while (!str.toUpperCase().equals("STOP"));
		} while (!str.equalsIgnoreCase("STOP"));

		System.out.println("프로그램이 종료 되었습니다");
	}	

}
