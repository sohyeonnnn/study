package ch5;

import java.util.Scanner;

public class MultiArrEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//좌표에 x표 하기
		final int SIZE = 10;
		int x = 0, y = 0;
		// 좌표로 상대방의 배의 위치를 알아내는 게임
		char[][] board = new char[SIZE][SIZE];
		byte[][] shipBoard = {  { 0, 0, 0, 0, 0, 0, 1, 0, 0 }, 
								{ 1, 1, 1, 1, 0, 0, 1, 0, 0 },
								{ 0, 0, 0, 0, 0, 0, 1, 0, 0 }, 
								{ 0, 0, 0, 0, 0, 0, 1, 0, 0 }, 
								{ 0, 0, 0, 0, 0, 0, 0, 0, 0 },
								{ 1, 1, 0, 1, 0, 0, 0, 0, 0 }, 
								{ 0, 0, 0, 1, 0, 0, 0, 0, 0 }, 
								{ 0, 0, 0, 1, 0, 0, 0, 0, 0 },
								{ 0, 0, 0, 0, 0, 1, 1, 1, 0 }, }; // 0은 바다 1은 배

	
		for (int i = 1; i < SIZE; i++) { //몇번째 행, 열인지 표시
			board[0][i] = board[i][0] = (char) (i + '0'); // char배열이므로 문자형으로 저장
		}
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.printf("좌표를 입력하세요(종료는 00)> ");
			String input = sc.nextLine();

			if (input.length() == 2) { // 두자리 입력했는지 확인하고 문자로 형변환
				x = input.charAt(0) - '0';
				y = input.charAt(1) - '0';

				if (x == 0 && y == 0) { // 00이면 종료
					break;
				}

				if (input.length() != 2 || x <= 0 || x >= SIZE || y <= 0 || y >= SIZE) { // 2자리입력x,음수,size보다큰수 입력시
					System.out.println("잘못된 입력입니다. 다시 입력해주세요");
					continue;
				}

				board[x][y] = shipBoard[x - 1][y - 1] == 1 ? 'O' : 'X'; //1이면 o, 아니면 x

				for (int i = 0; i < SIZE; i++) {
					System.out.println(board[i]);
				}
				System.out.println();
			}
		}
	}

}