package ch3;

public class OperatorEx31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int dec = 1234;
		int hex = 0xABCD;
		int mask = 0xF;

		// ����Ʈ �����ڿ� ��Ʈand�����ڸ� �̿��ؼ� 16������ ���������� ���ڸ��� �̾Ƴ�
		// �� ������ �ݺ��ϸ� 16������ �� �ڸ��� �ϳ��� ���� �� ����
		System.out.printf("hex=%X%n", hex);
		System.out.printf("%X%n", hex & mask);

		hex = hex >> 4;
		System.out.printf("%X%n", hex & mask);

		hex = hex >> 4;
		System.out.printf("%X%n", hex & mask);

		hex = hex >> 4;
		System.out.printf("%X%n", hex & mask);
	}

}
