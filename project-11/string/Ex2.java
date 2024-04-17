package string;

public class Ex2 {

	public static void main(String[] args) {

		String str = "test";
		System.out.println("str 문자열 값 :"+str+", 주소: "+str.hashCode());
		
		str = "aaa";
		System.out.println("str 문자열 값 :"+str+", 주소: "+str.hashCode());
	}

}
