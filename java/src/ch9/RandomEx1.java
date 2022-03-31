package ch9;

import java.util.Random;

public class RandomEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random(1);
		Random rand2 = new Random(1);

		System.out.println("= rand =");
		for (int i = 0; i < 5; i++) {
			System.out.println(i + ":" + rand.nextInt());
		}

		System.out.println();
		System.out.println("= rand2 =");
		for (int i = 0; i < 5; i++) {
			System.out.println(i + ":" + rand2.nextInt());
		}
	}

	// Random 인스턴스 rand와 rand2가 같은 종자값을 사용하기 때문에 같은 값들을 같은 순서로 얻음
	// Math.random()과 Random의 가장 큰 차이점 : 종자값을 설정할수있다는 것
}
