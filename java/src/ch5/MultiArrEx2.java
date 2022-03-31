package ch5;

import java.util.Scanner;

public class MultiArrEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 5*5 ����
		final int SIZE = 5;
		int x = 0, y = 0, num = 0;

		int[][] bingo = new int[SIZE][SIZE];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) { // 5*5 �����ǿ� 1~25������ ���ڷ� �ʱ�ȭ��Ŵ
				bingo[i][j] = i * SIZE + j + 1; // j�� 0���� �����ϴϱ� +1
			}
		}

		for (int i = 0; i < SIZE; i++) { // ������ ���ڵ��� ���´�
			for (int j = 0; j < SIZE; j++) {
				x = (int) (Math.random() * SIZE);
				y = (int) (Math.random() * SIZE);

				int tmp = bingo[i][j];
				bingo[i][j] = bingo[x][y];
				bingo[x][y] = tmp; // ������ �ڸ��� ���� ��ȯ
			}
		}
		do { // ����ڰ� ����0�� �Է��Ҷ����� �ݺ�
			for (int i = 0; i < SIZE; i++) {
				for (int j = 0; j < SIZE; j++) {
					System.out.printf("%2d ", bingo[i][j]); // ������ ���
				}
				System.out.println();
			}
			System.out.println();

			System.out.printf("1~%d�� ���ڸ� �Է��ϼ���(����:0) >", SIZE * SIZE);
			String tmp = sc.nextLine();
			num = Integer.parseInt(tmp); // �Է¹޾Ƽ� ���ڷ� ����ȯ

			outer: for (int i = 0; i < SIZE; i++) {
				for (int j = 0; j < SIZE; j++) {
					if (bingo[i][j] == num) { // �Է¹��� ���ڰ� �����ǿ� ������ 0���� �ٲ۴�
						bingo[i][j] = 0;
						break outer; // outer for�� ����
					}
				}
			}
		} while (num != 0);
	}
}
