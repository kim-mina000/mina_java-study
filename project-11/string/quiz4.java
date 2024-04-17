package string;

public class quiz4 {

	public static void main(String[] args) {

		// 이전 문제를 함수형태로 바꾸고 호출하세요	
		getCharCount("자바 프로그래밍 입문");
		getCharCount("equals 메소드는 두 객체가 같은지 비교한다");

	}

	public static void getCharCount(String str) {
		int tr = 0;
		int f = 0;
		
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == ' ') {
				tr++;
			} else {
				f++;
			}
		}
		
		System.out.println("전체: "+str.length());
		System.out.println("공백을 제외한 문자열 수: "+f);
		System.out.println("공백: "+tr);
		
	}

}
