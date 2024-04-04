package hiding;

public class quiz_car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car();
		car1.setColor("white");
		car1.setCompany("hyndai");
		car1.setMaxSpeed(200);
		car1.setModel("sonata");
		
		System.out.println("제조사: "+ car1.getCompany());
		System.out.println("모델명: "+ car1.getModel());
		System.out.println("색상: "+ car1.getColor());
		System.out.println("최고속도: "+ car1.getMaxSpeed());
	}

}

class Car {
	private String company;
	private String model;
	private String color;
	private int maxSpeed;
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public Car(String company, String model, String color, int maxSpeed) {
		super();
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	public Car() {
	}
}