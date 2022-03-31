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

		// 문제점 : 숫자들의 위치가 잘 섞이지 않음 -> hashset은 자체적인 저장방식에 따라 순서가 결정
		// 해결1: linkedhastset을 사용
		// Set set = new LinkedHashSet();

		Set set = new HashSet();

		int[][] board = new int[5][5];

		for (int i = 0; set.size() < 25; i++) {
			// set의 크기가 25가 되기 전까지
			// 1~30까지의 랜덤숫자를 생성하여 문자열로 변환한후 set에 저장
			set.add((int) (Math.random() * 30) + 1 + "");
		}

		// 해결2: 저장순서를 유지하는 List인터페이스를 구현한 컬렉션 클래스 사용
		ArrayList list = new ArrayList(set);
		Collections.shuffle(list); // 셔플
		Iterator it = list.iterator();

		// Iterator it = set.iterator();

		for (int i = 0; i < board.length; i++) { // 행
			for (int j = 0; j < board[i].length; j++) { // 열
				// set에서 하나씩 꺼내서 정수로 변환후 board에 저장
				board[i][j] = Integer.parseInt((String) it.next());
				// 한자리 숫자면 앞에 공백과 함께 출력
				System.out.print((board[i][j] < 10 ? "  " : " ") + board[i][j]);
			}
			System.out.println();
		}

	}

}
