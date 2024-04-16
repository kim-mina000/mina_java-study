package main;

public class quiz1 {

	public static void main(String[] args) {

		Calc calc = new Calulator();
		
		if( calc instanceof Calulator) {
			Calulator c = (Calulator) calc;
			c.showInfo();
		}
	}

}
