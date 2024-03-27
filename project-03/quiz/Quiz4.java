package quiz;

public class Quiz4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int mathScore = 90;
		int engScore = 70;
		int korScore = 100;
		
		int totalScore = mathScore + engScore + korScore;
		double avgScore = (double)totalScore / 3.0;
		
		System.out.println(" 총 점수 : "+totalScore);
		System.out.println(" 평균 : "+avgScore);
	}

}
