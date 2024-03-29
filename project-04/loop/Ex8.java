package loop;

public class Ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;

		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				continue;
			}
			sum += i;
		}
		System.out.println("1부터 10까지의 홀수들의 합은 " + sum + "입니다");
	}
}
