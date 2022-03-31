package ch14;

import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<String, Integer> f = (s) -> Integer.parseInt(s, 16);
		Function<Integer, String> g = (i) -> Integer.toBinaryString(i);

		Function<String, String> h = f.andThen(g); // 함수 f를 먼저 적용하고, 그 다음에 함수 g를 적용한다
		Function<Integer, Integer> h2 = f.compose(g); // 반대

		System.out.println(h.apply("FF")); // 11111111
		System.out.println(h2.apply(2)); // 16

		Function<String, String> f2 = x -> x; // 항등함수
		System.out.println(f2.apply("AAA")); // AAA가 출력됨

		Predicate<Integer> p = i -> i < 100;
		Predicate<Integer> q = i -> i < 200;
		Predicate<Integer> r = i -> i % 2 == 0;
		Predicate<Integer> notP = p.negate(); // i>=100
		// predicate의 끝에 negate()을 붙이면 조건식 전체가 부정이 된다

		Predicate<Integer> all = notP.and(q.or(r));

		String str1 = "abc";
		String str2 = "abc";

		// str1과 str2가 같은지 비교한 결과를 반환
		Predicate<String> p2 = Predicate.isEqual(str1);
		boolean result = p2.test(str2);
		System.out.println(result);
	}

}
