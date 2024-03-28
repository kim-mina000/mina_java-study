package conditional;
import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자를 입력해주세요: ");
        int num = scanner.nextInt();
		
		if ( num % 2 ==0 || num % 3 ==0) {
			System.out.println("2또는 3의 배수 입니다");
		} else {
			System.out.println("2또는 3의 배수가 아닙니다.");
		}
		scanner.close();
	}

}
