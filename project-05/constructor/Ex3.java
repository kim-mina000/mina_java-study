package constructor;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Board board = new Board(7, "Musical", "Wicked", "Winnie Holzman");
		System.out.println(board);
	}

	
}

class Board {
	int no;
	String title;
	String content;
	String writer;
	
	public Board() {
		super();
	}

	
	public Board(int no, String title, String content, String writer) {
		super();
		this.no = no;
		this.title = title;
		this.content = content;
		this.writer = writer;
	}


	@Override
	public String toString() {
		return "Board [no=" + no + ", title=" + title + ", content=" + content + ", writer=" + writer + "]";
	}
	
	
}