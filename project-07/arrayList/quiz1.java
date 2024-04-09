package arrayList;

import java.util.ArrayList;

public class quiz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Character> list = new ArrayList<Character>();
		
		list.add('A');
		list.add('B');
		list.add('C');
		
		System.out.println(list);
		
		for (Character c : list) {
			System.out.println(c);
		}
	}

}
