package loop;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0 ;
		sum = sum + 1;
		sum = sum + 2;
		sum = sum + 3;
		sum = sum + 4;
		sum = sum + 5;
		sum = sum + 6;
		sum = sum + 7;
		sum = sum + 8;
		sum = sum + 9;
		sum = sum + 10;
		System.out.println("1부터 10까지의 합은 "+ sum);
		
		int num = 1;
		int sum2 = 0;
		
		while (num<= 10) {
			sum2 += num;
			num++;
		}
		System.out.println("1부터 10까지의 합은 "+ sum2);
	}

}
