package object;

public class quiz3 {

	public static void main(String[] args) {
		Dog dog = new Dog("진돗개","멍멍이");
		System.out.println(dog);
		}

}
class Dog {
	String name;
	String type;
	
	public Dog(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	}
	
	@Override
	public String toString() {
		return this.name+" "+this.type;
	}
	
	
}