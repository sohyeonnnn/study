package ch7;

class InnerEx2 {

	class InstanceInner2 {
	}

	static class StaticInner2 {
	}
	//�ν��Ͻ������ static��� �׻� ���� ����, �ݴ�� x

	// �ν��Ͻ���� ������ ���� ���� ������ ����
	InstanceInner2 iv = new InstanceInner2();
	// static��� ������ ���� ���� ������ ����
	static StaticInner2 cv = new StaticInner2();

	static void staticMethod() {
		// static����� �ν��Ͻ������ ���� ���� �Ұ���
		// InstanceInner2 obj1=new InstanceInner2();
		StaticInner2 obj2 = new StaticInner2();

		// ���� �����Ϸ��� �Ʒ��� ���� ��ü�� ����
		// �ν��Ͻ�Ŭ������ �ܺ� Ŭ������ ���� �����ؾ߸� ��������
		InnerEx2 outer = new InnerEx2();
		InstanceInner2 obj1 = outer.new InstanceInner2();
	}

	void instanceMethod() {
		// �ν��Ͻ��޼��忡���� �ν��Ͻ������ static��� ��� ���� ����
		InstanceInner2 obj1 = new InstanceInner2();
		StaticInner2 obj2 = new StaticInner2();
		// �޼��� ���� ���������� ����� ���� Ŭ������ �ܺο��� ���� �Ұ���
		// LocalInner lv=new LocalInner();
	}

	void myMethod() {
		class LocalInner {
		}
		LocalInner lv = new LocalInner();
	}

}