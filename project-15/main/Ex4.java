package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex4 {

	public static void main(String[] args) {
		
		// 입력 스트림 생성
		try {
//			FileInputStream fis = new FileInputStream("input.txt");

			FileInputStream fis = new FileInputStream("input2.txt");
			
			// 반목문을 사용해서 파일 내용 끝까지 읽기
			while (true) {
				int i = fis.read(); // 1바이트 씩 읽기
				
				if (i == -1) { // 파일의 끝에 도달하면 -1을 반환
					break;
				}
				
				System.out.println((char) i);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
