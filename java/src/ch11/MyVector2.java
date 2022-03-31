package ch11;

import java.util.Iterator;

//iterator를 어떻게 구현하는지 
public class MyVector2 extends MyVector implements Iterator {
	int cursor = 0;
	int lastRet = -1;

	public MyVector2(int capacity) {
		super(capacity); // capacity 설정
	}

	public MyVector2() {
		this(10); // 기본 capacity 10
	}

	public String toString() {
		String tmp = "";
		Iterator it = iterator();

		for (int i = 0; it.hasNext(); i++) {
			if (i != 0)
				tmp += ", ";
			tmp += it.next();
		}
		return "[" + tmp + "]";
	}

	public Iterator iterator() {
		// 초기화
		cursor = 0; // 앞으로 읽어 올 요소의 위치를 저장
		lastRet = -1; // 마지막으로 읽어 온 요소의 위치를 저장
		return this;
	}

	public boolean hasNext() {
		return cursor != size();
	}

	public Object next() {
		Object next = get(cursor);
		lastRet = cursor++;
		return next;
	}

	public void remove() {
		// 더이상 삭제할 것이 없으면 IllegalStateException를 발생시킨다
		if (lastRet == -1) {
			throw new IllegalStateException();
		} else {
			remove(lastRet);
			cursor--; // 삭제 후에 cursor의 위치를 감소
			//삭제된 위치 이후의 객체들이 빈공간을 채우기 위해 자동적으로 이동하기때문에, cursor도 -1
			lastRet = -1; // lastRet의 값을 초기화
		}
	}
}
