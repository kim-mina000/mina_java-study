package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex1 {

	public static void main(String[] args) {

		// 리스트로부터 스트림 생성하기
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5); // new ArrayList<>(); list.add(); 를 합쳐놓은것
		Stream<Integer> stream1 = list.stream();
		// list와 stream은 저장공간이 다름, 원본 데이터의 내용을 카피해서 새로운 자료구조를 만드는 것
		
		// 객체 배열로부터 스트림 생성하기
		String[] strArr = { "a", "b", "c"};
		// 두가지 방법으로 Stream 생성 가능
		Stream<String> stream2 = Stream.of(strArr);
		Stream<String> stream3 = Arrays.stream(strArr);	
		
		// 기초 배열로부터 스트림 생성하기
		int[] intArr = { 1, 2, 3, 4, 5 };
		IntStream stream4 = Arrays.stream(intArr);
		// Stream<Integer>가 아니라 IntStream이 반환됨
		// 기본형 스트림은 오토박싱/언박싱하지 않고 연산을 수행하여 속도가 더 빠름

		
	}

}
