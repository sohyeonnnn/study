package ch11;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Bingo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Set set = new HashSet();
		int[][] board = new int[5][5]; // 5*5 배열 생성

		Set set = new LinkedHashSet();

		// 실행시켜보면 같은 숫자가 비슷한 위치에 나온다
		// ->HashSet은 저장된 순서를 보장하지 않고 자체적인 저장방식에 따라 순서가 결정되기 때문
		// HashSet보다 LinkedHashSet이 더 나은 선택

		for (int i = 0; set.size() < 25; i++) {
			set.add((int) (Math.random() * 50) + 1 + ""); // 1~50까지 랜덤숫자 문자형태로 저장
		}

		Iterator it = set.iterator();

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				// 하나씩 꺼내와서 정수로 변환후 배열에 저장
				board[i][j] = Integer.parseInt((String) it.next());
				System.out.print((board[i][j] < 10 ? "  " : " ") + board[i][j]);
			}
			System.out.println();
		}
	}

}
