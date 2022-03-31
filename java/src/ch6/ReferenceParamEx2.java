package ch6;

public class ReferenceParamEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] x = { 10 };
		System.out.println("main:x=" + x[0]);

		change(x); // 매개변수 : 배열 (참조형)
		System.out.println("after change(x)");
		System.out.println("main:x=" + x[0]); // 값 변경됨

		// 배열도 객체와 같이 참조변수를 통해 데이터가 저장된 공간에 접근하므로 값을 변경할 수 있다
		// 임시적으로 간단히 처리할 때는 별도의 클래스를 선언하는 것보다 이처럼 배열을 이용할 수도 있다

	}

	static void change(int[] x) {
		x[0] = 1000;
		System.out.println("change:x=" + x[0]);
	}
}
