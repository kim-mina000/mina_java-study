package override;

public class quiz1 {

	public static void main(String[] args) {
		Animal cat = new Cat();
		Animal dog = new Dog();
		cat.eat();
		cat.sound();
		dog.eat();
		dog.sound();

	}

}
class Animal {	
	public void eat() {
		System.out.println(" 먹는다");
	}
	
	public void sound() {
		System.out.println(" 짖는다");
	}
}
class Cat extends Animal{

	@Override
	public void eat() {
		System.out.print("고양이는 쥐를");
		super.eat();
	}

	@Override
	public void sound() {
		System.out.print("고양이는 야옹하고");
		super.sound();
	}

}
class Dog extends Animal{

	@Override
	public void eat() {
		System.out.print("개는 고기를");
		super.eat();	
	}

	@Override
	public void sound() {
		System.out.print("개는 멍멍하고");
		super.sound();
	}
	
}