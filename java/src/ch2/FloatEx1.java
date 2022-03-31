package ch2;

public class FloatEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float f = 9.12345678901234567890f;
		float f2 = 1.2345678901234567890f;
		double d = 9.12345678901234567890d;

		// 연산속도의 향상에나 메모리를 절약하려면 float선택
		// 더 큰 값의 범위나, 더 높은 정밀도가 필요하다면 double
		System.out.printf("		123456789012345678901234%n");
		System.out.printf("f: %f%n", f); //기본적으로 소수점 이하 6자리까지 출력, 7번째 자리에서 반올림
		System.out.printf("f: %24.20f%n", f);  //전체 24자리 중에서 20자리는 소수점 이하의 수 출력
		System.out.printf("f2: %24.20f%n", f2);
		System.out.printf("d: %24.20f%n", d);
	}

}
