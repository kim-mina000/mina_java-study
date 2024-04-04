package hiding;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person();
		
		}

}

class Person {
	private String name;
	private int height;
	private int weight;
	
	// source 메뉴 - generate getter and setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	
}
