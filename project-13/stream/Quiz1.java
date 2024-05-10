package stream;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Quiz1 {

	public static void main(String[] args) {

		String[] arr = {"aaa", "aaa", "b","b","ccccc"};
		
		// Q1. 문자열 목록 중에서 * (중간연산)길이가 2보다 큰 요소의 * (최종연산)개수를 구하세요
//		Stream<String> stream1 = Stream.of(arr);
//		int  count = (int) stream1.filter(n -> n.length()>2).count();
//		System.out.println(count);
		
		Stream<String> stream1 = Arrays.stream(arr);
		
		long count = stream1.filter( s -> s.length() >2 ).count(); // count()의 리턴타입이 long 이기 때문에 int count로 변수 선언하면 에러가 남
		
		System.out.println("길이가 3보다 큰 요소의 개수: " + count);
		
		
		// Q2. 모든 문자열의 길이를 더한 합
//		IntStream stream2 = Stream.of(arr).map(n  -> n.length()).mapToInt(n -> n.intValue());
//		System.out.println(stream2.sum());
		
		Stream<String> stream2 = Arrays.stream(arr);
		
		int sum = stream2.mapToInt(s -> s.length()).sum();
		
		System.out.println("모든 문자열의 길이를 더한 합: "+sum);
		
		
		// Q3. 가장 길이가 짧은 문자열의 길이
//		Stream<String> stream3 = Arrays.stream(arr);
//		System.out.println(stream3.map(n -> n.length()).mapToInt(n -> n.intValue()).min().getAsInt());
		
//		IntStream intstream = Arrays.stream(arr).mapToInt(n -> n.length());
//		System.out.println(intstream.min().getAsInt());
		
		OptionalInt min = Arrays.stream(arr).mapToInt(s -> s.length()).min();
		System.out.println("가장 길이가 짧은 문자열의 길이: "+min.getAsInt());
		
		
		// Q4. 중복을 제거한 리스트
//		Stream<String> stream4 = Arrays.stream(arr).distinct();
//		List<String> list = stream4.collect(Collectors.toList());
//		System.out.println(list);
		
		Stream<String> stream5 = Arrays.stream(arr);
		List<String> list2 = stream5.distinct().collect(Collectors.toList());
		System.out.println("중복을 제거한 리스트: "+list2);
		
		
	}

}
