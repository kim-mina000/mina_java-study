package arrayList;

import java.util.ArrayList;

public class Ex4 {

	public static void main(String[] args) {
		Student2 student1 = new Student2("둘리");
		
		student1.subjectList.add(new Subject2("국어", 100));
		student1.subjectList.add(new Subject2("수학", 50));
		
		student1.showInfo();
		
		Student2 student2 = new Student2("도우너");
		
		student2.subjectList.add(new Subject2("국어", 70));
		student2.subjectList.add(new Subject2("영어", 85));
		student2.subjectList.add(new Subject2("과학", 70));
		student2.subjectList.add(new Subject2("사회", 85));
		
		student2.showInfo();
		

	}

}
class Subject2 {
	String name;
	int score;
	
	public Subject2(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	
}
class Student2 {
	String studentName;
	ArrayList<Subject2> subjectList;
	
	public Student2(String studentName) {
		super();
		this.studentName = studentName;
		
		subjectList = new ArrayList<Subject2>();
	}
	
	public void showInfo() {
		int total = 0;
		
		for(Subject2 s : subjectList) {
			total += s.score;
		}
		System.out.println(studentName + " 학생의 총점은 "+total+" 입니다.");
	}
	
}