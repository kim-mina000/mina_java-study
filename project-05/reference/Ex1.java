package reference;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Subject math = new Subject("수학", 85);
		 Subject korean = new Subject("국어", 100);
		Student student = new Student(7, "kim",math,korean);
		
		System.out.println(student);
	}



}

class Student {
	int studentId;
	String studentName;
	Subject math;
	Subject korean;
	
	public Student(int studentId, String studentName, Subject math, Subject korean) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.math = math;
		this.korean = korean;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", math=" + math + ", korean="
				+ korean + "]";
	}
	
}

class Subject {
	String subjectName;
	int scorePoint;
	
	public Subject(String subjectName, int scorePoint) {
		super();
		this.subjectName = subjectName;
		this.scorePoint = scorePoint;
	}

	@Override
	public String toString() {
		return "Subject [subjectName=" + subjectName + ", scorePoint=" + scorePoint + "]";
	}
	
	
}