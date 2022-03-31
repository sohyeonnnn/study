package ch11;

import java.util.*;

public class MyStack extends Vector {

	public Object push(Object item) {
		addElement(item);
		return item;
	}

	public Object pop() { // 마지막 요소 불러오고 삭제
		Object obj = peek(); // 삭제없이 스택에 저장된 마지막 요소를 읽어옴
		// 스택이 비어있으면 EmptyStackException을 발생
		removeElementAt(size() - 1); // 마지막 요소 삭제, 배열이 0부터 시작하므로 -1
		return obj;
	}

	public Object peek() { // 삭제없이 스택에 저장된 마지막 요소를 읽어옴
		int len = size();

		if (len == 0)
			// 스택이 비어있으면 EmptyStackException을 발생
			throw new EmptyStackException();
		return elementAt(len - 1); // 마지막 요소 반환 0부터 시작하므로 -1
	}

	public boolean empty() {
		return size() == 0;
	}

	public int search(Object o) {
		int i = lastIndexOf(o); // 끝에서부터 객체를 찾음
		// 반환값은 저장된 위치(배열의 index)이다
		if (i >= 0) { // 객체를 찾은 경우

			return size() - i; // 스택은 맨 위에 저장된 객체의 index를 1로 정의하기 때문에 계산을 통해서 구한다??

		}
		return -1; // 해당 객체를 찾지 못하면 -1를 반환
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
		
		System.out.println(s.indexOf(0)); // 없음 -1
		System.out.println(s.indexOf(99)); // 없음 -1
		System.out.println(s.indexOf(1)); // 0
		System.out.println(s.indexOf(5)); // 2
		System.out.println(s.indexOf("oo")); // 5
		
		System.out.println(s.search(1));
	}

}
