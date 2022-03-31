package ch3;

public class OperatorEx30 {

	static String toBinaryString(int x) {
		String zero = "000000000000000000000000000000000";
		String tmp = zero + Integer.toBinaryString(x);
		return tmp.substring(tmp.length() - 32);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// x<<n은 x*2^n의 결과와 같다
		// x>>n은 x/2^n의 결과와 같다
		
		int dec = 8;
		System.out.printf("%d>>%d=%4d \t%s%n", dec, 0, dec >> 0, toBinaryString(dec >> 0));
		System.out.printf("%d>>%d=%4d \t%s%n", dec, 1, dec >> 1, toBinaryString(dec >> 1));
		System.out.printf("%d>>%d=%4d \t%s%n", dec, 2, dec >> 2, toBinaryString(dec >> 2));
		System.out.printf("%d<<%d=%4d \t%s%n", dec, 0, dec << 0, toBinaryString(dec << 0));
		System.out.printf("%d<<%d=%4d \t%s%n", dec, 1, dec << 1, toBinaryString(dec << 1));
		System.out.printf("%d<<%d=%4d \t%s%n", dec, 2, dec << 2, toBinaryString(dec << 2));

		System.out.println();

		dec = -8;
		System.out.printf("%d>>%d=%4d \t%s%n", dec, 0, dec >> 0, toBinaryString(dec >> 0));
		System.out.printf("%d>>%d=%4d \t%s%n", dec, 1, dec >> 1, toBinaryString(dec >> 1));
		System.out.printf("%d>>%d=%4d \t%s%n", dec, 2, dec >> 2, toBinaryString(dec >> 2));
		System.out.printf("%d<<%d=%4d \t%s%n", dec, 0, dec << 0, toBinaryString(dec << 0));
		System.out.printf("%d<<%d=%4d \t%s%n", dec, 1, dec << 1, toBinaryString(dec << 1));
		System.out.printf("%d<<%d=%4d \t%s%n", dec, 2, dec << 2, toBinaryString(dec << 2));

		System.out.println();

		dec = 8;
		System.out.printf("%d>>%2d=%4d \t%s%n", dec, 0, dec >> 0, toBinaryString(dec >> 0));
		System.out.printf("%d>>%2d=%4d \t%s%n", dec, 32, dec >> 32, toBinaryString(dec >> 32));

	}

}
