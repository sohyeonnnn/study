package ch3;

public class OperatorEx11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a = 'a';
		char d = 'd';
		char zero = '0';
		char two = '2';

		// 문자는 실제로 해당 문자의 유니코드로 바뀌어 저장되므로 연산 가능
		System.out.printf("'%c'-'%c'=%d%n", d, a, d - a); // 3
		System.out.printf("'%c'-'%c'=%d%n", two, zero, two - zero); // 2
		System.out.printf("'%c'=%d%n", a, (int) a); // 유니코드 값
		System.out.printf("'%c'=%d%n", d, (int) d);
		System.out.printf("'%c'=%d%n", zero, (int) zero); // 문자 '0'의 유니코드
		System.out.printf("'%c'=%d%n", two, (int) two); // 문자 '2'의 유니코드
	}

}
