package ch7;

//�������̽��� �߻�޼��带 �߰� - �������̽��� ������ ������ ��� Ŭ�������� ���� �߰��� �޼��带 �����ؾ���
//-> �ذ� - ������Ʈ �޼��塯 : �߻�޼����� �⺻���� ������ �����ϴ� �޼���
//�������̽��� ����Ʈ�޼��� �߰�, ����Ŭ�������� ����Ʈ�޼��带 �������̵�

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

class Child11 extends Parent11 implements MyInterface, MyInterface2 { // �������̽� �ΰ� ����
	public void method1() {
		System.out.println("method1() in Child");// �������̵�
	}
}

class Parent11 {
	public void method2() {
		System.out.println("method2() in Parent");
	}
}

interface MyInterface {
	default void method1() { // ����Ʈ�޼���
		System.out.println("method1() in MyInterface");
	}

	default void method2() {
		System.out.println("method2() in MyInterface");
	}

	static void staticMethod() { // �ν��Ͻ��� ������� ������ �޼���
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