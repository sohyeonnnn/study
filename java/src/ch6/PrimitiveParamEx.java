package ch6;


class Data {
	int x;
}

public class PrimitiveParamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �⺻�� �Ű����� : ������ �� read only
		// ������ �Ű����� : ������ �� read&write
		Data d = new Data();
		d.x = 10; // ��ü d�� x���� 10���� ����
		System.out.println("main:x=" + d.x);
		change(d.x); // d�� x���� �����ϴ� �޼��� ȣ��
		System.out.println("after change(d.x)");
		System.out.println("main:x=" + d.x); // �޼��� ȣ�� �� ����� ��=10 - ������ ���� ������� �ʴ´�

	}

	static void change(int x) {
		x = 1000; // ���� 1000���� ����
		//d.x�� ���� ����� ���� �ƴ϶� change�޼����� �Ű�����x�� ���� ����Ȱ�
		//������ �ƴ� ���纻�� ����� ���̱� ������ �����̴� �ƹ��� ������ ��ġ�� ���Ѵ�
		System.out.println("change:x=" + x);
	}

}
