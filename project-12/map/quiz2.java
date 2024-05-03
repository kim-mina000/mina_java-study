package map;

import java.util.HashMap;

public class quiz2 {

	public static void main(String[] args) {
		HashMap<String, Integer> hashMapList = new HashMap<>();
		
		hashMapList.put("국어", 80);
		hashMapList.put("수학", 90);
		hashMapList.put("영어", 100);
		
		hashMapList.remove("영어");
		
		
		for(String key: hashMapList.keySet()) {
			System.out.println("key: "+key + ", value: "+hashMapList.get(key));
		}

		System.out.println("map의 요소: "+hashMapList);
		
		System.out.println("map의 크기: "+hashMapList.size());
	}

}
