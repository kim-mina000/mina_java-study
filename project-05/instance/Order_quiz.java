package instance;

public class Order_quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order order = new Order();
		
		order.orderNum = 1111;
		order.date = "2024년 4월 2일";
		order.orderName = "김민아";
		order.address = "서울시 영등포구 여의도동 20번지";
		
		order.showOrderInfo();
		
	}

}
