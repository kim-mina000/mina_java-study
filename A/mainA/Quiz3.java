package mainA;

import java.util.Scanner;

public class Quiz3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("연산자를 입력해 주세요: ");
		String c = scanner.nextLine();

		System.out.println("계산할 두 수를 입력 해 주세요: ");
		int n1 = scanner.nextInt();
		int n2 = scanner.nextInt();
		
		
		System.out.println(calc(n1,n2,c));
		
		
	}
	
	public static int calc (int n1, int n2, String c) {

		switch (c) {
		case "+": {
			return n1 + n2;
		}
		case "-": {
			return n1 - n2;
		}
		case "*": {
			return n1 * n2;
		}
		case "/": {
			return n1 / n2;
		}
		default: {
			return -999;
		}
	}
}
	
}
