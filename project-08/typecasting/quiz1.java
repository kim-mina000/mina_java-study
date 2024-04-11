package typecasting;

public class quiz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent pc = new Child("한국","고","길동");
		System.out.println(pc.lastName);
		System.out.println(pc.national);
		System.out.println();
	}

}
class Parent {
	String national;
	String lastName;
	
	public Parent(String national, String lastName) {
		super();
		this.national = national;
		this.lastName = lastName;
	}
}

class Child extends Parent{
	String firstName;

	public Child(String national, String lastName, String firstName) {
		super(national, lastName);
		//부모에 디폴트 생성자가 없으면 super()코드는 사용할 수 없음
		this.firstName = firstName;
	}
	
}