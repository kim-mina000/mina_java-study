package abstractex;

public class quiz2 {

	public static void main(String[] args) {
		// 변수의 자료형으로 Bus만 쓸수잇음
		Car2 bus = new Bus();
		// 변수의 자료형으로 AutoCar만 쓸수잇음
		AutoCar autocar = new AutoCar();
		
		bus.run();
		bus.refuel();
		if ( bus instanceof Bus ) {
			Bus bus2 = (Bus) bus;
			bus2.takePassenger();
		} else {
			System.out.println("bus is not a car.");
		}
		


		
		autocar.run();
		autocar.refuel();
		autocar.load();
	}

}
abstract class Car2 {
	abstract public void run();
	abstract public void refuel();
}

class Bus extends Car2{

	@Override
	public void run() {
		System.out.println("버스가 달립니다");
	}

	@Override
	public void refuel() {
		System.out.println("천연 가스를 충전 합니다");
	}

	public void takePassenger() {
		System.out.println("승객을 버스에 태웁니다");
	}
	
}
class AutoCar extends Car2{

	@Override
	public void run() {
		System.out.println("자동차가 달립니다");
	}

	@Override
	public void refuel() {
		System.out.println("휘발유를 주유 합니다");
	}

	public void load() {
		System.out.println("짐을 싣습니다");
	}
	
}