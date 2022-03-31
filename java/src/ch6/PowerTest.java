package ch6;

public class PowerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 2;
		int n = 5;
		long result = 0;
		long result2 = 0;

		// x^1부터 x^n까지의 합을 구하는 예제
		for (int i = 1; i <= n; i++) {
			result += power(x, i);
			result2 += power2(x, i);
			System.out.print("재귀:" + result);
			System.out.println(" / 반복문:" + result2);
		}
		System.out.println("재귀:" + result);
		System.out.println("반복문:" + result2);
	}

	// x를 n번 곱한다
	static long power(int x, int n) {
		// n=1이면 x^1=x
		if (n == 1)
			return x;

		return x * power(x, n - 1);
	}

	// 반복문 사용
	static long power2(int x, int n) {

		int result = 1;
		if (n == 1) {
			return x;
		}

		for (int i = 1; i <= n; i++) {
			result *= x;// x를 n번 곱한다
		}

		return result;
	}

}
