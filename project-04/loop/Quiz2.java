package loop;

public class Quiz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 11;
		int sum = 0;
		
		while (num <= 20) {
			sum += num;
			num++;
		}
		
		System.out.println("11부터 20까지의 합 : "+sum );
	}

}
