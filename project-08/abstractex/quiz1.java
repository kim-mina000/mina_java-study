package abstractex;

public class quiz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car avante = new Avante();
		Car sonata = new Sonata();
		
		avante.start();
		avante.drive();
		avante.stop();
		avante.turnoff();
		
		sonata.start();
		sonata.drive();
		sonata.stop();
		sonata.turnoff();
	}

}

abstract class Car {
	public abstract void start();

	public abstract void drive();

	public abstract void stop();

	public abstract void turnoff();
}

class Sonata extends Car {
	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Sonata 시동을 켭니다");
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("Sonata 달립니다");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Sonata 멈춥니다");
	}

	@Override
	public void turnoff() {
		// TODO Auto-generated method stub
		System.out.println("Sonata 시동을 끕니다");
	}

}

class Avante extends Car {

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Avante 시동을 켭니다");
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("Avante 달립니다");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Avante 멈춥니다");
	}

	@Override
	public void turnoff() {
		// TODO Auto-generated method stub
		System.out.println("Avante 시동을 끕니다");
	}

}
