package override;

public class quiz4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer computer1 = new Computer();
		computer1.on();
		computer1.off();
		Computer computer2 = new Labtop();
		computer2.on();
		computer2.off();
		Computer computer3 = new Desktop();
		computer3.on();
		computer3.off();
	}
}
class Computer {
	public Computer(){
	}
	public void on() {
		System.out.println("컴퓨터를 켠다");
	}
	public void off() {
		System.out.println("컴퓨터를 끈다");
	}
}
class Labtop extends Computer{
	public void on() {
		System.out.println("노트북을 켠다");
	}
	@Override
	public void off() {
		System.out.println("노트북을 끈다");
	}
}
class Desktop extends Computer{
	public void on() {
		System.out.println("데스크탑을 켠다");
	}
	@Override
	public void off() {
		System.out.println("데스크탑을 끈다");
	}
}