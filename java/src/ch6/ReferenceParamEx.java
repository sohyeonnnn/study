package ch6;

public class ReferenceParamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Data d = new Data();
		d.x = 10;
		System.out.println("main:x=" + d.x);

		change(d); // Data객체 d를 매개변수로 넘겨준다
		System.out.println("after change(d)");
		System.out.println("main:x=" + d.x); // 메서드 호출 후 변경된 값=1000

		// 매개변수가 참조형이라서 값이 저장된 주소가 넘어감 - 값 변경 가능

	}

	static void change(Data d) {
		d.x = 1000; // d의 x값을 1000으로 변경
		System.out.println("change:x=" + d.x);
	}
}
