package arrayList;

import java.util.ArrayList;

public class quiz_student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList <Student> studentList = new ArrayList<Student>();
		Subject subject1 = new Subject();
		studentList.add(new Student("kim",3,subject1));
		
		Subject subject2 = new Subject();
		Student student2 = new Student("park",1,subject2);
		studentList.add(student2);
		
		Subject subject3 = new Subject();
		Student student3 = new Student("seo",2,subject3);
		studentList.add(student3);
		
		for (Student s : studentList) {
			s.showStudentInfo();
		}
		
	}

}
class Student {
	String studentName;
	int grade;
	Subject subject;
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {

		this.grade = grade;
	}
	public Student() {
	}
	public Student(String studentName, int grade, Subject subject) {
		super();
		this.studentName = studentName;
		this.grade = grade;
		this.subject = subject;
	}
	
	public void showStudentInfo() {
		System.out.println("학생이름: "+getStudentName()+", 학년: "+getGrade());
	}
	
	
}
class Subject {
	String subjectName;
	int subjectScore;
	public Subject() {
		super();
	}

	
	
}