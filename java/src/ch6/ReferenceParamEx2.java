package ch6;

public class ReferenceParamEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] x = { 10 };
		System.out.println("main:x=" + x[0]);

		change(x); // �Ű����� : �迭 (������)
		System.out.println("after change(x)");
		System.out.println("main:x=" + x[0]); // �� �����

		// �迭�� ��ü�� ���� ���������� ���� �����Ͱ� ����� ������ �����ϹǷ� ���� ������ �� �ִ�
		// �ӽ������� ������ ó���� ���� ������ Ŭ������ �����ϴ� �ͺ��� ��ó�� �迭�� �̿��� ���� �ִ�

	}

	static void change(int[] x) {
		x[0] = 1000;
		System.out.println("change:x=" + x[0]);
	}
}
