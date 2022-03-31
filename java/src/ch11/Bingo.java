package ch11;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Bingo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Set set = new HashSet();
		int[][] board = new int[5][5]; // 5*5 �迭 ����

		Set set = new LinkedHashSet();

		// ������Ѻ��� ���� ���ڰ� ����� ��ġ�� ���´�
		// ->HashSet�� ����� ������ �������� �ʰ� ��ü���� �����Ŀ� ���� ������ �����Ǳ� ����
		// HashSet���� LinkedHashSet�� �� ���� ����

		for (int i = 0; set.size() < 25; i++) {
			set.add((int) (Math.random() * 50) + 1 + ""); // 1~50���� �������� �������·� ����
		}

		Iterator it = set.iterator();

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				// �ϳ��� �����ͼ� ������ ��ȯ�� �迭�� ����
				board[i][j] = Integer.parseInt((String) it.next());
				System.out.print((board[i][j] < 10 ? "  " : " ") + board[i][j]);
			}
			System.out.println();
		}
	}

}
