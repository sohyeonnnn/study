package ch6;

public class CallStackTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main이 시작되었음");
		firstMethod(); // 1. firstMethod로 이동
		System.out.println("main이 끝났음");
	}

	static void firstMethod() {
		System.out.println("firstMethod가 시작되었음");
		secondMethod(); // 2. secondMethod로 이동
		System.out.println("firstMethod가 끝났음"); // 4. main으로 돌아감
	}

	static void secondMethod() {
		System.out.println("secondMethod가 시작되었음");
		System.out.println("secondMethod가 끝났음"); // 3. firstMethod로 돌아감
	}

}
