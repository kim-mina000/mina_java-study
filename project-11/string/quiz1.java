package string;

public class quiz1 {

	public static void main(String[] args) {

		String abcd = "a:b:c:d";
		System.out.println(abcd.replace(":", "#"));
		
		String introduce = "안녕하세요 저는 둘리입니다";
		int index = introduce.indexOf("둘리");
		System.out.println(index);
		String dullri = introduce.substring(index, index+2);
		System.out.println(dullri.toString());
	}

}
