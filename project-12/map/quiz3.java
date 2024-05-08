package map;

import java.util.HashMap;

public class quiz3 {

	public static void main(String[] args) {
		HashMap<String, Float> hashMapList = new HashMap<>();
		hashMapList.put("국어", 80.0f);
		hashMapList.put("수학", 90.0f);
		hashMapList.put("영어", 100.0f);
		
		System.out.println(hashMapList.keySet());
		System.out.println(hashMapList.values());
		
		for(String str : hashMapList.keySet()) { // 람다식 포문에 배열과 collection(set,list 등)은 올수 있지만 map은 올수 없음
			System.out.print(str + " ");
		}
		
		System.out.println();
		
		for(Float f : hashMapList.values()) {
			System.out.print(f + " ");
		}
		
	}

}
