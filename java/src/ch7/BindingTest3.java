package ch7;

public class BindingTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent3 p = new Child3();
		Child3 c = new Child3();

		// �޼��� ȣ���ϸ� �׻� �������̵� �� �޼��尡 ȣ��ȴ�

		System.out.println("p.x=" + p.x); // parent�� x
		p.method();// �������̵� �� �޼���
		System.out.println();
		System.out.println("c.x=" + c.x); // child�� x
		c.method(); // �������̵� �� �޼���(child�� method)
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

	void method() { // �������̵�
		System.out.println("x=" + x);
		System.out.println("super.x=" + super.x); // parent�� x
		System.out.println("this.x=" + this.x); // child�� x, �ν��Ͻ��� x
	}
}
