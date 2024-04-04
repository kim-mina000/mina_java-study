package hiding;

public class quiz_book {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book1 = new Book("자바프로그래밍", 20000, "한빛컴퍼니", 300);
		Book book2 = new Book();
		book2.setCost(15000);
		book2.setPageNum(500);
		book2.setPublisher("한빛컴퍼니");
		book2.setTitle("스프링");
		
		System.out.println("title: "+book1.getTitle()+", cost: "+book1.getCost()+", publisher: "+book1.getPublisher()+", pagenum: "+book1.getPageNum());
		System.out.println("title: "+book2.getTitle()+", cost: "+book2.getCost()+", publisher: "+book2.getPublisher()+", pagenum: "+book2.getPageNum());
		
	}

}
class Book{
	private String title;
	private int cost;
	private String publisher;
	private int pageNum;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public int getPageNum() {
		return pageNum;
	}
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
	
	public Book() {
		
	}
	public Book(String title, int cost, String publisher, int pageNum) {
		super();
		this.title = title;
		this.cost = cost;
		this.publisher = publisher;
		this.pageNum = pageNum;
	}
	
	
	
}