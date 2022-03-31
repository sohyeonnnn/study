package ch3;

public class OperatorEx10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1000000;

		int result1 = a * a / a; // 연산이 왼쪽부터 진행되는데 a*a가 int형 최대값을 초과하여 오버플로우
		int result2 = a / a * a; // 나누기 먼저 진행하므로 이상없음

		System.out.printf("%d * %d / %d = %d%n", a, a, a, result1);
		System.out.printf("%d * %d / %d = %d%n", a, a, a, result2);
	}

}
