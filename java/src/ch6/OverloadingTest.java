package ch6;

class OverloadingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// �����ε�
		// �� Ŭ���� ���� �̹� ����Ϸ��� �̸��� ���� �̸��� ���� �޼��尡 �ִ��ϴ���
		// �Ű������� ���� �Ǵ� Ÿ���� �ٸ���, ���� �̸��� ����ؼ� �޼��带 ������ ���ִ�
		// 1)�޼����̸��� ���ƾ��Ѵ�
		// 2)�Ű������� ���� �Ǵ� Ÿ���� �޶���Ѵ�

		MyMath3 mm = new MyMath3();
		// add�޼��尡 ���� ��µǴ� ����
		// println�޼��尡 ����� ����Ϸ���, add�޼����� ����� ���� ���Ǿ�� �ϱ� ������
		// add�޼��� ���� �����Ѵ�
		System.out.println("mm.add(3,3) ���:" + mm.add(3, 3));
		System.out.println("mm.add(3l,3) ���:" + mm.add(3l, 3));
		System.out.println("mm.add(3,3l) ���:" + mm.add(3, 3l));
		System.out.println("mm.add(3l,3l) ���:" + mm.add(3l, 3l));

		int[] a = { 100, 200, 300 };
		System.out.println("mm.add(a) ���:" + mm.add(a));
	}

}

class MyMath3 {

	// �޼��� �����ε�
	// �̸��� ����, �Ű������� ���� �Ǵ� Ÿ���� �ٸ�
	int add(int a, int b) {
		System.out.print("int add(int a, int b) - ");
		return a + b;
	}

	long add(int a, long b) {
		System.out.print("long add(int a, long b) - ");
		return a + b;
	}

	long add(long a, long b) {
		System.out.print("long add(long a, int b) - ");
		return a + b;
	}

	long add(long a, int b) {
		System.out.print("long add(long a, long b) - ");
		return a + b;
	}

	int add(int[] a) { // �迭�� ��� ����� ���� ����� ������
		System.out.print("int add(int[] a) - ");
		int result = 0;
		for (int i = 0; i < a.length; i++) {
			result += a[i];
		}
		return result;
	}
}
