package ch5;

public class ArrayEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score = new int[5]; // 크기가 5인 정수형 배열 선언, 생성
		int k = 1;

		// 배열값 저장
		score[0] = 50;
		score[1] = 60;
		score[k + 1] = 70;
		score[3] = 80;
		score[4] = 90;

		int tmp = score[k + 2] + score[4]; // 170

		for (int i = 0; i < 5; i++) {
			System.out.printf("score[%d]:%d%n", i, score[i]);
		}

		System.out.printf("tmp:%d%n", tmp);
		// 배열의 인덱스가 유효한 범위를 넘어서 오류 발생함
		System.out.printf("score[%d]:%d%n", 7, score[7]);

	}

}
