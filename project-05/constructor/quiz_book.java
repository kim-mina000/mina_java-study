package constructor;

public class quiz_book {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book book1 = new Book("스트링부트", 30000, "한빛출판사", 200);
		Book book2 = new Book("자바프록래밍", 10000, "금빛출판사", 300);
		
		
		System.out.println(book1);
		System.out.println(book2);
	}

}

class Book {
	String title;
	int cost;
	String publisher;
	int pageNum;
	
	public Book(){
	}

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