package wrapper;

import java.util.ArrayList;

public class quiz2 {

	public static void main(String[] args) {

		ArrayList<Character> list = new ArrayList<>();
		
		// 오토박싱
//		list.add(new Character('a'));
//		list.add(new Character('b'));
//		list.add(new Character('c'));
//		list.add(new Character('d'));
		list.add('a'); 
		list.add('b');
		list.add('c');
		list.add('d');
		
		//언박싱
//		System.out.print(list.get(0).charValue()+", ");
//		System.out.print(list.get(1).charValue()+", ");
//		System.out.print(list.get(2).charValue()+", ");
//		System.out.println(list.get(3).charValue());
		for (int i = 0; i < list.size(); i++) {
			char ch = list.get(i);
			System.out.println(ch);
		}
		
		System.out.println(list); 
		
		// 오토박싱은 넣을때 언박싱은 꺼낼때~!
	}

}
