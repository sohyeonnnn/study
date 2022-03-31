package ch5;

public class ArrayEx18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] score = { { 100, 100, 100 }, { 20, 20, 20 }, { 30, 30, 30 }, { 40, 40, 40 } };
		int sum = 0;
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				System.out.printf("score[%d][%d]=%d%n", i, j, score[i][j]); //배열값 순서대로 출력
			}
		}
		// 향상된 for문 이용 - 모든 점수의 총합을 구한다
		for (int[] tmp : score) {
			for (int i : tmp) {
				sum += i;
			}
		}
		System.out.println("sum=" + sum);
	}

}
