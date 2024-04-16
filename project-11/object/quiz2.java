package object;

public class quiz2 {

	public static void main(String[] args) {
		//Object는 모든 클래스의 부모이기 때문에 형변환 가능
		Object student = new Student3(2016, "kim");
		
		if ( student instanceof Student3) {
			Student3 s = (Student3) student;
			
			System.out.println("학번: "+s.id);
			System.out.println("이름: "+s.name);
		}

	}

}
