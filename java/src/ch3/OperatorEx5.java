package ch3;

public class OperatorEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 4;

		// 정수 연산
		System.out.printf("%d + %d = %d\n", a, b, a + b);
		System.out.printf("%d - %d = %d\n", a, b, a - b);
		System.out.printf("%d * %d = %d\n", a, b, a * b);
		System.out.printf("%d / %d = %d\n", a, b, a / b); // 소수점 이하는 버려짐, 반올림x
		// 나누는 수로 0을 사용할 수 없음, 실행시 컴파일은 되지만 실행시 오류 발생
		System.out.printf("%d / %f = %f\n", a, (float) b, a / (float) b);
	}

}
