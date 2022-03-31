package ch3;

public class OperatorEx9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long a = 1000000 * 1000000;
		long b = 1000000 * 1000000l;

		System.out.println("a=" + a); // 결과값이 int형 최대값을 넘어서 오버플로우 발셍
		System.out.println("b=" + b);
	}

}
