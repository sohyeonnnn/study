package ch7;

public class BindingTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent2 p = new Child2();
		Child2 c = new Child2();

		System.out.println("p.x=" + p.x);
		p.method();
		System.out.println("c.x=" + c.x);
		c.method();
	}

}

//child에는 아무런 멤버도 정의되어있지않고, 모든것을 parent로부터 상속
class Parent2 {
	int x = 100;

	void method() {
		System.out.println("parent method");
	}
}

class Child2 extends Parent2 {

}