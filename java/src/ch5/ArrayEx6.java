package ch5;

public class ArrayEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] score = { 79, 88, 91, 33, 100, 55, 95 };

		// 0번째 값으로 초기화
		int max = score[0];
		int min = score[0];

		// 최대값, 최소값 구하기
		for (int i = 0; i < score.length; i++) {
			if (score[i] > max) {
				max = score[i]; // score의 값들과 비교하며 max보다 크면 값 바꿈
			} else if (score[i] < min) {
				min = score[i]; // score의 값들과 비교하며 min보다 작으면 값 바꿈
			}
		}
		System.out.println("최대값: " + max);
		System.out.println("최소값: " + min);
	}

}
