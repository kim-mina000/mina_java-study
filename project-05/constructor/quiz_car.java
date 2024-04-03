package constructor;

public class quiz_car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car();
		car1.brand = "현대";
		car1.model = "쏘나타";
		car1.color = "흰색";
		car1.maxSpeed = 200;
		Car car2 = new Car("기아", "레이", "검정색", 150);

		System.out.println(car1);
		System.out.println(car2);
	}

}

class Car {
	String brand;
	String model;
	String color;
	int maxSpeed;
	
	public Car(){
		
	}

	public Car(String brand, String model, String color, int maxSpeed) {
		super();
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", model=" + model + ", color=" + color + ", maxSpeed=" + maxSpeed + "]";
	}

	
	
}