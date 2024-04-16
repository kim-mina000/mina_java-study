package main;

public class Ex01 {

	public static void main(String[] args) {
//		Calc calc = new Calc();
		// 추상 클래스 처럼 상속받아지는게 목적! 직접 쓸수는 없음
		
		Calulator calulator = new Calulator();
		

		System.out.println(calulator.add(10, 5));
		System.out.println(calulator.substract(10, 5));
		System.out.println(calulator.times(10, 5));
		System.out.println(calulator.divide(10, 5));

	}

}
class Calulator implements Calc {

	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int substract(int num1, int num2) {
		return num1 - num2;
	}

	@Override
	public int times(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		return num1 / num2;
	}
	
	public void showInfo() {
		System.out.println("Calc 인터페이스를 구현하였습니다");
	}
	
}