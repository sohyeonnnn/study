package ch7;

class BindingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent1 p = new Child1();
		Child1 c = new Child1();

		System.out.println("p.x=" + p.x);// parent�� x
		p.method(); // �������̵� �� �޼���
		System.out.println("c.x=" + c.x); // child�� x
		c.method(); // �������̵� �� �޼���
	}

}

//parent�� child�� ���� �̸��� ���� x�� �ִ�
class Parent1 {
	int x = 100;

	void method() {
		System.out.println("parent method");
	}
}

class Child1 extends Parent1 {
	int x = 20;

	void method() { //�������̵�
		System.out.println("child method");
	}
}
