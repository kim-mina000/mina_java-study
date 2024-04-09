package arrayList;

import java.util.ArrayList;

public class quiz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Boolean> list = new ArrayList<Boolean>();
		
		list.add(true);
		list.add(true);
		list.add(false);
		
		for (Boolean o : list) {
			System.out.print(o + " ");
		}
		System.out.println();
		System.out.println(list.get(0));
		System.out.println(list.get(list.size()-1));
	}

}
