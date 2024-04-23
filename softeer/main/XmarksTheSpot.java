package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class XmarksTheSpot {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		

		System.out.print("몇개의 문자열을 입력 받으시겠습니까? ");
		int lineNum = Integer.parseInt(reader.readLine());
		
//		System.out.println(lineNum);

//		int lineNum = scanner.nextInt();
//		scanner.nextLine();
		String[] str = new String[lineNum];
		String result = "";
		

		
		for (int i = 0 ; i < lineNum; i++) {
			System.out.println("입력할 문자열 (남은 문자열 수 "+(lineNum-i)+"):");
			String s = scanner.nextLine();
			str[i]=s;
			
			for (int j = 0; j <str[i].length(); j++) {
				if(str[i].indexOf('x') < 0) {
					System.out.println("x가 포함되어있지 않습니다");
					
				}
			}
			int index = str[i].indexOf('x');
			int indexBlank = str[i].indexOf(' ');
			result += (str[i].substring((indexBlank+index+1), (indexBlank+index+2))).toUpperCase();
		}

		System.out.println(Arrays.toString(str));
		System.out.println(result);
		
	}

}
