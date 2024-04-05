package staticEx;

public class quiz_static {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card card1 = new Card();
		Card card2 = new Card();
		Card card3 = new Card();
		
		System.out.println(card1.getCardNum());
		System.out.println(card2.getCardNum());
		System.out.println(card3.getCardNum());
	}
}

class Card {
	static int count = 100;
	private int cardNum;
	
	public Card() {
		this.cardNum = count;
		count++;
	}

	public int getCardNum() {
		return cardNum;
	}

	public void setCardNum(int cardNum) {
		this.cardNum = cardNum;
	}
	
	
}