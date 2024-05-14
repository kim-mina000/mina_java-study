package main;

public class Quiz4 {

	public static void main(String[] args) {
		
		String str = "1.23";
		
		
		try {
			int num = Integer.parseInt(str); // 실수를 정수로 변환하려고해서 에러남
							// 정수클래스.문자열정수->숫자형정수
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		
		System.out.println("냥뇽녕");
	}

}
