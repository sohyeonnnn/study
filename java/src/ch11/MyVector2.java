package ch11;

import java.util.Iterator;

//iterator�� ��� �����ϴ��� 
public class MyVector2 extends MyVector implements Iterator {
	int cursor = 0;
	int lastRet = -1;

	public MyVector2(int capacity) {
		super(capacity); // capacity ����
	}

	public MyVector2() {
		this(10); // �⺻ capacity 10
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
		// �ʱ�ȭ
		cursor = 0; // ������ �о� �� ����� ��ġ�� ����
		lastRet = -1; // ���������� �о� �� ����� ��ġ�� ����
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
		// ���̻� ������ ���� ������ IllegalStateException�� �߻���Ų��
		if (lastRet == -1) {
			throw new IllegalStateException();
		} else {
			remove(lastRet);
			cursor--; // ���� �Ŀ� cursor�� ��ġ�� ����
			//������ ��ġ ������ ��ü���� ������� ä��� ���� �ڵ������� �̵��ϱ⶧����, cursor�� -1
			lastRet = -1; // lastRet�� ���� �ʱ�ȭ
		}
	}
}
