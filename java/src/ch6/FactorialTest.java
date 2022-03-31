package ch6;

public class FactorialTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = factorial(4); // ���ȣ��
		// �Ű������� 0�� �ؾƸ�, if���ǽ��� ���� ���� �� �� ���� ������ ��� ���ȣ�⸸ �Ͼ�� �޼��尡 ������� �ʴ´�
		// ���ÿ� �����Ͱ� ��� ���� - ������ �����Ѱ踦 �Ѿ� '���ÿ����÷ο� ����'�߻�
		System.out.println(result);
	}

	// ���ȣ�� - ���ǹ� �ʼ�
	static int factorial(int n) {

		// factorial�� �ݺ������� �ۼ��Ѵٸ�
		/*
		 * int result2 = 1; while (n != 0) { result2 *= n--; }
		 */

		int result = 0;

		// �Ű����� ��ȿ���˻�
		// n�� ���Ѱ��� 12�� ���� ������ 13!�� ���� int�� �ִ밪���� ũ�� ������
		if (n <= 0 || n > 12) {
			return -1;
		}

		if (n == 1) { // 1�� �����ϸ� ����
			result = 1;
		} else {
			result = n * factorial(n - 1); // n=1���� �ݺ�
		}
		return result;
	}

}
