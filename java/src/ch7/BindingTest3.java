package ch7;

public class BindingTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent3 p = new Child3();
		Child3 c = new Child3();

		// 메서드 호출하면 항상 오버라이딩 된 메서드가 호출된다

		System.out.println("p.x=" + p.x); // parent의 x
		p.method();// 오버라이딩 된 메서드
		System.out.println();
		System.out.println("c.x=" + c.x); // child의 x
		c.method(); // 오버라이딩 된 메서드(child의 method)
	}

}

class Parent3 {
	int x = 100;

	void method() {
		System.out.println("parent method");
	}
}

class Child3 extends Parent3 {
	int x = 200;

	void method() { // 오버라이딩
		System.out.println("x=" + x);
		System.out.println("super.x=" + super.x); // parent의 x
		System.out.println("this.x=" + this.x); // child의 x, 인스턴스의 x
	}
}
