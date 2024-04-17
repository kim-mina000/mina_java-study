package object;

import java.util.ArrayList;

public class Ex5 {

	public static void main(String[] args) {

		String str1 = new String("test");
		System.out.println(str1.toString());
		System.out.println(str1);
		
		String strr = "testt";
		System.out.println(strr);
		
		String str2 = new String("test");
		
		if(str1.equals(str2)) {
			System.out.println("str1와 str2는 같은 문자열 입니다");
		}
		
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(1);
		System.out.println(arr.toString());
		int[] arrr = {1,2,3,4,5};
	}

}
