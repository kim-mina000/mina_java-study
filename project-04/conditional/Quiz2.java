package conditional;
import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("나이를 입력해 주세요: ");
		int age = scanner.nextInt();
		scanner.nextLine(); // 남아 있는 엔터(줄바꿈)를 소비합니다.
		System.out.println("성별을 입력해 주세요 (F/M): ");
		String genders = scanner.nextLine(); //scanner는 string으로만 받아올수 있음
		char gender = genders.charAt(0); //그래서 string에서 맨 앞의 char 하나만 떼옴
//		int age = 8;
//		String gender = "F";
		
		System.out.println("나이는 "+age+"살 성별은 "+gender+"입니다");
		if ( age >= 8  && gender =='F') {
			System.out.println("여학생입니다.");
		} else if ( age >= 8 && gender == 'M') {
			System.out.println("남학생입니다.");
		}
		
	}

}
