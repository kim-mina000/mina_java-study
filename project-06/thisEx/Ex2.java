package thisEx;

public class Ex2 {

	public static void main(String[] args) {
		Person person = new Person();
		
		person.setName("kim");
		System.out.println(person);
		person.printThis();
	}

}
class Person {
	
	String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void printThis() {
		System.out.println(this);
	}
}