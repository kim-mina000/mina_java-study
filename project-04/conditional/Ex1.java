package conditional;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 8;
		if (age >= 8) {
			System.out.println("학교에 다닙니다");
		}
		;

		// 블록의 의미
		if (age >= 8) {
			int temp = 0; // temp는 블록 안에서만 존재
		}
		//System.out.println(temp); // 변수가 소멸됨

	}

}
