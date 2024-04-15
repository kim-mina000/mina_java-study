package abstractex;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Computer computer = new Computer();
		// 추상 클래스는 인스턴스 생성 못함
		
		DeskTop deskTop = new DeskTop();
		NoteBook notebook = new NoteBook();
		
		deskTop.turnOn();
		deskTop.turnOff();
		deskTop.display();
		deskTop.typing();
		
		notebook.turnOn();
		notebook.turnOff();
		notebook.display();
		notebook.typing();
		};
	

}

abstract class Computer{
	public void turnOn() {
		System.out.println("전원을 켭니다");
	}
	public void turnOff() {
		System.out.println("전원을 끕니다");
	}
	
	// 컴퓨터 마다 화면을 표시하는 방법이 다르기 때문에 추상 메소드로 선언
	public abstract void display();
	
	public abstract void typing();

}

class DeskTop extends Computer{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("DeskTop Display()");
	}

	@Override
	public void typing() {
		// TODO Auto-generated method stub
		System.out.println("DeskTop Typing()");
	}
	
}
class NoteBook extends Computer {

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("NoteBook Display()");
	}

	@Override
	public void typing() {
		// TODO Auto-generated method stub
		System.out.println("NoteBook Typing()");
	}
	
}