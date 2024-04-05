package staticEx;

public class student {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
class Student {
	static int count = 0; // 공통속성
	int studentID;
	String studentName;
	
	public Student() {
		count++; // 학생이 생성될 때마다 증가
		studentID = count; // 증가된 값을 학번에 부여
	}
}