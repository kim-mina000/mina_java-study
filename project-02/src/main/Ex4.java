package main;

/*정수자료형*/
public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		short s = 10;
		byte b = 10;
		int i = 10;
		long l = 10;
		
		//long 타입에 값을 담을 때, int 형 범위를 넘어가면 식별자를 붙여야한다
		l = 12345678900l;
		
		System.out.println(s+b); // 서로 다른 타입끼리도 계산 가능하다
		//b =200; //범위에 벗어나는 값을 입력하면 에러 byte -128~127사이
	}

}
