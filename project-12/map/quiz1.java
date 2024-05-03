package map;

import java.util.Collection;
import java.util.HashMap;

public class quiz1 {

	public static void main(String[] args) {
		HashMap<Character, String> hashMapList = new HashMap<>();
		hashMapList.put('a', "사과");
		hashMapList.put('b', "바나나");
		hashMapList.put('c', "코코넛");
		
		System.out.println(hashMapList.get('b'));
		
		hashMapList.replace('b',"블루베리");
		
		hashMapList.remove('a');
		
		Collection<Character> c = hashMapList.keySet();
		Collection<String> str = hashMapList.values();
		System.out.println(c);
		System.out.println(str);
		
		
	}

}
