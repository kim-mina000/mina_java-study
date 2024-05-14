package main;

/*
 * 발생한 예외와 일치하는 catch문이 없는 경우
 * */
public class Ex5 {

	public static void main(String[] args) {
		
		int[] arr = new int[5];

		try {
			arr[5] = 5; // ArrayIndexOutOfBoundsException 에러 발생
		} catch (ClassCastException e) { // 일치하는 catch문이 없어서 예외처리 안됨
			System.out.println(e);
		} catch (ArithmeticException e) {
			System.out.println(e);
		} catch (Exception e) {
			// Exception형 매개변수를 사용하면, 모든 에러를 처리할 수 있음
			// 최상위 부모
			System.out.println(e); // 에러 메세지만 출력
			e.printStackTrace(); // 에러가 발생한 위치와 에러메세지를 함께 출력
		}

		System.out.println("프로그램이 정상 종료됩니다."); // 마지막 문장 실행 안됨

	}

}
