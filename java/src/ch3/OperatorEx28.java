package ch3;

public class OperatorEx28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 0xAB, y = 0xF;

		// |(or) : 피연산자 중 한 쪽의 값이 1이면 1 / 그 외엔 0
		// &(and) : 피연산자 양쪽이 모두 1이면 1 / 그 외엔 0
		// ^(xor) : 피연산자 값이 서로 다르면 1 / 같을 땐 0
		System.out.printf("x=%#X \t\t\t%s%n", x, toBinaryString(x));
		System.out.printf("y=%#X \t\t\t%s%n", y, toBinaryString(y));
		System.out.printf("%#X | %#X = %#X \t%s%n", x, y, x | y, toBinaryString(x | y));
		System.out.printf("%#X & %#X = %#X \t%s%n", x, y, x & y, toBinaryString(x & y));
		System.out.printf("%#X ^ %#X = %#X \t%s%n", x, y, x ^ y, toBinaryString(x ^ y));
		System.out.printf("%#X ^ %#X ^ %#X = %#X %s%n", x, y, y, x ^ y ^ y, toBinaryString(x ^ y ^ y));

	}

	// 10진 정수를 2진수로 변환하는 메서드
	static String toBinaryString(int x) {
		String zero = "000000000000000000000000000000000";
		String tmp = zero + Integer.toBinaryString(x);
		return tmp.substring(tmp.length() - 32);
	}

}
