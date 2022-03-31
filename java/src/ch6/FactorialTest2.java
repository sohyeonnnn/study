package ch6;

public class FactorialTest2 {

	// 매개변수의 유효성검사
	static long factorial(int n) {
		if (n <= 0 || n > 20) {
			// 매개변수의 유효성 검사,20!은 double형 최대값 초과
			// 음수거나 20보다 크면 -1반환
			return -1;
		}
		if (n <= 1) {
			return 1;
		}
		return n * factorial(n - 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 21;
		long result = 0;

		for (int i = 1; i <= n; i++) {
			result = factorial(i); // 재귀

			if (result == -1) {
				System.out.printf("유효하지 않은 값입니다(0<n<=20):%d%n", n);
				break;
			}
			System.out.printf("%2d!=%20d%n", i, result);
		}

	}

}
