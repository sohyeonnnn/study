package ch6;


class Data {
	int x;
}

public class PrimitiveParamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 기본형 매개변수 : 변수의 값 read only
		// 참조형 매개변수 : 변수의 값 read&write
		Data d = new Data();
		d.x = 10; // 객체 d의 x값을 10으로 변경
		System.out.println("main:x=" + d.x);
		change(d.x); // d의 x값을 변경하는 메서드 호출
		System.out.println("after change(d.x)");
		System.out.println("main:x=" + d.x); // 메서드 호출 후 변경된 값=10 - 변수의 값이 변경되진 않는다

	}

	static void change(int x) {
		x = 1000; // 값을 1000으로 변경
		//d.x의 값이 변경된 것이 아니라 change메서드의 매개변수x의 값이 변경된것
		//원본이 아닌 복사본이 변경된 것이기 때문에 원본이는 아무런 영향을 미치지 못한다
		System.out.println("change:x=" + x);
	}

}
