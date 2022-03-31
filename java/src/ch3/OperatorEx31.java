package ch3;

public class OperatorEx31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int dec = 1234;
		int hex = 0xABCD;
		int mask = 0xF;

		// 쉬프트 연산자와 비트and연산자를 이용해서 16진수를 끝에서부터 한자리씩 뽑아냄
		// 이 과정을 반복하면 16진수의 각 자리를 하나씩 얻을 수 있음
		System.out.printf("hex=%X%n", hex);
		System.out.printf("%X%n", hex & mask);

		hex = hex >> 4;
		System.out.printf("%X%n", hex & mask);

		hex = hex >> 4;
		System.out.printf("%X%n", hex & mask);

		hex = hex >> 4;
		System.out.printf("%X%n", hex & mask);
	}

}
