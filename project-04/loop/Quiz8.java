package loop;

public class Quiz8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 3; i <= 9 ; i+=2) {
			System.out.println("* * * "+i+"단 * * *");			
			for(int j = 1; j <= 9 ; j++) {
				System.out.println(i + "X" + j + "=" + i*j);
			}
			}
		}
	}


