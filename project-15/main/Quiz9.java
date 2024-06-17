package main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Quiz9 {

	public static void main(String[] args) throws IOException {
		
		// 폴더 경로
		File dis = new File("C:\\Users\\G201\\Downloads");
		System.out.println(dis.isDirectory());
		
		FileWriter fw;
		fw = new FileWriter("quiz9_t.txt");

		try {
			printFileList(dis.getPath(), fw,0);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
//		try {
//			fw = new FileWriter("quiz9.txt");
//			FileWrite(dis, fw);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		
	}
	
//	public static void FileWrite(File file, FileWriter fw) {
//		try {
//			File[] files = file.listFiles();
//
//			for(File f: files) {
//				if (f.isFile()) {
//					String filename = f.getName();
//					fw.write(filename);					
//					fw.write("\n");
//				} else if (f.isDirectory()) {
//					String filename = f.getName();
//					fw.write(filename);		
//					fw.write("\n* * * 하위폴더 * * *\n");
//					FileWrite(f,fw);
//				}
//				
//				
//				fw.flush();	
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}

	public static void printFileList(String filepath, FileWriter fw, int level) throws IOException {
		//filepath 최상위경로
		
		File dir = new File(filepath);
		
		// 폴더 밑에 있는 파일 목록 꺼내기
		File[] files = dir.listFiles();
		
		for (int i = 0 ; i <files.length; i++) {
			// 배열에서 파일꺼내기
			File file = files[i];
			
			// 디렉토리 여부 확인
			boolean isDirectory = files[i].isDirectory();
			
			// 파일 이름 꺼내기
			String fileName = file.getName();
			
			StringBuilder builder = new StringBuilder();
			
			// 들여쓰기로 계층구조 표시
			for (int j = 0 ; j <level; j++) {
				builder.append("\t");
			}
			
			builder.append(fileName);
			
			// 파일 이름 출력
			fw.write(builder.toString());
			
			if (isDirectory) {
				fw.write("\n");
				String subfilepath = file.getPath();
				
				printFileList(subfilepath, fw, level+1); // 자기 자신을 호출하는 재귀함수
				
			}
			fw.write("\n");
		}
		fw.flush();
	}
	
}
