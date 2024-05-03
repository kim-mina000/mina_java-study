package collection;

import java.util.HashSet;
import java.util.Iterator;

public class quiz4 {

	public static void main(String[] args) {
		HashSet<Integer> intt = new HashSet<>();
		
		intt.add(1);
		intt.add(2);
		intt.add(3);
	
		
		System.out.println(intt.size());
		
		// Iterator
		Iterator<Integer> ir = intt.iterator();
		while (ir.hasNext()) {
			int i = ir.next();
			System.out.print(i+ " ");
		}
		
		// Lamba식 for문
		for (int i : intt) {
			System.out.print(i+ " ");
		}
		

	}

}
