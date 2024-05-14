package main;

public class Ex3 {

	public static void main(String[] args) {
		
		
		try {
			int[] arr = new int[5];
			arr[5] = 5;			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		} 
		
		System.out.println("프로그램이 정상 종료됩니다");
	}

}
