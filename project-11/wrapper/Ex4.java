package wrapper;

import java.util.ArrayList;

public class Ex4 {

	public static void main(String[] args) {

		ArrayList<Boolean> list = new ArrayList<Boolean>();
		// 리스트는 기초타입으로 정의될 수 없음 이럴때는 wrapper클래스를 사용
		
		list.add(true); // new Boolean(true)로 변환됨 오토박싱
		list.add(true);
		list.add(false);
		
		boolean b = list.get(0);
//		list.get(0).booleanValue();  으로 변환 됨 언박싱

		
	}

}
