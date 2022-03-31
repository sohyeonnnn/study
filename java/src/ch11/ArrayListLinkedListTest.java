package ch11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListLinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList(2000000);
		LinkedList ll = new LinkedList();

		// 순차적으로 추가/삭제하는 경우에는 ArrayList가 LinkedList보다 빠르다
		// 순차적으로 삭제한다는 것은 마지막 데이터부터 역순으로 삭제해나간다는것을 의미
		// ArrayList는 마지막 데이터부터 삭제할 경우 각 요소들의 재배치가 필요하지 않기 때문에 빠르다

		// 중간 데이터를 추가/삭제하는 경우에는 LinkedList가 ArrayList보다 빠르다
		// 중간 요소를 추가 또는 삭제하는 경우, LinkedList는 각 요소간의 연결만 변경해주면 되기 때문에 빠름

		System.out.println();
		System.out.println("=순차적으로 추가하기=");
		System.out.println("arrayList:" + add1(al)); //빠름
		System.out.println("linkedList:" + add1(ll));

		System.out.println();
		System.out.println("=중간에 추가하기=");
		System.out.println("arrayList:" + add2(al));
		System.out.println("linkedList:" + add2(ll)); //빠름

		System.out.println();
		System.out.println("=중간에서 삭제하기=");
		System.out.println("arrayList:" + remove2(al));
		System.out.println("linkedList:" + remove2(ll)); //빠름

		System.out.println();
		System.out.println("=순차적으로 삭제하기=");
		System.out.println("arrayList:" + remove1(al)); //빠름
		System.out.println("linkedList:" + remove1(ll));
	}

	public static long add1(List list) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 1000000; i++)
			list.add(i + "");
		long end = System.currentTimeMillis();
		return end - start;
	}

	public static long add2(List list) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++)
			list.add(500, "X");
		long end = System.currentTimeMillis();
		return end - start;
	}

	public static long remove1(List list) {
		long start = System.currentTimeMillis();
		for (int i = list.size() - 1; i >= 0; i--)
			list.remove(i);
		long end = System.currentTimeMillis();
		return end - start;
	}

	public static long remove2(List list) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++)
			list.remove(i);
		long end = System.currentTimeMillis();
		return end - start;
	}

}
