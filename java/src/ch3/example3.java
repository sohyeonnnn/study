package ch3;

public class example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ��������3-3 : num�� ���� ���� ���/����/0 ��� - ���׿�����
		int num3 = 0;
		System.out.print("[��������3-3] ");
		System.out.println((num3 > 0 ? "���" : (num3 == 0 ? "0" : "����")));

		// ��������3-4 : num�� �����ڸ� ���� ������
		int num4 = 321;
		System.out.print("[��������3-4] ");
		System.out.println(num4 / 100 * 100);

		// ��������3-5 : num�� ���� �ڸ��� 1�� �ٲٱ�
		int num5 = 343;
		System.out.print("[��������3-5] ");
		System.out.println(num5 / 10 * 10 + 1);

		// ��������3-6 : num�� ������ ũ�鼭 ���� ����� 10�� ������� num�� ���� �� ������ ���ϱ�
		int num6 = 97;
		System.out.print("[��������3-6] ");
		System.out.println((num6 / 10 + 1) * 10 - num6);

		// ��������3-7 : ȭ���� ������ ��ȯ, �Ҽ��� ��°�ڸ����� �ݿø�
		int f = 100;
		// math.round()�� ������� �ʰ� ó��
		float c = (int) (((float) f - 32) * 5 / 9 * 100 + 0.5) / 100.0f;
		System.out.print("[��������3-7] ");
		System.out.println("celcius:" + c);

		// ��������3-9 : ch�� �������̰ų� ������ ���� b�� ���� true
		char ch = 'z';
		boolean b = ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9'));
		System.out.print("[��������3-9] ");
		System.out.println(b);

		// ��������3-10 : ���ڰ� �빮���� ��쿡�� �ҹ��ڷ� ����
		char ch2 = 'A';
		char lowerCase = (ch2 >= 'A' && ch2 <= 'Z') ? (char) (ch2 + 32) : ch2;
		System.out.print("[��������3-10] ");
		System.out.print("ch:" + ch2);
		System.out.println(" -> lowerCase:" + lowerCase);

	}

}
