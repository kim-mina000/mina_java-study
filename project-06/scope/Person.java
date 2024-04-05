package scope;

public class Person {
	String personName; 								//인스턴스 변수기 때문에 객체 생성 후에 사용가능
	int personAge; 										//전역변수이기 때문에 클래스 끝나기 전까지 사용가능
	
	static char gender = 'F'; 						//static이 있기 때문에 같은 패키지 내에서 어디서든 사용 가능
																		//클래스 변수라서 객체 없이도 사용가능, 전역변수이기 때문에 클래스 끝나기 전까지 사용가능
	
	public void setPersonName(String name) { 	
		this.personName = name;				// name 은 지역변수 해당 함수 내에서만 사용가능
	}
}
