package downcasting;
import java.util.ArrayList;

public class quiz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Animal> animalList = new ArrayList<Animal>();
		
		animalList.add(new Human());
		animalList.add(new Tiger());
		animalList.add(new Eagle());

		
		for (Animal animal : animalList) {
			if (animal instanceof Human) {
				Human human = (Human) animal;
				human.readBook();
			} else if (animal instanceof Tiger) {
				Tiger tiger = (Tiger) animal;
				tiger.hunting();
			} else if (animal instanceof Eagle) {
				Eagle eagle = (Eagle) animal;
				eagle.flying();
			}
		}
		
	}

}
