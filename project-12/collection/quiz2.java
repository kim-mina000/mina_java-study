package collection;

import java.util.ArrayList;

public class quiz2 {

	public static void main(String[] args) {
		ArrayList<Book> bookList = new ArrayList<>();
		
		bookList.add(new Book (1000, "레베카"));
		bookList.add(new Book (1001, "오만과 편견"));
		bookList.add(new Book (1002, "프랑켄슈타인"));
		
		for (int i = 0; i <bookList.size(); i++) {
			System.out.println(bookList.get(i).toString());
		}
		
		for (int j = bookList.size()-1 ; j >= 0; j--) {
			bookList.remove(j);
		}
		bookList.clear();
		System.out.println(bookList);
		

	}

}

class Book {
	int bookNumber;
	String title;
	/**
	 * @param bookNumber
	 * @param title
	 */
	public Book(int bookNumber, String title) {
		this.bookNumber = bookNumber;
		this.title = title;
	}
	@Override
	public String toString() {
		return "Book [bookNumber=" + bookNumber + ", title=" + title + "]";
	}
	
	
	
}
