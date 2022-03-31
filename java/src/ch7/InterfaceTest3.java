package ch7;

class InterfaceTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A4 a = new A4();
		a.methodA();

	}
}

class A4 {
	void methodA() {
		I i = InstanceManager.getInstance(); // B�ν��Ͻ� ����
		i.methodB(); // i�� ���� b�� �ִ� �޼��� ����
		System.out.println(i.toString());
	}
}

interface I4 { // �������̽�
	public abstract void methodB();
}

class B4 implements I { // �������̽� ���� Ŭ����
	public void methodB() {
		System.out.println("methodB in B class");
	}

	public String toString() {
		return "class B";
	}
}

class InstanceManager {
	public static I getInstance() {
		return new B4(); // B�� �����ؼ� ��ȯ, �ٸ� �ν��Ͻ��� �ٲٷ��� ���⸸ ����
	}
}
