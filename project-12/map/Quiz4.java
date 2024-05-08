package map;

import java.util.HashMap;
import java.util.Set;

public class Quiz4 {

	public static void main(String[] args) {
		// 2.
		HashMap <Integer, Student> studentMap = new HashMap<>();
		
		// 3.
		studentMap.put(1001, new Student(1001, "둘리", 90, 80, 70));
		studentMap.put(1002, new Student(1002, "도우너", 55, 65, 75));
		studentMap.put(1003, new Student(1003, "또치", 80, 50, 50));
		
		// 4.
		Set<Integer> keys = studentMap.keySet();
//		for(int key : studentMap.keySet()) {
//			int sumScore = studentMap.get(key).scoreEnglish + studentMap.get(key).scoreKorean + studentMap.get(key).scoreMath;
//			System.out.println(studentMap.get(key).name+"의 총점: " + sumScore + ", 평균: "+(float)sumScore/3);
//		}
		for(int key : keys) {
			Student student = studentMap.get(key);
			int sumScore = student.scoreEnglish + student.scoreKorean + student.scoreMath;
			System.out.println(studentMap.get(key).name+"의 총점: " + sumScore + ", 평균: " + sumScore/3.0);
		} // for문이 한번 돌면, 한 학생에 대한 정보가 나옴
		
		System.out.println(" * * * ");

		// 5.
		int sumScoreE = 0;
		int sumScoreK = 0;
		int sumScoreM = 0;
		
//		for(int key : studentMap.keySet()) {
//			sumScoreE += studentMap.get(key).scoreEnglish;
//			sumScoreK += studentMap.get(key).scoreKorean;
//			sumScoreM += studentMap.get(key).scoreMath;
//		}
		for(int key : keys) {
			Student student = studentMap.get(key);
			sumScoreE += student.scoreEnglish;
			sumScoreK += student.scoreKorean;
			sumScoreM += student.scoreMath;
		}
		System.out.println("국어의 총점: " + sumScoreK + ", 평균: " + sumScoreE/3.0);
		System.out.println("수학의 총점: " + sumScoreM + ", 평균: " + sumScoreM/3.0);
		System.out.println("영어의 총점: " + sumScoreE + ", 평균: " + sumScoreK/3.0);
		
		
	}

}
// 1.
class Student {
	int studentID;
	String name;
	int scoreMath;
	int scoreKorean;
	int scoreEnglish;
	
	public Student(int studentID, String name,  int scoreKorean, int scoreMath, int scoreEnglish) {
		super();
		this.studentID = studentID;
		this.name = name;
		this.scoreMath = scoreMath;
		this.scoreKorean = scoreKorean;
		this.scoreEnglish = scoreEnglish;
	}
	
	
}