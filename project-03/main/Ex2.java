package main;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 증감연산자가 변수의 뒤에 있을때
		int x = 100;
		int y = x++;
		int z = x--;

		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		// 증감연산자가 변수의 앞에 있을때
		x = 100;
		y = ++x;
		z = --x;

		System.out.println(x);
		System.out.println(y);
		System.out.println(z);

	}

}
