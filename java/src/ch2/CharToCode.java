package ch2;

public class CharToCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char ch = 'A';
		int code = (int) ch; // 'A'의 유니코드

		System.out.printf("%c=%d(%#X)%n", ch, code, code);

		char hch = '가';
		System.out.printf("%c=%d(%#X)%n", hch, (int) hch, (int) hch);
	}
}
