package string;

public class quiz3 {

	public static void main(String[] args) {

		String java = "자바 프로그래밍 입문";
		// 공백을 제외한 글자수만 세어서 출력
		
		String[] java2 = java.split(" ");

		System.out.println("전체: "+(java.length()));
		System.out.println("공백을 제외한 문자열 수: "+(java.length()-(java2.length-1)));
		System.out.println("공백: "+(java2.length-1));
		System.out.println("* * *");
		
		String java3 = java.replaceAll(" ", "");
		System.out.println("공백을 제외한 문자열 수2: "+java3.length());
		System.out.println("* * *");
		
		int tr = 0;
		int f = 0;
		for (int i =0; i < java.length(); i++) {
			if(java.charAt(i) ==' ') {
				tr++;
			} else {
				f++;
			}
		}
		System.out.println("전체: "+java.length());
		System.out.println("공백을 제외한 문자열 수3: "+f);
		System.out.println("공백: "+tr);
		
		quiz4.getCharCount(java);
	}

}
