package ch14;

import java.util.Arrays;
import java.util.stream.Stream;

class StreamEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<String[]> strArrStrm = Stream.of(new String[] { "abc", "def", "jkl" },
				new String[] { "ABC", "GHI", "JKL" });

		Stream<String> strStrm = strArrStrm.flatMap(Arrays::stream);

		strStrm.map(String::toLowerCase).distinct().sorted().forEach(System.out::println);
		// 모두 소문자로 변경,중복제거,정렬,출력

		String[] lineArr = { "Believe or not It is true", "Do or do not There is no try", };

		Stream<String> lineStream = Arrays.stream(lineArr);
		lineStream.flatMap(line -> Stream.of(line.split(" +"))).map(String::toLowerCase).distinct().sorted()
				.forEach(System.out::println);
		// 스트림생성,소문자변경,중복제거,정렬,출력
		System.out.println();

		Stream<String> strStrm1 = Stream.of("AAA", "ABC", "bBb", "Dd");
		Stream<String> strStrm2 = Stream.of("bbb", "aaa", "ccc", "dd");

		Stream<Stream<String>> strStrmStrm = Stream.of(strStrm1, strStrm2);
		Stream<String> strStream = strStrmStrm.map(s -> s.toArray(String[]::new)).flatMap(Arrays::stream);
		strStream.map(String::toLowerCase).distinct().forEach(System.out::println);
	}

}
