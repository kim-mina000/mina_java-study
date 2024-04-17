package string;

public class quiz2 {

	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
		
		String personalID = "990101-2068234";
		
//		String keyNum = personalID.substring(7,8);
		char keyNum = personalID.charAt(7);
		System.out.println(keyNum);
		
		if(keyNum=='1' || keyNum=='3') {
			System.out.println("성별은 남자입니다");
		} else	if(keyNum=='2' || keyNum=='4') {
			System.out.println("성별은 여자입니다");
		} else {
			System.out.println("성별을 판독할 수 없습니다");
		}

		
	}

}
