package conditional;
import java.util.Scanner;

public class Quiz5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
	
		// int month = 0;
		System.out.println("월을 입력해 주세요 : ");
		int month = scanner.nextInt();
		
		if ( month <= 0 || month >= 13) {
			System.out.println("월이 잘못되었습니다");
		} else if ( month >= 3 && month <= 5) {
			System.out.println("현재 계절은 봄입니다");
		} else if ( month >= 6 && month <= 8) {
			System.out.println("현재 계절은 여름입니다");
		} else if ( month >= 9 && month <= 11) {
			System.out.println("현재 계절은 가을입니다");
		} else {
			System.out.println("현재 계절은 겨울입니다");
		}
	}

}
