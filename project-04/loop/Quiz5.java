package loop;

public class Quiz5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i =1; i <= 100; i++) {
			if (i % 3 ==0) {
				System.out.println(i); 
			}
		}
		System.out.println("==============="); 
		for (int i = 1;  i<=100; i++) {
			if (i % 2 == 0) {continue;}
			System.out.println(i); 
		}
	}
}
