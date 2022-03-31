package ch7;

//인터페이스의 장점
//1.표준화를 가능하게 해준다
//2. 서로 관계없는 클래스들에게 관계를 맺어 줄 수있다
//3. 독립적인 프로그래밍이 가능하다
//4. 다중상속을 가능하게 해준다

class Outer25 {
	class Inner25 {
		int iv = 100;
	}
}

public class Ex7_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// inner의 멤버변수 iv 값을 출력하려면
		// outer인스턴스 생성
		Outer25 outer = new Outer25();
		// outer의 inner 생성
		Outer25.Inner25 inner = outer.new Inner25();
		System.out.println(inner.iv);
	}
	//내부클래스의 인스턴스를 생성하기 위해서는 먼저 외부클래스의 인스턴스 생성

}
