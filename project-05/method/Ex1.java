package method;

public class Ex1 {
	// 매개변수가 없고 반환값이 없는 메소드
	public static void method1 () {
		System.out.println("매개변수와 반환값이 둘 다 없는 메소드 입니다.");
		return; //생략가능
	}

	//매개변수가 없고 반환값이 있는 메소드
	public static String method2 () {
		return "매개변수가 없지만 반환값이 있는 메소드 입니다.";
	}
	
	// 매개변수가 있고 반환값이 없는 메소드
	public static void method3 (int num1, int num2) {
		int sum = num1+num2;
		System.out.println("sum : "+sum);
	}
	
	//매개변수가 있고 반환값이 있는 메소드
	public static int method4(int num1, int num2) {
		return num1+num2;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method1();
		String str = method2();
		method3(1,2);
		int i = method4(1,2);
	}

}
