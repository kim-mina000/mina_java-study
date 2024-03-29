package loop;

public class Quiz6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
			if(sum>=500) {
				System.out.println("i는 " + i + ", sum은 " + sum);
				break;
			}	
		}
	}

}
