package ch6;

public class MyMathTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyMath mm = new MyMath(); // �޼��带 ȣ���ϱ� ���� MyMathŬ������ �ν��Ͻ� ����

		// �޼��尡 ȣ��Ǹ� ���ݱ��� ���� ���̴� �޼���� ������ ���߰�
		// ȣ��� �޼����� ������� ����
		// �۾��� ��� ������ �ٽ� ���ƿ� ������ ������� ����
		long result1 = mm.add(5l, 3l); // mm���� ����
		long result2 = mm.subtract(5l, 3l);
		long result3 = mm.multiply(5l, 3l);
		double result4 = mm.divide(5l, 3l); // �Ű������� double�� �ƴ� long������ �ڵ����� ����ȯ�ȴ�

		// ��� ���
		System.out.println("add(5l, 3l)=" + result1);
		System.out.println("substract(5l, 3l)=" + result2);
		System.out.println("multiply(5l, 3l)=" + result3);
		System.out.println("divide(5l, 3l)=" + result4);

	}

}

class MyMath {
	// �� ���� ���� �Ű������� �޾Ƽ� ��Ģ������ �����ϴ� 4���� �޼��带 ���� Ŭ���� ����
	long add(long a, long b) {
		long result = a + b; // return�� �ѹ��� ��������
		return result;
	}

	long subtract(long a, long b) {
		return a - b;
	}

	long multiply(long a, long b) {
		return a * b;
	}

	double divide(double a, double b) {
		// ��ȿ�� �˻�
		if (b == 0) {
			System.out.println("0���� ���� �� �����ϴ�");
			return 0;
		}

		return a / b;
	}
}
