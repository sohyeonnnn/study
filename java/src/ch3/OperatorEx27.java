package ch3;

public class OperatorEx27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean b = true;
		char ch = 'C';
		// 단항연산자의 결합방향 : <-
		System.out.printf("b=%b%n", b);
		System.out.printf("!b=%b%n", !b);
		System.out.printf("!!b=%b%n", !!b);
		System.out.printf("!!!b=%b%n", !!!b);
		System.out.println();

		System.out.printf("ch=%c%n", ch);
		System.out.printf("('a'>ch || ch>'z') : %b%n", ('a' > ch || ch > 'z'));
		System.out.printf("!('a'<=ch && ch<='z') : %b%n", !('a' <= ch && ch <= 'z'));
		System.out.printf("'a'<=ch&&ch<='z' : %b%n", 'a' <= ch && ch <= 'z');

	}

}
