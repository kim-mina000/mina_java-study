package main;

public class Quiz1 {

	public static void main(String[] args) {

		
		try {
			int num = 5/0;			
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}

		System.out.println("프로그램이 정상 종료됩니다."); // 마지막 문장 실행 안됨

	}

}
