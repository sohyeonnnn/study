package ch11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Exercise11_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ������ : ���ڵ��� ��ġ�� �� ������ ���� -> hashset�� ��ü���� �����Ŀ� ���� ������ ����
		// �ذ�1: linkedhastset�� ���
		// Set set = new LinkedHashSet();

		Set set = new HashSet();

		int[][] board = new int[5][5];

		for (int i = 0; set.size() < 25; i++) {
			// set�� ũ�Ⱑ 25�� �Ǳ� ������
			// 1~30������ �������ڸ� �����Ͽ� ���ڿ��� ��ȯ���� set�� ����
			set.add((int) (Math.random() * 30) + 1 + "");
		}

		// �ذ�2: ��������� �����ϴ� List�������̽��� ������ �÷��� Ŭ���� ���
		ArrayList list = new ArrayList(set);
		Collections.shuffle(list); // ����
		Iterator it = list.iterator();

		// Iterator it = set.iterator();

		for (int i = 0; i < board.length; i++) { // ��
			for (int j = 0; j < board[i].length; j++) { // ��
				// set���� �ϳ��� ������ ������ ��ȯ�� board�� ����
				board[i][j] = Integer.parseInt((String) it.next());
				// ���ڸ� ���ڸ� �տ� ����� �Բ� ���
				System.out.print((board[i][j] < 10 ? "  " : " ") + board[i][j]);
			}
			System.out.println();
		}

	}

}
