package mainA;

import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("뺄셈할 숫자 두개를 입력해주세요: ");
		int n1 = scanner.nextInt();
		int n2 = scanner.nextInt();
		
		System.out.println(sub(n1,n2));


	}
	
	public static int sub (int num1, int num2) {
		
		if (num1 < num2)  {
			return -999;
			}
		return num1 - num2;
	}

}
