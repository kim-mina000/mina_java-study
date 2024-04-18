package wrapper;

public class quiz1 {

	public static void main(String[] args) {

		String num = "10";
		
		// 문자열을 숫자로 바꾸기 위해서는 parse 메소드 사용
		byte bNum = Byte.parseByte(num);
		short sNum = Short.parseShort(num);
		int iNum = Integer.parseInt(num);
		long lNum = Long.parseLong(num);
		
		String num2 = "10.0";
		
		float fNum = Float.parseFloat(num2);
		double dNum = Double.parseDouble(num2);
		
		// 기초타입의 값을 문자열로 변환
		String a = "10";
		String b = "1.123";
		String c = "c";
		String d = "true";

		// 첫번째 방법
		a = Integer.toString(10);
		b = Double.toString(1.123);
		c = Character.toString('c');
		d = Boolean.toString(true);
		
		// 두번째 방법
		a = String.valueOf(10);
		b = String.valueOf(1.123);
		c = String.valueOf('c');
		d = String.valueOf(true);
		// valueOf -> null안정성이 높음 
	}

}
