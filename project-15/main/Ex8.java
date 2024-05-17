package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex8 {

	public static void main(String[] args) {
//		문자 단위 스트림
//		FileReader로 읽기

		// reader.txt 파일 먼저 만들기
		// 파일 내용 읽어오기
		
		FileInputStream fis;
		try {
			fis = new FileInputStream("reader.txt");
			while ( true ) {
				int i = fis.read(); // 1바이트씩 읽기
				if (i==-1) {
					break;
				}
				System.out.print((char) i); // 한글은 1byte로 표현할수 없어서 모두 깨짐
				
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println();
		
		// 문자 기반 입력 스트림 생성
		try {
			FileReader fr = new FileReader("reader.txt");
			
			while(true) {
				int i = fr.read();
				if (i==-1) {
					break;
				}
				System.out.print((char) i);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
