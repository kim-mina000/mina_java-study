package thisEx;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Birthday birthday = new Birthday();
		
		birthday.setYear(2000);
		
		System.out.println(birthday);
		birthday.printThis();

	}

}
class Birthday{
	private int year;

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public void printThis() {
		System.out.println(this);
	}
	
}