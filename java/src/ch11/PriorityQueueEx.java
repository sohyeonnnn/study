package ch11;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueEx {
	// ������ ������ ������� �켱���� �� ���� �� ���� ����
	// null�� ������ �� ����
	// �� ��Ҹ� ���̶�� �ڷᱸ���� ���·� ����

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue pq = new PriorityQueue();
		pq.offer(3); //����
		pq.offer(1);
		pq.offer(5);
		pq.offer(2);
		pq.offer(4);

		System.out.println(pq); // pq�� ���� �迭�� ���

		Object obj = null;

		// PriorityQueue�� ����� ��Ҹ� �ϳ��� ������
		while ((obj = pq.poll()) != null) {
			System.out.println(obj);
		}
		// ��� ���: 1 2 3 4 5
		// ���ڰ� �������� �켱������ ����
		
		//Deque : ���� ���� �߰�/������ ����

	}

}
