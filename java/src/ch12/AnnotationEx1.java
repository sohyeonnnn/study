package ch12;

class Parent {
	void parentMethod() {
	}
}

class Child extends Parent {

	@Override
	void parentMethod() {
		// ���� �޼����� �̸��� �߸� ������ -> ����, �������̵��� �ؾ��ϴµ� �����ʾƼ�
	}

}
