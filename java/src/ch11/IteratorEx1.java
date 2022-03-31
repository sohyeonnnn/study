package ch11;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx1 {
//Enumeration(Iterator의 구버전) -> Iterator -> ListIterator(양방향 조회기능 추가)
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");

		Iterator it = list.iterator();

		while (it.hasNext()) {// 읽어올 다음 요소가 없을때까지 반복
			Object obj = it.next();
			System.out.println(obj);
		}
	}

}
