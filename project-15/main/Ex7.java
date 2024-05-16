package main;

import java.io.FileOutputStream;

public class Ex7 {

	public static void main(String[] args) {
		
		try {
			// 출력스트림 생성
			FileOutputStream fos = new FileOutputStream("output2.txt");
			
			// 배열생성
			 byte[] arr = {65, 66, 67};
//			 String str = "집에 강아지 있어요";
//			 byte[] arr2 = str.getBytes(str);
			 
			 // 배열을 사용해서 내용 쓰기. 배열의 모든 내용을 한번에 출력
			 fos.write(arr);
//			 fos.write(arr2);
			 
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
