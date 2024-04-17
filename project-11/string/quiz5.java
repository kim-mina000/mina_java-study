package string;

import java.util.Scanner;

public class quiz5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("문자열을 입력해주세요: ");
		String str = scanner.nextLine();

		for (int i = str.length()-1; i >= 0 ; i--) {
			System.out.print(str.charAt(i));
		}
		
		System.out.println();
		System.out.println("* * *");
		String[] str2 = str.split("");
		String str3 = "";
		for (int i = str2.length-1; i >=0; i--) {
			str3 += str2[i];
		}
		System.out.println(str3);
		
		// 4.StringBuilder 클래스 사용 (원본이 변경됨)
		StringBuilder builder = new StringBuilder(str);
		builder.reverse();
		System.out.println(builder);
	}
	

}
