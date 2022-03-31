package ch6;

public class MyMathTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyMath mm = new MyMath(); // 메서드를 호출하기 위해 MyMath클래스의 인스턴스 생성

		// 메서드가 호출되면 지금까지 실행 중이던 메서드는 실행을 멈추고
		// 호출된 메서드의 문장들이 실행
		// 작업이 모두 끝나면 다시 돌아와 이후의 문장들을 실행
		long result1 = mm.add(5l, 3l); // mm으로 접근
		long result2 = mm.subtract(5l, 3l);
		long result3 = mm.multiply(5l, 3l);
		double result4 = mm.divide(5l, 3l); // 매개변수가 double이 아닌 long이지만 자동으로 형변환된다

		// 결과 출력
		System.out.println("add(5l, 3l)=" + result1);
		System.out.println("substract(5l, 3l)=" + result2);
		System.out.println("multiply(5l, 3l)=" + result3);
		System.out.println("divide(5l, 3l)=" + result4);

	}

}

class MyMath {
	// 두 개의 값을 매개변수로 받아서 사칙연산을 수행하는 4개의 메서드를 가진 클래스 정의
	long add(long a, long b) {
		long result = a + b; // return에 한번에 쓸수있음
		return result;
	}

	long subtract(long a, long b) {
		return a - b;
	}

	long multiply(long a, long b) {
		return a * b;
	}

	double divide(double a, double b) {
		// 유효성 검사
		if (b == 0) {
			System.out.println("0으로 나눌 수 없습니다");
			return 0;
		}

		return a / b;
	}
}
