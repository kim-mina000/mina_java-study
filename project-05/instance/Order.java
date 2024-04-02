package instance;

public class Order {
	int orderNum ;
	String date;
	String orderName;
	String address;	
	
	public void showOrderInfo() {
	System.out.println("주문번호: "+ orderNum);
	System.out.println("주문날짜: "+ date);
	System.out.println("주문자 이름: "+ orderName);
	System.out.println("배송지: "+address);
	}
}
