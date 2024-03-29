package conditional;

public class Quiz8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int score = 89;
		
		int scoreEl = score / 10;
		
		switch (scoreEl) {
		case 9:
			System.out.println("수");
			break;
		case 8:
			System.out.println("우");
			break;
		case 7:
			System.out.println("미");
			break;
		default:
			System.out.println("양");
			break;
		}
	}

}
