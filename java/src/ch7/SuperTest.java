package ch7;

//�������̵�:���� Ŭ�����κ��� ��ӹ��� �޼����� ������ �����ϴ°� 
//        ��ӹ��� �޼��带 �״�� ����ϱ⵵ ������, �ڼ� Ŭ���� �ڽſ� �°� �����ؾ��ϴ� ��� �������̵�

//�������̵��� ���� - �޼�����
//1. �̸��� ���ƾ���
//2. �Ű������� ���ƾ���
//3. ��ȯŸ���� ���ƾ���

//4. ���������ڸ� ����Ŭ������ �޼��庸�� ���� ������ ������ �� ���� (public-protected-default-private)
//5. ���ܴ� ���� Ŭ������ �޼��庸�� ���� ������ �� ����
//6. �ν��Ͻ��޼��带 static�޼���� �Ǵ� �� �ݴ�� ������ �� ����

//super: �ڼ�Ŭ�������� ���� Ŭ�����κ��� ��ӹ��� ����� �����ϴµ� ���Ǵ� ��������
//		��ӹ��� ����� �ڽ��� ����� �̸��� ���� �� super�� ����

public class SuperTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c = new Child();
		c.method();
	}

}

class Parent {
	int x = 10;
}

class Child extends Parent { // parent ���
	int x = 20;

	void method() {
		System.out.println("x=" + x); //child�� x
		System.out.println("this.x=" + this.x); //child�� x
		System.out.println("super.x=" + super.x); // parent�� x, ��ӹ��� �������
	}
}