package polymorphism;

public class quiz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		runCar(new Bus());
		runCar(new Sportscar());

	}
	public static void runCar(Car car) {
		car.move();
	}

}
class Car {
	public void move () {
		System.out.println("차가 달린다");
	}
}
class Bus extends Car {
	@Override
	public void move () {
		System.out.println("버스가 달린다");
	}
}
class Sportscar extends Car {
	@Override
	public void move () {
		System.out.println("스포츠카가 달린다");
	}
}