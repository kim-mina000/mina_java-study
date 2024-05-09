package lambda;

public class Quiz1 {

	public static void main(String[] args) {

		// 구현 클래스 사용하여 max() 호출
		MyNumber number1 = new MySort();
		System.out.println(number1.max(10, 20));
		
		
		// Q. 익명 클래스를 사용하여 max()를 호출하세요
		MyNumber number2 = new MyNumber() {
			@Override
			public int max(int x, int y) {
				int tmp = x;
				tmp = x > y? x : y;
				return tmp;
			}
		};
		
		System.out.println(number2.max(1000, 2000));
		
		
		// Q. 람다식 함수를 사용하여 max()를 호출하세요
		MyNumber number3 = (x,y) -> {
				int tmp = x;
				tmp = x > y? x : y;
				return tmp;
		};
		
		System.out.println(number3.max(100, 200));
	}

}

@FunctionalInterface
interface MyNumber{
	// 더 큰 값을 구하는 메소드
	int max(int x, int y);
}

// 구현 클래스 만들기!
class MySort implements MyNumber{

//	@Override
//	public int max(int x, int y) {
//		int tmp = x;
//		tmp = x > y? x : y;
//		return tmp;
//	}
	
	@Override
	public int max(int x, int y) {
		return Math.max(x, y);
	}
	
}