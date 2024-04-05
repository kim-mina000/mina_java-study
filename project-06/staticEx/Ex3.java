package staticEx;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("원의 넓이: "+ 10*10*Calculator.pi);
		System.out.println("두 수의 합: "+ Calculator.plus(10, 5) );
		System.out.println("두 수의 차: "+Calculator.minus(10, 5));
		
	}

}


class Calculator {
	static double pi = 3.14159; //원의 둘레를 구하는 파이는 공통속성
	
	static int plus(int x, int y) {
		return x+y;
	}
	static int minus(int x, int y) {
		return x-y;
	}
}