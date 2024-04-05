package scope;

public class quiz3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person(); 							// 같은 package 내에서 자유롭게 사용가능ㄴ
		
		int i = 10;																	// main함수 내에서 자유롭게 사용가능
		
		if( i>1 ) {
			String str="안녕하세요";										// if 블록 내에서만 사용가능
		}

		for (int k=0; k<10; k++) {										// for 블록 내에서만 사용가능
			System.out.println();
		}
	}

}
