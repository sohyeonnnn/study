package ch7;

//인터페이스에 추상메서드를 추가 - 인터페이스를 구현한 기존의 모든 클래스에서 새로 추가된 메서드를 구현해야함
//-> 해결 - ‘디폴트 메서드’ : 추상메서드의 기본적인 구현을 제공하는 메서드
//인터페이스에 디폴트메서드 추가, 구현클래스에서 디폴트메서드를 오버라이딩

class DefaultMethodTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child11 c = new Child11();
		c.method1();
		c.method2();
		MyInterface.staticMethod();
		MyInterface2.staticMethod();

	}

}

class Child11 extends Parent11 implements MyInterface, MyInterface2 { // 인터페이스 두개 구현
	public void method1() {
		System.out.println("method1() in Child");// 오버라이딩
	}
}

class Parent11 {
	public void method2() {
		System.out.println("method2() in Parent");
	}
}

interface MyInterface {
	default void method1() { // 디폴트메서드
		System.out.println("method1() in MyInterface");
	}

	default void method2() {
		System.out.println("method2() in MyInterface");
	}

	static void staticMethod() { // 인스턴스와 관계없는 독립적 메서드
		System.out.println("staticMethod() in MyInterface");
	}
}

interface MyInterface2 {
	default void method1() {
		System.out.println("method1() in MyInterface2");
	}

	static void staticMethod() {
		System.out.println("staticMethod() in MyInterface2");
	}
}