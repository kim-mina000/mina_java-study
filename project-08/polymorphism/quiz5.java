package polymorphism;
import java.util.ArrayList;

public class quiz5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		Customer customer1 = new Customer("kim");
		Customer customer2 = new GoldCustomer("park");
		Customer customer3 = new VIPCustomer("seo");
		
		
		customerList.add(customer1);
		customerList.add(customer2);
		customerList.add(customer3);
	
		
		for (Customer customer : customerList) {
			customer.calcPrice(10000);
			customer.showInfo();
		}
	}

}
class GoldCustomer extends Customer{
	
	double saleRatio;
	
	public GoldCustomer(String customerName) {
		super(customerName);
		customerGrade = "Gold";
		bonusRatio = 0.02;
		saleRatio = 0.1;
		System.out.println("GoldCustomer() 생성자 호출");
	}
	@Override
	public void calcPrice(int price) {
//		super.calcPrice(price);
		bonusPoint = bonusPoint + (price * bonusRatio);
		int salePrice = price - (int)(price * saleRatio);
		System.out.println(customerName+"님이 " + salePrice + "원을 결제했습니다.");
	}
}