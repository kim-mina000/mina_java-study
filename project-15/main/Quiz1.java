package main;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[5];
		
		System.out.println("숫자 다섯개를 입력하세요: ");
		
		for (int i =0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		};
		
		int sum = 0;

		for (int i =0; i < arr.length; i++ ) {
			sum += arr[i];
		};
		
		System.out.println("모든 수의 합은 "+sum+" 입니다");
		
		
	}
	
}
