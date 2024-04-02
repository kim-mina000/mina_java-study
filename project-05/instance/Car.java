package instance;

public class Car {
	boolean condition;
	
	public void chaneCondition(boolean con) {
		condition = con;
	}
	public void showInfo() {
		if(condition) {
			System.out.println("자동차는 현재 달리는 상태(true)입니다");
		} else {
			System.out.println("자동차는 현재 멈춘 상태(false)입니다");
		}
	}
}
