package object;

public class quiz_taxi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Taxi {
	int passengerCount;
	int money;
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	public void showInfo() {
		System.out.println("택시의 승객은 "+passengerCount+"명이고, 수입은 "+money+"원 입니다.");	
		
	}
}