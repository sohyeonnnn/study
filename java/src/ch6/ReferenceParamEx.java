package ch6;

public class ReferenceParamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Data d = new Data();
		d.x = 10;
		System.out.println("main:x=" + d.x);

		change(d); // Data��ü d�� �Ű������� �Ѱ��ش�
		System.out.println("after change(d)");
		System.out.println("main:x=" + d.x); // �޼��� ȣ�� �� ����� ��=1000

		// �Ű������� �������̶� ���� ����� �ּҰ� �Ѿ - �� ���� ����

	}

	static void change(Data d) {
		d.x = 1000; // d�� x���� 1000���� ����
		System.out.println("change:x=" + d.x);
	}
}
