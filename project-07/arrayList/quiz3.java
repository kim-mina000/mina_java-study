package arrayList;

import java.util.ArrayList;

public class quiz3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> list = new ArrayList<String>();
		list.add("AA");
		list.add("BB");
		list.add("CC");
		list.add("DD");
		list.add("EE");
		
		for (String i : list) {
			System.out.print(i+ " ");
		}System.out.println();
		list.removeAll(list);
		System.out.println(list);
		
		//뒤부터 삭제
//		list.remove(4);
//		list.remove(3);
//		list.remove(2);
//		list.remove(1);
//		list.remove(0);
				
		//앞부터 삭제
		//list.remove(0); //중간에 있던 요소가 삭제하면 배열은 연속된 구조이기 때문에 뒤에 있던 요소가 앞으로 한칸 이동한다
		//list.remove(0);
		//list.remove(0);
		//list.remove(0);
		//list.remove(0);
				
		//잘못된 경우
		//list.remove(0);
		//list.remove(1);
		//list.remove(2);
		//list.remove(3);
		//list.remove(4);
		
	}

}
