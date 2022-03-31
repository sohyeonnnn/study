package ch11;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorEx {

	// compareTo의 반환값
	// 두 객체가 같으면 0 / 비교하는 값보다 작으면 음수 / 크면 양수

	// Comparable - 기본 정렬기준을 구현하는데 사용
	// Comparator - 기본 정렬기준 외에 다르기준으로 정렬하고자할때 사용

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strArr = { "cat", "Dog", "lion", "tiger" };

		Arrays.sort(strArr); // String의 Comparable구현에 의한 정렬
		System.out.println("strArr=" + Arrays.toString(strArr)); // 대문자 먼저

		Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER);// 대소문자 구분없이 정렬
		System.out.println("strArr=" + Arrays.toString(strArr));

		Arrays.sort(strArr, new Descending());// 역순 정렬
		System.out.println("strArr=" + Arrays.toString(strArr));
	}
}

class Descending implements Comparator {
	public int compare(Object o1, Object o2) {
		if (o1 instanceof Comparable && o2 instanceof Comparable) {
			Comparable c1 = (Comparable) o1;
			Comparable c2 = (Comparable) o2;
			return c1.compareTo(c2) * -1; // -1을 곱해서 기본 정렬방식의 역으로 변경한다
											// c2.compareTo(c1)와 같이 순서를 바꿔도 된다
		}
		return -1;
	}
}
