package ch11;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class HashSetLotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set set = new HashSet();

		for (int i = 0; set.size() < 6; i++) {
			int num = (int) (Math.random() * 45) + 1; // 1~45 랜덤 숫자 6개 set에 저장
			set.add(new Integer(num));
		}

		// sort는 인자로 List인터페이스 타입을 필요로 하기 때문에 linkedlist에 담아서 처리
		List list = new LinkedList(set); // LinkedList(Collection c)
		Collections.sort(list); // 정렬
		System.out.println(list);
	}

}
