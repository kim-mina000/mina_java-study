package staticEx;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//학생을 생성하면 학번을 자동으로 부여받음
		Student student1 = new Student();
		student1.studentName = "둘리";
		System.out.println(student1.studentName + "학번: "+student1.studentID);
		
		Student student2 = new Student();
		student2.studentName = "또치";
		System.out.println(student2.studentName + "학번: "+student2.studentID);
		
		System.out.println(Student.count);
		
	}

}
