package collection;

import java.util.ArrayList;

public class quiz1 {

	public static void main(String[] args) {
		
		// (1)
		ArrayList <Character> list = new ArrayList<>();
		
		list.add('A');
		list.add('B');
		list.add('C');
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		
		list.remove(1);
		System.out.println(list.size());
		
		// (2)
//		(2) -1
//		if (list.indexOf('A') > -1) {
//			list.remove(list.indexOf('A'));
//		}
//		(2) -2
//		list.remove((Character)'A');
		for (int i = 0; i < list.size(); i++) {
			char ch = list.get(i);
			if (ch == 'A') {
				list.remove(i);
			}
		}
		System.out.println(list);
	
		
		
	}
}
