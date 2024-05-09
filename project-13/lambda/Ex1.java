package lambda;

public class Ex1 {

	public static void main(String[] args) {
		
		// 클래스로 인터페이스 구현하기
		StringConcat concat1 = new StringConcatImpl(); // 부모타입으로 형변환
		StringConcatImpl concat2 = new StringConcatImpl(); // 자식타입으로 형변환
		
		concat1.makeString("Hello", "World");
		
		// 람다식으로 인터페이스 구현하기 : 클래스가 필요없음
		// 선언타입 리턴타입 이름 변수타입 중괄호 지워짐
		StringConcat concat3 = (s1,s2) -> System.out.println(s1+" "+s2);
		concat3.makeString("냥", "뇽녕");
		// 클래스 선언하지 않고도 함수형 인터페이스에서 바로 사용 가능

	}

}

// 함수형 인터페이스
interface StringConcat {
	// 두 문자열을 연결하는 추상 메소드
	public void makeString(String s1, String s2);
}

// 구현 클래스 만들기
class StringConcatImpl implements StringConcat {

	@Override
	public void makeString(String s1, String s2) {
		System.out.println(s1 + "," + s2);
	}
	
}