package ch3;

public class OperatorEx28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 0xAB, y = 0xF;

		// |(or) : �ǿ����� �� �� ���� ���� 1�̸� 1 / �� �ܿ� 0
		// &(and) : �ǿ����� ������ ��� 1�̸� 1 / �� �ܿ� 0
		// ^(xor) : �ǿ����� ���� ���� �ٸ��� 1 / ���� �� 0
		System.out.printf("x=%#X \t\t\t%s%n", x, toBinaryString(x));
		System.out.printf("y=%#X \t\t\t%s%n", y, toBinaryString(y));
		System.out.printf("%#X | %#X = %#X \t%s%n", x, y, x | y, toBinaryString(x | y));
		System.out.printf("%#X & %#X = %#X \t%s%n", x, y, x & y, toBinaryString(x & y));
		System.out.printf("%#X ^ %#X = %#X \t%s%n", x, y, x ^ y, toBinaryString(x ^ y));
		System.out.printf("%#X ^ %#X ^ %#X = %#X %s%n", x, y, y, x ^ y ^ y, toBinaryString(x ^ y ^ y));

	}

	// 10�� ������ 2������ ��ȯ�ϴ� �޼���
	static String toBinaryString(int x) {
		String zero = "000000000000000000000000000000000";
		String tmp = zero + Integer.toBinaryString(x);
		return tmp.substring(tmp.length() - 32);
	}

}
