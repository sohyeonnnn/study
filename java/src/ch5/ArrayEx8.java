package ch5;

public class ArrayEx8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ball = new int[45]; // 크기가 45인 정수형 배열 선언,생성

		for (int i = 0; i < ball.length; i++) {
			ball[i] = i + 1; // 배열에 1~45 값 저장
		}

		int tmp = 0;
		int j = 0;

		// 배열의 i번째 요소와 임의의 요소에 저장된 값을 서로 바꿔서 값을 섞는다
		// 0번째 부터 5번째 요소까지 모두 6개만 바꾼다

		for (int i = 0; i < 6; i++) { // 앞에서부터 6개의 값만 바꿈
			j = (int) (Math.random() * 45); // 임의의 요소
			// 값 교환
			tmp = ball[i];
			ball[i] = ball[j];
			ball[j] = tmp;
		}
		// 배열에서 앞에서부터 값6개 출력
		for (int i = 0; i < 6; i++) {
			System.out.printf("ball[%d]=%d%n", i, ball[i]);
		}
	}

}
