package ex;

import java.util.Scanner;

public class Sort {

	// 100 ������ ���� 5�� �Է¹޾Ƽ� sort
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int num[] = new int[5]; // ���� 5�� ���� �迭
		for (int i = 0; i < num.length; i++) { // 5�� ����
			System.out.print("���� �Է�(1~100) > ");
			int n = sc.nextInt();
			if (n < 1 || n > 100) { // 1~100 ���� �ƴҰ��
				i--;
				continue;
			}
			num[i] = n;
		}

		// ����
		for (int i = 0; i < num.length - 1; i++) { // (�迭����-1)�� ��
			for (int j = 0; j < num.length - i - 1; j++) { // ������ i�� ��Ҵ� �������� ������ �Ǿ������Ƿ� ��x
				if (num[j] > num[j + 1]) { // ������ ���ڰ� �� ũ�� ���� �ٲ۴�
					int tmp = num[j];
					num[j] = num[j + 1];
					num[j + 1] = tmp;
				}
			}
		}

		// ���
		for (int i : num) {
			System.out.print(i + " ");
		}
	}
}
