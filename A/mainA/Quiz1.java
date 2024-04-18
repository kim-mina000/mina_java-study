package mainA;

public class Quiz1 {

	public static void main(String[] args) {
		System.out.println(add(100,10));
		
	}
	public static int add (int num1, int num2) {
		int sum = 0;
		
		if ( num1 >= num2 ) { 
			int n = num1;
			num1 = num2;
			num2 = n;
		}
		
		for (int i = num1; i <= num2; i++) {
			sum +=i;
		}
		return sum;
	}

}
