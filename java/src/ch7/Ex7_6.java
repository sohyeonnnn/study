package ch7;

class Parent76 {
	int x = 100;

	Parent76() {
		this(200);
	}

	Parent76(int x) {
		this.x = x; // 4.x=1000
	}

	int getX() {
		return x; // 6. x�� ����
	}
}

class Child76 extends Parent76 {
	int x = 3000;

	Child76() {// 2. �⺻������ ȣ��
		this(1000); // 3.���� ������
	}

	Child76(int x) {
		this.x = x;
	}
}

public class Ex7_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child76 c = new Child76(); // 1.child �ν��Ͻ� c ���� -> ������, x=1000
		System.out.println("x=" + c.getX()); // 5.c.getXȣ��
	}

}
