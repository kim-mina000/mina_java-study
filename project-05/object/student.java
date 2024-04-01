package object;

/*학생을 정의하는 클래스*/

public class student {
		// 학생의 속성을 멤버 변수로 선언
		
		int studentID;
		String studentName;
		int grade;
		String address;
		
		public void goSchool() {
			System.out.println("학교에간다");
		}
		
		public void study() {
			System.out.println("공부를 한다");
		}
}
