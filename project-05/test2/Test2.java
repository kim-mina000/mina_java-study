package test2;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person("kim", 175, 70.0);
		person.height = 160;
		person.name = "park";
		person.showInfo();
		
	}

}

class Person {
	public String name;
	int height;
	private double weight;
	
	public void showInfo() {
		System.out.println("이름: "+name+", 키: "+height+", 몸무게: "+ weight);
	}

	public Person(String name, int height, double weight) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
}