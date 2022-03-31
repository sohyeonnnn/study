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

//A�� �ۼ��Ϸ��� B�� �̹� �ۼ��Ǿ��־�� �Ѵ�, B�� ����ΰ� ����Ǹ� A�� ����Ǿ��Ѵ� -> A-B ����������

//Ŭ����A�� Ŭ����B�� ���� ȣ������ �ʰ� �������̽��� �Ű�ü�� �ؼ� �����Ѵٸ� �����̵Ǿ �������

interface I {// Ŭ����B�� ���ǵ� �޼��带 �߻�޼���� �����ϴ� �������̽�
	public abstract void methodB();
}

class B2 implements I {
	public void methodB() {
		System.out.println("methodB in B class");
	}
}

class A2 { //A2�� �����ϴµ� B�� ������ ����
	public void methodA(I i) {
		i.methodB();
	}
}

class InterfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		a.methodA(new B());

		// �������̽� ���
		A2 a2 = new A2();
		a2.methodA(new B2());

	}

}
