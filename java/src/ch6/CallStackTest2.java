package ch6;

public class CallStackTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main�� ���۵Ǿ���");
		firstMethod(); // 1. firstMethod�� �̵�
		System.out.println("main�� ������");
	}

	static void firstMethod() {
		System.out.println("firstMethod�� ���۵Ǿ���");
		secondMethod(); // 2. secondMethod�� �̵�
		System.out.println("firstMethod�� ������"); // 4. main���� ���ư�
	}

	static void secondMethod() {
		System.out.println("secondMethod�� ���۵Ǿ���");
		System.out.println("secondMethod�� ������"); // 3. firstMethod�� ���ư�
	}

}
