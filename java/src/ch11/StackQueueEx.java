package ch11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueueEx {

	// ���������� �����͸� �߰�/�����ϴ� ���� -> ArrayList
	// �����͸� ���� �� �׻� ù��° ����� �����͸� �����ϴ� ť - > �������� �߰�/������ ���� LinkedList
	// ArrayList�� ����Ѵٸ� �����͸� ���������� ������� ä��� ���� �������� ���簡 �߻��ϹǷ� ��ȿ����
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack st = new Stack();
		Queue q = new LinkedList();

		// ����
		st.push("0");
		st.push("1");
		st.push("2");

		// ť
		q.offer("0");
		q.offer("1");
		q.offer("2");

		System.out.println("= stack =");
		while (!st.empty()) {
			// �������� ���� �ͺ��� lifo
			System.out.println(st.pop()); // �� ���� ����� ��ü�� ������
		}

		System.out.println("= queue =");
		while (!q.isEmpty()) {
			// ó���� ���� �ͺ��� fifo
			System.out.println(q.poll()); // ��ü�� ������ ��ȯ
		}
	}

}
