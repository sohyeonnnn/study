package ch5;

import java.util.Scanner;

public class MultiArrEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��ǥ�� xǥ �ϱ�
		final int SIZE = 10;
		int x = 0, y = 0;
		// ��ǥ�� ������ ���� ��ġ�� �˾Ƴ��� ����
		char[][] board = new char[SIZE][SIZE];
		byte[][] shipBoard = {  { 0, 0, 0, 0, 0, 0, 1, 0, 0 }, 
								{ 1, 1, 1, 1, 0, 0, 1, 0, 0 },
								{ 0, 0, 0, 0, 0, 0, 1, 0, 0 }, 
								{ 0, 0, 0, 0, 0, 0, 1, 0, 0 }, 
								{ 0, 0, 0, 0, 0, 0, 0, 0, 0 },
								{ 1, 1, 0, 1, 0, 0, 0, 0, 0 }, 
								{ 0, 0, 0, 1, 0, 0, 0, 0, 0 }, 
								{ 0, 0, 0, 1, 0, 0, 0, 0, 0 },
								{ 0, 0, 0, 0, 0, 1, 1, 1, 0 }, }; // 0�� �ٴ� 1�� ��

	
		for (int i = 1; i < SIZE; i++) { //���° ��, ������ ǥ��
			board[0][i] = board[i][0] = (char) (i + '0'); // char�迭�̹Ƿ� ���������� ����
		}
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.printf("��ǥ�� �Է��ϼ���(����� 00)> ");
			String input = sc.nextLine();

			if (input.length() == 2) { // ���ڸ� �Է��ߴ��� Ȯ���ϰ� ���ڷ� ����ȯ
				x = input.charAt(0) - '0';
				y = input.charAt(1) - '0';

				if (x == 0 && y == 0) { // 00�̸� ����
					break;
				}

				if (input.length() != 2 || x <= 0 || x >= SIZE || y <= 0 || y >= SIZE) { // 2�ڸ��Է�x,����,size����ū�� �Է½�
					System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է����ּ���");
					continue;
				}

				board[x][y] = shipBoard[x - 1][y - 1] == 1 ? 'O' : 'X'; //1�̸� o, �ƴϸ� x

				for (int i = 0; i < SIZE; i++) {
					System.out.println(board[i]);
				}
				System.out.println();
			}
		}
	}

}