package main;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//정수형의 강제 형변환
		int i = 1000;
		
		// 강제형변환이 발생할때는 자료형을 정확히 명시해야함
		byte b = (byte) i ;
		System.out.println(b); // -24
		
		// 실수형의 강제 형변환
		double d = 1.2;
		float f = (float) d;
	}

}
