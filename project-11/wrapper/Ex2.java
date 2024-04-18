package wrapper;

public class Ex2 {

	public static void main(String[] args) {

		Integer inum1 = new Integer(100);
		Integer inum2 = 100; // 오토박싱
		
		int num1 = inum1.intValue();
		int num2 = inum1; // 언박싱
		
		// 참조형과 기본형 간의 연산
		int num3 = inum1 + 100;
		System.out.println("num3 : "+num3);
		
		Boolean boolean1 = new Boolean(true);
		Boolean boolean2 = false;
		
		boolean bool1 = boolean1.booleanValue();
		boolean bool2 = boolean2;
		
		System.out.println("bool1 : "+bool1);
		System.out.println("bool2 : "+bool2);

		// Character 클래스
		Character character1 = new Character('A');
		Character character2 = 'B'; // 오토박싱으로 객체 생성

		char char1 = character1.charValue(); //char값 꺼내기
		char char2 = character2; //언박싱으로 값 꺼내기
		
		System.out.println("char1: " + char1);
		System.out.println("char2: " + char2);
	}
	

}
