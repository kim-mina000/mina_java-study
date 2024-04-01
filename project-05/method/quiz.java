package method;

public class quiz {
	
	public static void calculation (int num1, int num2) {
		System.out.println(num1 + " + " + num2 + " = "+(num1+num2));
		System.out.println(num1 + "  - " + num2 + " = "+(num1-num2));
		System.out.println(num1 + " * " + num2 + " = "+(num1*num2));
		System.out.println(num1 + " / " + num2 + " = "+(num1/num2));
		System.out.println(num1 + " % " + num2 + " = "+(num1%num2));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculation(10, 5);
	}

}
