package quiz;

public class Quiz7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean result1 = (1 == 2) || (1 < 2); //1과 2가 같거나 1보다 2가 작다면 true => true
		boolean result2 = true && false; //true 이고 false이면 true => 둘다 true여야 true이므로 false
		boolean result3 = !false; //false이 아니다 => true
		
		int x = 1;
		int y = 5;
		boolean result4 = (x<y) || (x==y); //1<5거나 1과5가 같다 => 둘중에 하나만 만족해도 되므로 true
		
	}

}
