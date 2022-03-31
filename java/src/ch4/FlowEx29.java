package ch4;

public class FlowEx29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 369게임
		for (int i = 1; i <= 100; i++) {

			System.out.printf("i=%d ", i);

			int tmp = i; // i의 각 자리를 확인하기 위해 임시값에 저장하여 연산

			do {
				// 3의 배수가 있는지 확인
				// tmp%10:n번째 자리수 -> 값이 0이 아닐때 %3하여 3의 배수인지 확인
				if (tmp % 10 % 3 == 0 && tmp % 10 != 0) {
					System.out.print("짝");
				}
			} while ((tmp /= 10) != 0); // tmp값이 0이 될때까지 반복 진행
			System.out.println();
		}
	}

}
