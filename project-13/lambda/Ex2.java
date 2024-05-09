package lambda;

public class Ex2 {

	public static void main(String[] args) {
		
		// 부모타입 변수 선언 = 람다식 함수
		Calc calc = (x,y) -> x + y;
		// 추상메소드 -> (구현메소드)  -> 람다식
		System.out.println(calc.add(1, 2));
		
		// 람다식 동작 원리
		// 컴파일러가 람다식을 익명클래스로 변환하고, 클래스의 인스턴스를 생성함
		Calc calc2 = new Calc() {
			@Override
			public int add (int num1, int num2) {
				return num1 + num2;
			}
		};
		// 위의 식이 생략되어서 바로 나오는것!
		

	}

}
// 함수형 인터페이스
// @는 어노테이션이라고 불림 
// 1. 어떤 목적을 가지고 *동작*을 구현하거나
// 2. *의미*만 가지고 있는 경우에 붙여줌
// 추상메소드가 한개 이상 추가되는 것을 막음 (억제기역할) 없어도 상관은 없음!
@FunctionalInterface
 interface Calc {
	int add (int num1, int num2);
}
