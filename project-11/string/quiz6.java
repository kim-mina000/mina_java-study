package string;

import java.util.ArrayList;
import java.util.Scanner;

public class quiz6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<>();
		
		while(true) {
			System.out.println("문자열을 입력해 주세요 (종료: end 입력) ");
			String str = scanner.nextLine();
			if (str.toLowerCase().indexOf("end") >= 0) {
				break;
			} else {
				list.add(str);
			}
		}
		
		System.out.println("입력받았던 문자열: " + list);
		
	}

}
