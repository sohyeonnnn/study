package ch2;

public class CastingEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float f = 9.1234567f;
		double d = 9.1234567;
		double d2 = (double) f;

		// f�� d�� ���� ���� ����������, ������ ����Ǵ� ���� �ٸ�
		// �����Ҷ� �̹� ���� �ٸ��� ������ ����ȯ�ص� ���� �������� ����

		System.out.printf("f=%20.18f\n", f);
		System.out.printf("d=%20.18f\n", d);
		System.out.printf("d2=%20.18f\n", d2);
	}

}
