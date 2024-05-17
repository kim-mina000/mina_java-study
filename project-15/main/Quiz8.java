package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Quiz8 {

	public static void main(String[] args) {
		File file = new File("C:\\Users\\G201\\Downloads");
		System.out.println(file.isDirectory());
		
		File[] files = file.listFiles();
		
		
		try {
			// 출력 스트림 생성
			FileWriter fw = new FileWriter("quiz8.txt");
			
//			for (int i = 0; i < files.length; i++) {
//				// 파일 이름 꺼내서
//				File f = files[i];
//				String filename = file.getName();
//				
//				// 텍스트 파일에 쓰기
//				fw.write(filename);
//				fw.write("\n");
//				
//				fw.flush();
//			}
			
			for (File f : files) {
				String filename = f.getName();
				fw.write(filename);
				fw.write("\n");
				
				fw.flush();
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		for (File f: files) {
			System.out.println(f);
		}
	}

}
