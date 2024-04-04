package hiding;
import java.util.Scanner;

public class quiz_myDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDate3 date = new MyDate3();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("월을 입력해 주세요: ");
		date.setMonth(scanner.nextInt());
		
		System.out.println("현재 "+date.getMonth()+"월 입니다");
	}

}

class MyDate3 {
	private int month;
	private int day;
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		if( month > 0 && month <13) {
			this.month = month;			
		} else {
			System.out.println("잘못된 월입니다.");
		}
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	
	
}