package polymorphism;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal human = new Human();
		Animal tiger = new Tiger();
		Animal eagle = new Eagle();
		
		human.move();
		tiger.move();
		eagle.move();
	}

}
class Animal{
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}
class Human extends Animal {
	@Override
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
}
class Tiger extends Animal {
	@Override
	public void move() {
		System.out.println("호랑이 발바닥 왕 크니까 왕 귀엽다.");
	}
}
class Eagle extends Animal {
	@Override
	public void move() {
		System.out.println("독수리가 하늘을 납니다.");
	}
}