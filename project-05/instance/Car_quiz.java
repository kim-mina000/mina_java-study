package instance;

public class Car_quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		
		car.showInfo();
		
		car.condition = true;
		car.showInfo();
		
		car.chaneCondition(false);
		car.showInfo();
	}

}
