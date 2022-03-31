package ch11;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueEx {
	// 저장한 순서에 관계없이 우선순위 가 높은 것 부터 꺼냄
	// null은 저장할 수 없음
	// 각 요소를 힙이라는 자료구조의 형태로 저장

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue pq = new PriorityQueue();
		pq.offer(3); //저장
		pq.offer(1);
		pq.offer(5);
		pq.offer(2);
		pq.offer(4);

		System.out.println(pq); // pq의 내부 배열을 출력

		Object obj = null;

		// PriorityQueue에 저장된 요소를 하나씩 꺼낸다
		while ((obj = pq.poll()) != null) {
			System.out.println(obj);
		}
		// 출력 결과: 1 2 3 4 5
		// 숫자가 작을수록 우선순위가 높음
		
		//Deque : 양쪽 끝에 추가/삭제가 가능

	}

}
