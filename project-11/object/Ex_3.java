package object;

public class Ex_3 {

	public static void main(String[] args) {
		
		Student3 student1 = new Student3(1001,"둘리");
		Student3 student2 = new Student3(1001,"둘리");
		
		if (student1 == student2) {
			System.out.println("student1와 student2의 주소는 같습니다.");
		} else {
			System.out.println("student1와 student2의 주소는 다릅니다.");
		}
		
		if (student1.equals(student2)) {
			System.out.println("student1와 student2는 같은 학생입니다.");
		} else {
			System.out.println("student1와 student2는 다른 학생입니다.");
		}
	}

}
class Student3 {
	int id;
	String name;
	
	public Student3(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student3) {
			Student3 student = (Student3) obj;
			if(this.id == student.id) {
				return true;
			}
		}
		return false;
	}
	
	
	
}
