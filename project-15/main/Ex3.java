package main;

import java.io.FileInputStream;
import java.io.IOException;

public class Ex3 {

	public static void main(String[] args) {
		
		try {
			// 입력스트림 생성
			FileInputStream fis = new FileInputStream("input.txt");
			
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println();
			
			FileInputStream fis2 = new FileInputStream("input.txt");
			
			// 아스키코드를 문자로 변환하여 출력
			System.out.println((char) fis2.read());
			System.out.println((char) fis2.read());
			System.out.println((char) fis2.read());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
