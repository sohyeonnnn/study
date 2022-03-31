package ch6;

public class FactorialTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = factorial(4); // 재귀호출
		// 매개변수로 0을 준아면, if조건식이 절대 참이 될 수 없기 때문에 계속 재귀호출만 일어날뿐 메서드가 종료되지 않는다
		// 스택에 데이터가 계속 쌓임 - 스택의 저장한계를 넘어 '스택오버플로우 에러'발생
		System.out.println(result);
	}

	// 재귀호출 - 조건문 필수
	static int factorial(int n) {

		// factorial을 반복문으로 작성한다면
		/*
		 * int result2 = 1; while (n != 0) { result2 *= n--; }
		 */

		int result = 0;

		// 매개변수 유효성검사
		// n의 상한값을 12로 정한 이유는 13!의 값이 int의 최대값보다 크기 때문에
		if (n <= 0 || n > 12) {
			return -1;
		}

		if (n == 1) { // 1을 리턴하며 종료
			result = 1;
		} else {
			result = n * factorial(n - 1); // n=1까지 반복
		}
		return result;
	}

}
