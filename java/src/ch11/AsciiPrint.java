package ch11;

public class AsciiPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char ch = ' ';
		for (int i = 0; i < 95; i++) {
			System.out.print(ch++);
			// 공백 이후의 문자들을 출력
		}

	}

}
