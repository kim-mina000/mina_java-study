package conditional;
import java.util.Scanner;

public class Quiz4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("숫자를 입력 해주세요: ");
		int i = scanner.nextInt();
		
		if ( i > 100 && i < 200 ) {
			System.out.println("i는 100이상 200이하 입니다.");
		} else {
			System.out.println("i는 100보다 작거나 200보다 큽니다");
		}
	}

}
