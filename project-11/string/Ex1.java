package string;

public class Ex1 {

	public static void main(String[] args) {

		// 리터럴 방식으로 문자열 객체 생성
		String str1 = "test";
		String str2 = "test";
		
		// new 방식으로 문자열 객체 생성
		String str3 = new String("test");
		
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
	}

}
