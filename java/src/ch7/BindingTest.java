package ch7;

class BindingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent1 p = new Child1();
		Child1 c = new Child1();

		System.out.println("p.x=" + p.x);// parent의 x
		p.method(); // 오버라이딩 된 메서드
		System.out.println("c.x=" + c.x); // child의 x
		c.method(); // 오버라이딩 된 메서드
	}

}

//parent와 child에 같은 이름의 변수 x가 있다
class Parent1 {
	int x = 100;

	void method() {
		System.out.println("parent method");
	}
}

class Child1 extends Parent1 {
	int x = 20;

	void method() { //오버라이딩
		System.out.println("child method");
	}
}
