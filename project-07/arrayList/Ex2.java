package arrayList;
import java.util.ArrayList;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		
		for (int i =0; i < list.size(); i++) {
			int num = list.get(i);
			System.out.print(num + " ");
		}
	}

}
