package reference;

public class quiz_department {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee head = new Employee("kim", 40, 100000000, 15);
		Employee seniorResearcher = new Employee("seo", 33, 5000000, 7);
		Employee researcher = new Employee("min", 29, 3000000, 5);
		
		Department department = new Department(head, seniorResearcher, researcher);
		
		System.out.println(department);
	}

}

class Department {
	Employee head;
	Employee seniorResearcher;
	Employee researcher;
	public Department(Employee head, Employee seniorResearcher, Employee researcher) {
		super();
		this.head = head;
		this.seniorResearcher = seniorResearcher;
		this.researcher = researcher;
	}
	@Override
	public String toString() {
		return "Department [head=" + head + ", seniorResearcher=" + seniorResearcher + ", researcher=" + researcher
				+ "]";
	}
	
}
class Employee {
	String name;
	int age;
	int salary;
	int serviceYear;
	public Employee(String name, int age, int salary, int serviceYear) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.serviceYear = serviceYear;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + ", serviceYear=" + serviceYear + "]";
	}
	
}