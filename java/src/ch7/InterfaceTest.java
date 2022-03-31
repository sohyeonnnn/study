package ch7;

//A: user
class A {
	public void methodA(B b) {
		b.methodB();
	}
}

//B: provider
class B {
	public void methodB() {
		System.out.println("methodB()");
	}
}

//A를 작성하려면 B가 이미 작성되어있어야 한다, B의 선언부가 변경되면 A도 변경되어한다 -> A-B 직접적관계

//클래스A가 클래스B를 직접 호출하지 않고 인터페이스를 매개체로 해서 접근한다면 변경이되어도 영향없음

interface I {// 클래스B에 정의된 메서드를 추상메서드로 정의하는 인터페이스
	public abstract void methodB();
}

class B2 implements I {
	public void methodB() {
		System.out.println("methodB in B class");
	}
}

class A2 { //A2를 정의하는데 B가 사용되지 않음
	public void methodA(I i) {
		i.methodB();
	}
}

class InterfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		a.methodA(new B());

		// 인터페이스 사용
		A2 a2 = new A2();
		a2.methodA(new B2());

	}

}
