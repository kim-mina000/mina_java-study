package arrayList;
import java.util.ArrayList;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		
		// 2번째 위치에 요소추가
		list.add(1, 40);
		
		System.out.println(list);
		
		// 리스트에 저장된 요소 꺼내기
		int num1 = list.get(1);
		int num2 = list.get(2);
		int num3 = list.get(3);
		
	}

}

