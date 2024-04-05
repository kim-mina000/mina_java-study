package object;

public class quiz_bus_subway {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student2 student1 = new Student2("둘리",5000);
		Student2 student2 = new Student2("도우너",10000);
		
		Bus bus = new Bus(100);
		Subway subway = new Subway(2);
		
		student1.takeBus(bus);	
		student2.takeSubway(subway);
		
		student1.showInfo();
		student2.showInfo();
		bus.showInfo();
		subway.showInfo();
		
		Taxi taxi = new Taxi();

		student1.setMoney(15000);
		student1.takeTaxi(taxi);
		student1.showInfo();
		taxi.showInfo();
	}

}
