package main;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Quiz7 {

	public static void main(String[] args) {
		
		try {
			// 바이트 스트림.... 이친구는 한글을 못써용 ...
			FileOutputStream fos = new FileOutputStream("quiz7.txt");
			// 보조스트림 생성~!
			OutputStreamWriter osw = new OutputStreamWriter(fos);
			
			osw.write("프로그래밍");
			osw.write('냥');
			
			// OutputStreamWriter도 버퍼를 사용함 버퍼를 비워야 내용이 한번에 출력~!
//			osw.flush();
			osw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
