package downcasting;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 부모 타입으로 형변환
		Animal animal = new Human();
		
		// 이렇게 할수도잇지만?
		// Tiger tiger = (Tiger) animal;
		
		
		// 항상 체크를 해서 런타입 오류가 안나도록 하자!!
		if ( animal instanceof Human) {
			Human human = (Human) animal;
			human.readBook();
		}
		
		
	}

}
class Animal{
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}
class Human extends Animal{
	public void move() {
		System.out.println("사람이 두 발로 걷습니다");
	}
	public void readBook() {
		System.out.println("사람이 책을 읽습니다");
	}
}
class Tiger extends Animal{
	public void move() {
		System.out.println("호랑이가 귀여워");
	}
	public void hunting() {
		System.out.println("호랑이 사냥해");
	}
}
class Eagle extends Animal{
	public void move() {
		System.out.println("독수리가 하늘을 납니다");
	}
	public void flying() {
		System.out.println("독수리 하늘날아");
	}
}