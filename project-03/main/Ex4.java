package main;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mathScore = 93;
		int engScore = 70;
		
		int totalScore = mathScore + engScore;
		System.out.println(totalScore);
		
		float avarage = (float)totalScore/2;
		System.out.println(avarage);
		
		//1.int형 변수에 절과를 저장하고 2로 나누기
		int avgScore1 = totalScore/2;
		System.out.println(avgScore1);
		
		//2.double형 변수에 결과 저장하고 2로 나누기
		double avgScore2 = totalScore/2;
		System.out.println(avgScore2);
		
		//3.double형 변수에 결과 저장하고 2.0으로 나누기
		double avgScore3 = totalScore/2.0;
		System.out.println(avgScore3);
		
	}

}
