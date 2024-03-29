package loop;

public class QuizMina {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		for (int i = 4; i >= 0; i--) {
			for (int j = 1; j <= 10; j++,a--) {
				if ( a % 2 != 0) {
					System.out.print(" ");
					} else {
						System.out.print("*");
					}

			}
			System.out.println();
		}
	}

}
