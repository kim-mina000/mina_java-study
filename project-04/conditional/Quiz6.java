package conditional;

public class Quiz6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 95;
		
		if (score <= 0 || score >= 100) {
			System.out.println("잘못된 값입니다");
		} else if ( score >= 90 && score<= 99 ) {
			System.out.println("수");
		} else if ( score >= 80 && score<= 89 ) {
			System.out.println("우");
		} else if ( score >= 70 && score<= 79 ) {
			System.out.println("미");
		} else {
			System.out.println("양");
		} 
	}

}
