package ch5;

import java.util.Scanner;

public class MultiArrEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 5*5 빙고
		final int SIZE = 5;
		int x = 0, y = 0, num = 0;

		int[][] bingo = new int[SIZE][SIZE];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) { // 5*5 빙고판에 1~25까지의 숫자로 초기화시킴
				bingo[i][j] = i * SIZE + j + 1; // j가 0부터 시작하니까 +1
			}
		}

		for (int i = 0; i < SIZE; i++) { // 빙고판 숫자들을 섞는다
			for (int j = 0; j < SIZE; j++) {
				x = (int) (Math.random() * SIZE);
				y = (int) (Math.random() * SIZE);

				int tmp = bingo[i][j];
				bingo[i][j] = bingo[x][y];
				bingo[x][y] = tmp; // 임의의 자리의 값과 교환
			}
		}
		do { // 사용자가 종료0을 입력할때까지 반복
			for (int i = 0; i < SIZE; i++) {
				for (int j = 0; j < SIZE; j++) {
					System.out.printf("%2d ", bingo[i][j]); // 빙고판 출력
				}
				System.out.println();
			}
			System.out.println();

			System.out.printf("1~%d의 숫자를 입력하세요(종료:0) >", SIZE * SIZE);
			String tmp = sc.nextLine();
			num = Integer.parseInt(tmp); // 입력받아서 숫자로 형변환

			outer: for (int i = 0; i < SIZE; i++) {
				for (int j = 0; j < SIZE; j++) {
					if (bingo[i][j] == num) { // 입력받은 숫자가 빙고판에 있으면 0으로 바꾼다
						bingo[i][j] = 0;
						break outer; // outer for문 나감
					}
				}
			}
		} while (num != 0);
	}
}
