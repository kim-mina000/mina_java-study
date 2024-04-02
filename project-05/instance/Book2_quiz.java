package instance;

public class Book2_quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Book2 book = new Book2();
			Book2 book2 = new Book2();
			
			book.title = "자바프로그래밍";
			book.cost = 20000;
			book.publisher = "한빛컴퍼니";
			book.pageNum = 300;
			
			book.showInfo();
			
			book2.title = "스프링";
			book2.cost = 15000;
			book2.publisher = "한빛컴퍼니";
			book2.pageNum = 500;
			
			book2.showInfo();
	}

}
