package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Quiz2 {

	public static void main(String[] args) {
		
		// 중간연산자 찾는 Tip!
		// 1. 개수가 유지되어야 하는가?
		// 2. 자료형이 유지되어야 하는가?
		// 3. 값이 유지되어야 하는가?
		
		List <String> strList = new ArrayList<>();
		strList.add("file1.txt");
		strList.add("file2.pdf");
		strList.add("file3.txt");
		strList.add("file4.img");
		strList.add("file5.txt");
		strList.add("file6.img");
		
		Stream<String> strStream1 = strList.stream();
		
		String[] strList2 = {"file1.txt", "file2.pdf","file3.txt","file4.img","file5.txt","file6.img"};
		
		
		// Q1.
		String result = "";
		for (String str : strList) {
			if (str.indexOf("txt")> -1) {
				result += str + " ";
			}
		}
		System.out.println(result);
		
		// filter 조건을 만족하는 요소만 추출
		// forEach 특정작업을 반복적으로 수행(출력)
		strStream1.filter(s -> s.endsWith(".txt")).forEach(s ->System.out.print(s+" ") );
		System.out.println();
		
		// Q2.
		int[] resultList = {0,0,0};
		for (String str: strList) {
			if (str.indexOf("txt")> -1) {
				resultList[0] ++;
			} else if (str.indexOf("pdf")> -1) {
				resultList[1] ++;
			} else if(str.indexOf("img")> -1) {
				resultList[2] ++;
			}
		}
		
		System.out.println("txt파일의 개수: "+resultList[0]);
		System.out.println("pdf파일의 개수: "+resultList[1]);
		System.out.println("img파일의 개수: "+resultList[2]);
		
		Stream<String> strStream2 = strList.stream();
		System.out.println( "txt파일의 개수: "+ strStream2.filter(s -> s.endsWith(".txt")).count()); 
		Stream<String> strStream3 = strList.stream();
		System.out.println( "pdf파일의 개수: "+ strStream3.filter(s -> s.endsWith(".pdf")).count());
		Stream<String> strStream4 = strList.stream();
		System.out.println( "img파일의 개수: "+ strStream4.filter(s -> s.endsWith(".img")).count()); 
		//  endsWith 대신 .contain도 사용가능 그래도 의미상 endsWith가 더 적절
		
		// Q3. 파일의 확장자만 추출하여 출력
		Stream<String> strStream5 = strList.stream();
//		strStream5.map(s -> s.substring(s.indexOf(".")+1)).distinct().forEach(s -> System.out.print(s + " "));
		strStream5.map(s -> {
			String[] strArr = s.split("\\.");
			return strArr[1];
			})
			.distinct()
			.forEach(s -> System.out.print(s + " "));
	}

}
