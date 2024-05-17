package main;

import java.io.File;
import java.io.IOException;

public class Ex13 {

	public static void main(String[] args) {
		// File: 파일 정보를 담는 클래스 (활용도가 제일 높음!)
		// 파일의 경로, 크기 등 정보를 확인하거나 파일을 생성할 수 있음
		// 입출력이 모두 가능해 사용이 자유로운 편 
		// 파일 뿐만 아니라 디렉토리도 담을 수 있음
		
		// newFile.txt와 연결된 파일 클래스 생성
		// 파일이 존재하지 않으면 알아서 생성 해줌	
		// 실제 파일을 만드는게 아니라 디렉토리와 연결된 File객체를 만들어주는 일임!
		File file = new File("C:\\0_kimmina\\newFile.txt");
		
		try {
			// 실제 파일 생성
			file.createNewFile();
			
			// 파일 속성 보기
			System.out.println("파일인지? "+ file.isFile()); 
			System.out.println("폴더인지? " + file.isDirectory());
			System.out.println("파일이름? " + file.getName());
			System.out.println("파일경로? " + file.getAbsolutePath());
			System.out.println("읽을 수 있는지? " + file.canRead());
			System.out.println("쓸 수 있는지? " + file.canWrite());
			
			// 파일 삭제
			file.delete();
			
			File dir = new File("C:\\\\0_kimmina");
			
			// 폴더 밑에있는 파일 목록
			File[] files = dir.listFiles();
			
			for (File f : files) {
				System.out.println(f.toString());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
