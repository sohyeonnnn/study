package ch5;

public class ArrayEx8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ball = new int[45]; // ũ�Ⱑ 45�� ������ �迭 ����,����

		for (int i = 0; i < ball.length; i++) {
			ball[i] = i + 1; // �迭�� 1~45 �� ����
		}

		int tmp = 0;
		int j = 0;

		// �迭�� i��° ��ҿ� ������ ��ҿ� ����� ���� ���� �ٲ㼭 ���� ���´�
		// 0��° ���� 5��° ��ұ��� ��� 6���� �ٲ۴�

		for (int i = 0; i < 6; i++) { // �տ������� 6���� ���� �ٲ�
			j = (int) (Math.random() * 45); // ������ ���
			// �� ��ȯ
			tmp = ball[i];
			ball[i] = ball[j];
			ball[j] = tmp;
		}
		// �迭���� �տ������� ��6�� ���
		for (int i = 0; i < 6; i++) {
			System.out.printf("ball[%d]=%d%n", i, ball[i]);
		}
	}

}
