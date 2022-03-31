package ch6;

public class PowerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 2;
		int n = 5;
		long result = 0;
		long result2 = 0;

		// x^1���� x^n������ ���� ���ϴ� ����
		for (int i = 1; i <= n; i++) {
			result += power(x, i);
			result2 += power2(x, i);
			System.out.print("���:" + result);
			System.out.println(" / �ݺ���:" + result2);
		}
		System.out.println("���:" + result);
		System.out.println("�ݺ���:" + result2);
	}

	// x�� n�� ���Ѵ�
	static long power(int x, int n) {
		// n=1�̸� x^1=x
		if (n == 1)
			return x;

		return x * power(x, n - 1);
	}

	// �ݺ��� ���
	static long power2(int x, int n) {

		int result = 1;
		if (n == 1) {
			return x;
		}

		for (int i = 1; i <= n; i++) {
			result *= x;// x�� n�� ���Ѵ�
		}

		return result;
	}

}
