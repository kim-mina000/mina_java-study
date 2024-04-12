package polymorphism;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		moveAnimal(new Human()); // Animal animal = new Human()
		moveAnimal(new Tiger());
		moveAnimal(new Eagle());
	}
	public static void moveAnimal(Animal animal) {
		animal.move();
	}

}
