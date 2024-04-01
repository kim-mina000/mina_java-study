package method;

public class quiz2 {
	public static int comparison (int num1, int num2) {
		if (num1 > num2) {return num1;}
		else if (num1 < num2) {return num2;}
		return num2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = comparison(5, 1);
		System.out.println(num);
		num = comparison(10, 9);
		System.out.println(num);
		num = comparison(1, 5);
		System.out.println(num);
		num = comparison(3, 2);
		System.out.println(num);
	}

}
