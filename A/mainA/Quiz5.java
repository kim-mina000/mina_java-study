package mainA;

import java.util.ArrayList;

public class Quiz5 {

	public static void main(String[] args) {
		ArrayList<Boolean> blist = new ArrayList<>();
		
		blist.add(true);
		blist.add(true);
		blist.add(false);
		
		for (int i = 0; i < blist.size(); i++) {
			System.out.print(blist.get(i)+" ");
		}
		for (boolean bool : blist) {
			System.out.println(bool + " ");
		}
		System.out.println();
		System.out.println(blist.get(0));
		System.out.println(blist.get(blist.size()-1));
	}

}
