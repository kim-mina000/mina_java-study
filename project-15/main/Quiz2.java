package main;

import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("두자리 정수를 입력하세요 :");
		
		int num;
		int sum = 0;
		num = scanner.nextInt();
		
		while( num >= 100 || num < 9 ) {
			System.out.println("두자리 정수를 입력하세요");
			num = scanner.nextInt();
		};
		
		sum += num%10;
		sum += num/10;
		
		
		System.out.println(sum);

	}

}
