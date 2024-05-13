package stream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Quiz3 {

	public static void main(String[] args) {
		// map함수의 인자는 Function
		// 추상메소드의 기능은 해당 연산자의 기능과 같다
		
		// 이 함수는 요소를 다른 값으로 바꿔서 반환하는 함수
		// 리턴타입 R? 제네릭타입이라는거. 여러분들이 정해주시면 됨!
		
//		R apply(T t) { //t는 주문객체
//			return t.orderNo; // 주문번호로 바꿔서 반환
//		}

		ArrayList <ShoppingMall> list  = new ArrayList<>();
		list.add(new ShoppingMall(1001,2022,300));
		list.add(new ShoppingMall(1002,2022,150));
		list.add(new ShoppingMall(1003,2022,200));
		list.add(new ShoppingMall(1004,2023,500));
		list.add(new ShoppingMall(1005,2023,400));
		list.add(new ShoppingMall(1006,2023,600));
		list.add(new ShoppingMall(1007,2023,650));
		
		ArrayList<ShoppingMall> newList = new ArrayList<>();
		
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i).orderNum+" ");
		}
		System.out.println();
		
		// stream으로 표현
		Stream<ShoppingMall> stream1 = list.stream();
		stream1.map(s -> s.orderNum).forEach(s -> System.out.print(s+ " "));
		System.out.println();
		
		
		int count = 0;
		int allPrice = 0;
		
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).year == 2022) {
				newList.add(list.get(i));
				count ++;
				allPrice += list.get(i).price;
			}
		}
//		System.out.println(newList.toString());
		System.out.println("2022년도의 거래 총금액과 건수");
		System.out.println("결과: 총금액 "+ allPrice +", 거래 건수: "+count);
		
		// stream
		Stream<ShoppingMall> stream2 = list.stream();
		int sum1 = stream2.filter(s -> s.year == 2022).mapToInt(s -> s.price).sum();
		Stream<ShoppingMall> stream3 = list.stream();
		long sum2 = stream3.filter(s -> s.year == 2022).count();
		System.out.println("2022년도의 거래 총금액과 건수");
		System.out.println("결과: 총금액 "+ sum1 +", 거래 건수: "+sum2);
		
		count = 0;
		allPrice = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).year == 2023) {
				newList.add(list.get(i));
				count ++;
				allPrice += list.get(i).price;
			}
		}
//		System.out.println(newList.toString());
		System.out.println("2023년도의 거래 총금액과 건수");
		System.out.println("결과: 총금액 "+ allPrice +", 거래 건수: "+count);

		// stream
		Stream<ShoppingMall> stream4 = list.stream();
		sum1=0;
		sum1 = stream4.filter(s -> s.year == 2023).mapToInt(s -> s.price).sum();
		Stream<ShoppingMall> stream5 = list.stream();
		sum2=0;
		sum2 = stream5.filter(s -> s.year == 2023).count();
		System.out.println("2023년도의 거래 총금액과 건수");
		System.out.println("결과: 총금액 "+ sum1 +", 거래 건수: "+sum2);
	}

}

class ShoppingMall {
	int orderNum;
	int year;
	int price;
	
	public ShoppingMall() {};
	
	public ShoppingMall(int orderNum, int year, int price) {
		super();
		this.orderNum = orderNum;
		this.year = year;
		this.price = price;
	}

	@Override
	public String toString() {
		return "ShoppingMall [orderNum=" + orderNum + ", year=" + year + ", price=" + price + "]";
	}
	
	
	
	
}