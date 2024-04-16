package object;

public class Ex_4 {

	public static void main(String[] args) {
		
		Book2 book = new Book2(200,"프랑켄슈타인");
		System.out.println(book.toString());
		System.out.println(book);
		
		Book2 book2 = book;
		System.out.println(book.hashCode());
		System.out.println(book2.hashCode());
	}

}
class Book2 {
	int bookNumber;
	String bookTitle;
	
	public Book2(int bookNumber, String bookTitle) {
		super();
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}

//	@Override
//	public String toString() {
//		return "Book [bookNumber=" + bookNumber + ", bookTitle=" + bookTitle + "]";
//	}
	
	
	
}