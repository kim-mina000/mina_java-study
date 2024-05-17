package main;

import java.io.FileWriter;
import java.io.IOException;

public class Quiz5 {

	public static void main(String[] args) {
		
		try {
			FileWriter fw = new FileWriter("quiz5.txt");
			for (int i = 1; i <=10; i++) {
				if (i%2==0) {
//					fw.write(i); // 숫자로 인식 -> 코드체계에 따라 문자로 변환
					fw.write(i+ " ");
				}
				
			}
			fw.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		// 버퍼 비우기 안하면 출력 안됨~!
			
	}

}
