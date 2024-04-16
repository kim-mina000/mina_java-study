package object;

public class quiz1 {

	public static void main(String[] args) {
		Date date1 = new Date(2024, 4, 16);
		Date date2 = new Date(2024, 4, 16);

		System.out.println(date1.equals(date2));
		if (date1.equals(date2)) {
			System.out.println("date1과 date2는 같은 날짜 입니다.");
		} else {
			System.out.println("date1과 date2는 다른 날짜 입니다.");
		}
	}

}

class Date {
	int year;
	int month;
	int date;
	
	public Date(int year, int month, int date) {
		super();
		this.year = year;
		this.month = month;
		this.date = date;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Date) {
			Date date = (Date) obj;
			if (this.year == date.year && this.month == date.month && this.date == date.date) {
				return true;
			} 
		} return false;
	} 
	
}