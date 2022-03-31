package ch11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueueEx {

	// 순차적으로 데이터를 추가/삭제하는 스택 -> ArrayList
	// 데이터를 꺼낼 떄 항상 첫번째 저장된 데이터를 삭제하는 큐 - > 데이터의 추가/삭제가 쉬운 LinkedList
	// ArrayList를 사용한다면 데이터를 꺼낼때마다 빈공간을 채우기 위해 데이터의 복사가 발생하므로 비효율적
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack st = new Stack();
		Queue q = new LinkedList();

		// 스택
		st.push("0");
		st.push("1");
		st.push("2");

		// 큐
		q.offer("0");
		q.offer("1");
		q.offer("2");

		System.out.println("= stack =");
		while (!st.empty()) {
			// 마지막에 넣은 것부터 lifo
			System.out.println(st.pop()); // 맨 위에 저장된 객체를 꺼낸다
		}

		System.out.println("= queue =");
		while (!q.isEmpty()) {
			// 처음에 넣은 것부터 fifo
			System.out.println(q.poll()); // 객체를 꺼내서 반환
		}
	}

}
