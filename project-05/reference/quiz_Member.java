package reference;

public class quiz_Member {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book1 = new Book("Rebecca", 15120, "현대문학", 600);
		Book book2 = new Book("이처럼 사소한 것들", 10920, "다산책방", 132);
		Book book3 = new Book("1984", 9900, "민음사", 444);
		Member member = new Member(0410, "kim", book1, book2, book3);
		
		System.out.println(member);

	}
}
class Member {
	
	int memberNum;
	String memberName;
	Book book1;
	Book book2;
	Book book3;
	
	public Member(int memberNum, String memberName, Book book1, Book book2, Book book3) {
		super();
		this.memberNum = memberNum;
		this.memberName = memberName;
		this.book1 = book1;
		this.book2 = book2;
		this.book3 = book3;
	}
	@Override
	public String toString() {
		return "Member [memberNum=" + memberNum + ", memberName=" + memberName + ", book1=" + book1 + ", book2=" + book2
				+ ", book3=" + book3 + "]";
	}
	
	
}
class Book {
	String title;
	int  cost;
	String publisher;
	int pageNum;
	
	public Book(String title, int cost, String publisher, int pageNum) {
		super();
		this.title = title;
		this.cost = cost;
		this.publisher = publisher;
		this.pageNum = pageNum;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", cost=" + cost + ", publisher=" + publisher + ", pageNum=" + pageNum + "]";
	}
	
	
}
