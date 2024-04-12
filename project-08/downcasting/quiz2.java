package downcasting;

import java.util.ArrayList;

public class quiz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Person> personList = new ArrayList<Person>();
		personList.add(new Student("둘리"));
		personList.add(new Employee("또치"));
		personList.add(new Person("마이콜"));
		
		for ( Person person : personList) {
			person.eat();
			
			if (person instanceof Student) {
				Student s = (Student) person;
				s.study();
			} else if (person instanceof Employee) {
				Employee e = (Employee) person;
				e.work();
			} 
		}
	}

}

class Person {
	String name;

	public Person(String name) {
		super();
		this.name = name;
	}
	
	public void eat() {
		System.out.println(name+"가 밥!을! 먹는!! 다!!!");
	}
}
class Student extends Person{
	
	public Student(String name) {
		super(name);
	}

	public void study() {
		System.out.println(name+"가 공부를 합니다 ,,");
	}
}
class Employee extends Person{
	
	public Employee(String name) {
		super(name);
	}

	public void work() {
		System.out.println(name+"회사원이 일을 합니다 ,,");
	}
}