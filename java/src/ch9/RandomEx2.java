package ch9;

import java.util.Random;

public class RandomEx2 {

	// 0~9 ������ ������ 100�� �߻���Ű�� �� ������ �󵵼��� �� ���� �׷����� �׸��� ����
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int[] number = new int[100];
		int[] counter = new int[10];

		for (int i = 0; i < number.length; i++) {
			System.out.print(number[i] = rand.nextInt(10)); // 0~10������ �������� 100�� �߻�
		}
		System.out.println();

		for (int i = 0; i < number.length; i++) {
			counter[number[i]]++; // �� ������ �󵵼� count
		}

		for (int i = 0; i < counter.length; i++) {
			System.out.println(i + "�� ���� : " + printGraph('#', counter[i]) + "" + counter[i]);
		}
	}

	public static String printGraph(char ch, int value) {
		char[] bar = new char[value];

		for (int i = 0; i < bar.length; i++) {
			bar[i] = ch; // ������ ������ŭ ���� ���
		}
		return new String(bar);
	}

}
