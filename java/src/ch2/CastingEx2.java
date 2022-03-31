package ch2;

public class CastingEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;
		byte b = (byte) i;
		System.out.printf("[int -> byte] i=%d -> b=%d%n", i, b);

		i = 300;
		b = (byte) i;
		System.out.printf("[int -> byte] i=%d -> b=%d%n", i, b);

		b = 10;
		i = (int) b;
		System.out.printf("[byte -> int] b=%d -> i=%d%n", b, i);

		b = -2;
		i = (int) b;
		System.out.printf("[byte -> int] b=%d -> i=%d%n", b, i);

		System.out.println("i=" + Integer.toBinaryString(i)); // 2진수로 변환

		//정수형간의 형변환
		//큰 타입(int) - > 작은 타입(byte) 크기의 차이만큼 값손실
		
	}

}
