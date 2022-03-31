package ch11;

import java.util.ArrayList;
import java.util.Collections;

//Collection
//List : 순서o  데이터의 집합, 데이터 중복 허용o ex)대기자 명단
//Set :  순서x  데이터의 집합, 데이터 중복 허용x ex) 양의 정수집합, 소수의 집합
//Map : 키와 값의 쌍으로 이루어진 데이터의 집합, 순서x, 키:중복x, 값:중복o
public class ArrayListEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList list1 = new ArrayList(10); // 5,4,2,0,1,3
		list1.add(new Integer(5));
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));

		ArrayList list2 = new ArrayList(list1.subList(1, 4)); // 4,2,0
		print(list1, list2);

		Collections.sort(list1); // 정렬 0 1 2 3 4 5
		Collections.sort(list2); //0 2 4
		print(list1, list2);

		System.out.println("list1.containsAll(list2):" + list1.containsAll(list2));

		list2.add("B");
		list2.add("C");
		list2.add(3, "A"); //0 2 4 A B C
		print(list1, list2);

		list2.set(3, "AA"); //0 2 4 AA B C 

		// 1에서 2와 겹치는 부분만 남기고 나머지는 삭제
		System.out.println("list1.retainAll(list2):" + list1.retainAll(list2));
		print(list1, list2); //list1: 0 2 4 

		// 2에서 1에 포함된 객체들을 삭제
		//i를 증가시켜가면서 삭제하면, 한 요소가 삭제될 때마다 빈 공간을 채우기 위해 나머지 요소들이 자리이동 -> 올바른 결과x
		for (int i = list2.size() - 1; i >= 0; i--) {
			if (list1.contains(list2.get(i))) {
				list2.remove(i);
			}
		}
		print(list1, list2);  //AA B C

	}

	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1: " + list1);
		System.out.println("list2: " + list2);
		System.out.println();
	}
}
