package collection;

import java.util.HashSet;
import java.util.Iterator;

public class Ex3 {

	public static void main(String[] args) {
		
		HashSet <String> hashSet = new HashSet<>();
		// index값(식별자)이 없기 때문에 get함수는 쓸 수 없음
		
		hashSet.add("둘리");
		hashSet.add("또치");
		hashSet.add("도우너");
		hashSet.add("도우너");
		
		// 리스트와 삭제 방법이 다름
		hashSet.remove("도우너");
		
		// Iterator 객체 생성하여 set을 순회하기
		Iterator<String> ir = hashSet.iterator();
		// Iterator는 기억장치가 있음 현재 내 위치가 어디에 있는지 알고 있다
		// 그래서 next 함수를 통해 다음 요소를 가져올 수 있음
		
		while (ir.hasNext()) { // 다음요소가 있으면
			String member = ir.next(); // 다음요소를 가져옴
			System.out.print(member + " ");
		}
		
		// 위의 내용을 풀어서 써보기~!
//		while ( true ) {
//			if(ir.hasNext() == true) {
//				String member = ir.next();
//				System.out.print(member+ " ");
//			} else {
//				break;
//			}
//		}
		
		// 일반 for 문 - index 필요함
		// 람다식 for 문
		// 값을 저장할 변수 : 자료구조
		for (String member : hashSet) {
			System.out.print(member + " ");
		}
	}

}
