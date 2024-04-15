package abstractex;

import java.util.ArrayList;

public class quiz4 {

	public static void main(String[] args) {
		ArrayList<Car2> car2List = new ArrayList<Car2>();
		
		car2List.add(new Bus());
		
		for ( int i = 0; i < car2List.size(); i++) {
			Car2 car2 = car2List.get(i);
			car2.run();
			car2.refuel();
			
			
		}

		car2List.get(0).run();
		car2List.get(0).refuel();
		if ( car2List.get(0) instanceof Bus ) {
			Bus bus = (Bus)  car2List.get(0);
			bus.takePassenger();
		} else {
			System.out.println("it is not bus");
		}

		car2List.add(new AutoCar());
		car2List.get(1).run();
		car2List.get(1).refuel();
		if ( car2List.get(1) instanceof AutoCar ) {
			AutoCar autocar = (AutoCar)  car2List.get(1);
			autocar.load();
		} else {
			System.out.println("it is not autocar");
		}
	}

}
