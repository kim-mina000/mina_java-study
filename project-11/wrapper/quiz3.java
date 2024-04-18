package wrapper;

import java.util.Scanner;

public class quiz3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 두개 입력 해 주세요: ");
		
		String num1 = scanner.nextLine();
		String num2 = scanner.nextLine();
		
		int sum = Integer.parseInt(num1)+Integer.parseInt(num2);
		
		System.out.println("입력받은 숫자는 "+num1+", "+num2+"이고, 두 수의 합은 "+sum+" 입니다");

	}

}
