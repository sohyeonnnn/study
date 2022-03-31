package ch5;

public class ArrayEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0; // 총점
		float average = 0f; // 평균

		int[] score = { 100, 88, 100, 100, 90 };

		for (int i = 0; i < score.length; i++) {
			sum += score[i]; // 모든 점수의 합
		}

		// 정확한 계산을 위해 float으로 형변환 후 평균구하기
		average = sum / (float) score.length;

		System.out.println("총점: " + sum);
		System.out.println("평균: " + average);

	}

}
