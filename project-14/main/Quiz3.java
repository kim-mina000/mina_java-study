package main;

public class Quiz3 {

	public static void main(String[] args) {

		Object obj = new Integer(0);
		
		try {
			String str = (String) obj; // 형변환에러
			
		} catch (ClassCastException e) {
			e.printStackTrace();
		}
		System.out.println("냥");
		
	}

}
