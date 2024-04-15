package finalex;

/*여러 파일에서 공유하는 상수 만들기
조건
① 접근 범위 (어디서든 접근 할 수 있게)
② 인스턴스x (static)
③ 값 변경 x (final)*/

public class Define {
	public static final int MIN = 1;
	public static final int MAX = 999;
	public static final int ENG = 1001; //영어과목코드
	public static final int MATH = 2001;

}
