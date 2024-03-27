package quiz;

public class Quiz9 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char z = (5>3) ? '오' : '삼';
		System.out.println(z);
		
		int x = 10 ;
		int y = 20;
		int result = (x>10) ? y+10 : y-10; // x가 10보다 크다 => 참이면 y에 10을 더하고, 거짓이면 y에서 10을 뺀다
		System.out.println(result); // 10
	}
}
