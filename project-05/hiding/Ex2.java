package hiding;
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		MyDate2 date = new MyDate2();
		
		System.out.println("일을 입력해주세요: ");
		int d = scanner.nextInt();
		date.setDay(d);
		scanner.nextLine();
//		date.setDay(30);

		System.out.println("월을 입력해주세요: ");
		int m = scanner.nextInt();
		date.setMonth(m);
		scanner.nextLine();
		
		
//		date.toString();
		System.out.println("현재 날짜는 "+date.getMonth() +"월" + date.getDay() +"일 입니다");
//		date.setDay(10);
	}

}
class MyDate2 {
	private int month;
	private int day;
	
	public int getMonth() {
		return month;
	}
	
	public void setMonth(int month) {
		if (month == 2) {
			if( day < 1 || day>29 ) {
				System.out.println("2월에는 "+day+" 일이 없습니다!");
				return;
			}
		}
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	
	public void setDay(int day) {
		this.day = day;
	}

	@Override
	public String toString() {
		return "MyDate2 [오늘은" + month + "월, " + day + "일 입니다.]";
	}
	
}
