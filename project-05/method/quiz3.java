package method;

public class quiz3 {
	public static int add(int num1, int num2) {
		int sum = 0;
		
		if (num1 > num2) {
			for (int i = num2; i <= num1; i++) {
				sum += i;
				}
			} else if (num1 < num2) {
				for (int i = num1; i <= num2; i++) {
					sum += i;
				}
			} else if (num1 == num2) {
					sum = num1;
			}
			return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = add(100, 150);
		System.out.println(num);
		num = add(0, 0);
		System.out.println(num);
		num = add(1, 10);
		System.out.println(num);
		num = add(9, 3);
		System.out.println(num);
		num = add(2, 5);
		System.out.println(num);
		
	}

}
