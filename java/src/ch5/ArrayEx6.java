package ch5;

public class ArrayEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] score = { 79, 88, 91, 33, 100, 55, 95 };

		// 0��° ������ �ʱ�ȭ
		int max = score[0];
		int min = score[0];

		// �ִ밪, �ּҰ� ���ϱ�
		for (int i = 0; i < score.length; i++) {
			if (score[i] > max) {
				max = score[i]; // score�� ����� ���ϸ� max���� ũ�� �� �ٲ�
			} else if (score[i] < min) {
				min = score[i]; // score�� ����� ���ϸ� min���� ������ �� �ٲ�
			}
		}
		System.out.println("�ִ밪: " + max);
		System.out.println("�ּҰ�: " + min);
	}

}
