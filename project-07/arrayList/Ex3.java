package arrayList;

import java.util.ArrayList;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 리스트 생성
		ArrayList<Book> list = new ArrayList<Book>()	;

		// 리스트에 도서 정보를 추가
		Book book1 = new Book("태백산맥", "조정래");
		list.add(book1);
		
		list.add(new Book("데미안", "헤르만 헤세"));
		list.add(new Book("어떻게 살 것인가", "유시민"));
		list.add(new Book("프랑켄슈타인", "메리 셸리"));
		list.add(new Book("오만과 편견", "제인 오스틴"));
		
		for (Book book : list) {
			book.showBookInfo();
		}
		for (int i = 0; i < list.size();i++) {
			Book book = list.get(i);
			book.showBookInfo();
		}
		
		
		
		
	}

}

class Book {
	String bookName;
	String author;
	
	
	
	public Book(String bookName, String author) {
		super();
		this.bookName = bookName;
		this.author = author;
	}

	public void showBookInfo() {
		System.out.println("Book [bookName=" + bookName + ", author=" + author + "]");
	}
	
	
	
}