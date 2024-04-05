package object;

public class Ex1 {

	public static void main(String[] args) {
		Student2 student = new Student2("애옹",10000);
		
		Bus bus = new Bus(100);
		
		student.takeBus(bus);
		
		student.showInfo();
		bus.showInfo();
		
		Subway subway = new Subway(1);
		
		student.takeSubway(subway);
		
		student.showInfo();
		subway.showInfo();
		
		

	}

}

class Bus {
	int busNumber;
	int passengerCount;
	int money;
	
	public void setBusNumber(int busNumber) {
		this.busNumber = busNumber;
	}
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	public void showInfo() {
		System.out.println("버스 "+busNumber+"번의 승객은 "+passengerCount+"명이고, 수입은 "+money+"원 입니다.");	
	}
	public Bus(int busNumber) {
		super();
		this.busNumber = busNumber;
	}
	
}
class Subway {
	int lineNumber;
	int passengerCount;
	int money;
	
	public void setLineNumber(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	public void showInfo() {
		System.out.println("지하철 "+lineNumber+"번의 승객은 "+passengerCount+"명이고, 수입은 "+money+"원 입니다.");	
	}
	public Subway(int lineNumber) {
		super();
		this.lineNumber = lineNumber;
	}
	
}

class Student2 {
	String name;
	int money;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money  -= 1000;
	}
	public void takeSubway(Subway subway) {
		subway.take(1500);
		this.money  -= 1500;
	}
	// 택시 탑승 추가
	public void takeTaxi(Taxi taxi) {
		if ( this.money < 10000) {
			System.out.println("잔액이 부족합니다.");
			return;
		} else {
			taxi.take(10000);			
			this.money  -= 10000;
		}
	}
	public void showInfo() {
		System.out.println(name+"님의 남은 돈은  "+money+"원 입니다.");	
	}
	public Student2(String name, int money) {
		super();
		this.name = name;
		this.money = money;
	}
	
}