package abstractex;

import java.util.ArrayList;

public class quiz5 {

	public static void main(String[] args) {
		
		ArrayList<Animal2> Animal2List = new ArrayList<>();
		Animal2List.add(new Human());
		Animal2List.add(new Tiger());
		
		for (int i = 0; i < Animal2List.size(); i++) {
			Animal2List.get(i).sleep();
			Animal2List.get(i).move();
			if (Animal2List.get(i) instanceof Human) {
				Human human = (Human) Animal2List.get(i);
				human.readBook();
			}
			else if (Animal2List.get(i) instanceof Tiger) {
				Tiger tiger = (Tiger) Animal2List.get(i);
				tiger.Hunting();
			}System.out.println();
		}
	}

}
