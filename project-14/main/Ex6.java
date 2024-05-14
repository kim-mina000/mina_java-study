package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex6 {

	public static void main(String[] args) {
		
		// FileInputStream: 파일을 열어서 읽고 쓰는 입력 클래스
		// 파일을 열 때, 파일이 위치에 없으면 오류가 발생할 수 있음
		
		try {
			FileInputStream fis = new FileInputStream("src/main/a.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("냥뇽녕");
		

	}

}
