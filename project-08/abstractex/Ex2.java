package abstractex;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal1 = new Dog();
		animal1.breathe();
		animal1.sound();
		
		Animal animal2 = new Cat();
		animal2.breathe();
		animal2.sound();
	}	

}
abstract class Animal{
	public void breathe() {
		System.out.println("숨을 쉽니다");
	}
	 public abstract void sound();
}

class Cat extends Animal{

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("애웅");
	}
	
}
class Dog extends Animal{
	public void sound() {
		System.out.println("몽몽");
	}
}