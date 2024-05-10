package lambda;

public class Quiz2 {

	public static void main(String[] args) {
		
		// 구현 클래스를 사용하여 helloPrint() 호출
		Hello hello = new DoHello();
		hello.helloPrint();
		
		// 익명 클래스 사용하여 helloPrint()를 호출
		Hello hello2 = new Hello() {
			@Override
			public void helloPrint() {
				System.out.println("Hi~");
			}
		};
		hello2.helloPrint();
		
		// 람다식 함수 사용하여 helloPrint()를 호출
		Hello hello3 =  () -> { System.out.println("Hello"); } ;
		hello3.helloPrint();
		
	}

}
// 함수형 인터페이스
interface Hello {
	// 안녕하세요를 출력하는 메소드
	void helloPrint();
}

// Q. Hello의 구현 클래스 만들기
class DoHello implements Hello {

	@Override
	public void helloPrint() {
		System.out.println("Hi");
	}
	
}