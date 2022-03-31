package ch3;

public class OperatorEx29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte p = 10;
		byte n = -10;

		System.out.printf("p=%d \t%s%n", p, toBinaryString(p));
		System.out.printf("~p=%d \t%s%n", ~p, toBinaryString(~p));
		// 어떤 양의 정수에 대한 음의 정수를 얻는 방법
		System.out.printf("~p+1=%d \t%s%n", ~p + 1, toBinaryString(~p + 1));
		System.out.printf("~~p=%d \t%s%n", ~~p, toBinaryString(~~p));
		System.out.println();
		// 어떤 음의 정수에 대한 양의 정수를 얻는 방법
		System.out.printf("n =%d%n", n);
		System.out.printf("~(n-1)=%d%n", ~(n - 1));
	}

	static String toBinaryString(int x) {
		String zero = "000000000000000000000000000000000";
		String tmp = zero + Integer.toBinaryString(x);
		return tmp.substring(tmp.length() - 32);
	}

}
