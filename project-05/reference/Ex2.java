package reference;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 1;
		int num2 = 1;
		boolean result1 = (num1==num2);
		System.out.println(result1);
		
		Subject math1 = new Subject("수학",85);
		Subject math2 = new Subject("수학",85);
		boolean result2 = (math1==math2);
		System.out.println(result2);
		
	}

}
