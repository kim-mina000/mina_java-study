package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex2 {

	public static void main(String[] args) {
		// 1. 한번 생성하고 사용한 스트림은 재사용할 수 없다
		List<Integer> list = Arrays.asList(5, 1, 2, 4, 3, 3);
		Stream<Integer> stream = list.stream();
		// 반복적인 작업을 수행함
		// Cusumer를 람다식 함수로 구현해서 인자로 넣음
		stream.forEach( t -> {System.out.print(t);});
		
		// 2. 스트림 연산은 원본 데이터를 변경하지 않는다
		// sorted 요소들을 정렬하여 새로운 스트림을 생성
		// collect: 스트림을 list로 변환
		// 메소드체이닝을 사용하여 중간연산과 최종연산을 나누어 할 수 있음
		// 중간연산자들은 항상 stream 객체를 반환함
		List<Integer> sortList = list.stream().sorted().collect(Collectors.toList());
		System.out.println(list);
		System.out.println(sortList);
		
		// 3. 중간연산은 여러번 할 수 있고, 최종연산은 마지막에 한번만 할 수 있다.
		// filter : 조건을 만족하는 요소만 추출
		// sorted : 순서대로 정렬
		// forEach : 특정작업을 반복적으로 수행
		// 3보다 큰 값을 찾아서, 순서대로 정렬한 후에, 중복요소를 제거하고, 출력
		list.stream().filter(n -> n >= 3).sorted().distinct().forEach(n -> System.out.print(n));
		System.out.println();
		
		// 중간연산이 끝나고 다시 스트림을 반환하기 때문에, 계속해서 중간연산을 사용 할 수 있음
		
		// 스트림 생성
		Stream<Integer> stream2 = list.stream();
		
		// 값을 조작하고 새로운 스트림 생성
		Stream<Integer> stream3 = stream2.sorted();
		
		stream3.forEach( n -> System.out.print(n));

	}

}
