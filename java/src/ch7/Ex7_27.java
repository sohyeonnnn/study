package ch7;

import ch7.Outer27.Inner27;

class Outer27 {
	int value = 10;

	class Inner27 {
		int value = 20;

		void method1() {
			int value = 30;

			System.out.println(value); // 30: method1의 value값
			System.out.println(this.value);// 20: inner의 value
			System.out.println(Outer27.this.value);// 10: outer의 value
		}
	}// inner
}// outer

public class Ex7_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Outer27 outer = new Outer27(); // inner접근 위해 outer인스턴스 생성
		Inner27 inner = outer.new Inner27(); // inner 생성
		inner.method1();

	}

	
	//외부클래스와 내부클래스의 같은 이름의 인스턴스 변수가 선언되었을때 
	//outer.this.변수이름
}
