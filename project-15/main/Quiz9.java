package main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Quiz9 {

	public static void main(String[] args) {
		
		File dis = new File("C:\\Users\\G201\\Downloads");
		System.out.println(dis.isDirectory());
		
		FileWriter fw;
		try {
			fw = new FileWriter("quiz9.txt");
			FileWrite(dis, fw);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	public static void FileWrite(File file, FileWriter fw) {
		try {
			File[] files = file.listFiles();

			for(File f: files) {
				if (f.isFile()) {
					String filename = f.getName();
					fw.write(filename);					
					fw.write("\n");
				} else if (f.isDirectory()) {
					String filename = f.getName();
					fw.write(filename);		
					fw.write("\n* * * 하위폴더 * * *\n");
					FileWrite(f,fw);
				}
				
				
				fw.flush();	
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
