package main;

import java.util.Scanner;

public class quiz2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("드라이버를 선택하세요. . .");
		System.out.println("✨①✨ my sql");
		System.out.println("✨②✨ oracle");
		System.out.println("✨③✨ postgres");
		
		int num = scanner.nextInt();
		
		if (num == 1) {
			System.out.println("✨MySql DB에 연결합니다✨");
		} else if (num == 2) {
			System.out.println("✨Oracle DB에 연결합니다✨");
		} else if (num == 3) {
			System.out.println("✨Postgres DB에 연결합니다✨");
		} else {
			System.out.println("✨지원되지 않는 기능입니다✨");
		}

	}

}

class MysqlBDriver implements DBDriver{

	@Override
	public void dbConnect() {
		System.out.println("MysqlBDriver에 연결합니다");
	}
	
}
class OracleDBDriver implements DBDriver{

	@Override
	public void dbConnect() {
		System.out.println("OracleDBDriver에 연결합니다");
	}
	
}
class PostgressDBDriver implements DBDriver{

	@Override
	public void dbConnect() {
		System.out.println("PostgressDBDriver에 연결합니다");
	}
	
}