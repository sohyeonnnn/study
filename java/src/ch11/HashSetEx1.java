package ch11;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx1 {

	// HashSet은 중복된 요소 저장x, 저장순서 유지x (유지하려면 LinkedHashSet)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object[] objArr = { "1", new Integer(1), "2", "2", "3", "3", "4", "4", "4" };
		// 중복된 값은 저장되지 않음
		// 1 하나는 문자열, 하나는 정수
		// 순서를 유지하지 않음
		Set set = new HashSet();

		for (int i = 0; i < objArr.length; i++) {
			set.add(objArr[i]);
		}

		// HashSet에 저장된 요소들을 출력
		System.out.println(set);
	}
}
