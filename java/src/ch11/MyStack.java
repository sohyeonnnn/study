package ch11;

import java.util.*;

public class MyStack extends Vector {

	public Object push(Object item) {
		addElement(item);
		return item;
	}

	public Object pop() { // ������ ��� �ҷ����� ����
		Object obj = peek(); // �������� ���ÿ� ����� ������ ��Ҹ� �о��
		// ������ ��������� EmptyStackException�� �߻�
		removeElementAt(size() - 1); // ������ ��� ����, �迭�� 0���� �����ϹǷ� -1
		return obj;
	}

	public Object peek() { // �������� ���ÿ� ����� ������ ��Ҹ� �о��
		int len = size();

		if (len == 0)
			// ������ ��������� EmptyStackException�� �߻�
			throw new EmptyStackException();
		return elementAt(len - 1); // ������ ��� ��ȯ 0���� �����ϹǷ� -1
	}

	public boolean empty() {
		return size() == 0;
	}

	public int search(Object o) {
		int i = lastIndexOf(o); // ���������� ��ü�� ã��
		// ��ȯ���� ����� ��ġ(�迭�� index)�̴�
		if (i >= 0) { // ��ü�� ã�� ���

			return size() - i; // ������ �� ���� ����� ��ü�� index�� 1�� �����ϱ� ������ ����� ���ؼ� ���Ѵ�??

		}
		return -1; // �ش� ��ü�� ã�� ���ϸ� -1�� ��ȯ
	}

	public static void main(String[] args) {
		Stack s = new Stack();
		s.push(1);
		s.push(2);
		s.push(5);
		s.push(2);
		s.push(8);
		s.push("oo");
		System.out.println(s);
		
		System.out.println(s.indexOf(0)); // ���� -1
		System.out.println(s.indexOf(99)); // ���� -1
		System.out.println(s.indexOf(1)); // 0
		System.out.println(s.indexOf(5)); // 2
		System.out.println(s.indexOf("oo")); // 5
		
		System.out.println(s.search(1));
	}

}
