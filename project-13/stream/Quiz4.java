package stream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Quiz4 {

	public static void main(String[] args) {
		
		ArrayList<Customer> list = new ArrayList<>();
		list.add(new Customer("둘리", 40, 100));
		list.add(new Customer("또치", 13, 50));
		list.add(new Customer("도우너", 25, 70));
		
		System.out.println("== 고객명단 ==");
		Stream<Customer> stream1 = list.stream();
		stream1.map(s -> s.name).forEach(s -> System.out.print(s+" "));
		System.out.println();
		
		Stream<Customer> stream2 = list.stream();
		int sum = stream2.map(s -> s.cost).mapToInt(s -> s).sum();
		System.out.println("총 여행 비용: "+ sum);
		
		System.out.println("\n== 20세 이상 고객 명단 ==");
		Stream<Customer> stream3 = list.stream();
//		stream3.filter(s -> s.age>20).forEach(s -> System.out.println(s.name+ ", "+s.age));

		stream3.filter(s -> s.age>20).sorted((a, b) -> a.age - b.age).forEach(s -> System.out.println(s.name+ ", "+s.age));
		
	}

}

class Customer {
	String name;
	int age;
	int cost;
	
	public Customer(String name, int age, int cost) {
		super();
		this.name = name;
		this.age = age;
		this.cost = cost;
	}
	
}