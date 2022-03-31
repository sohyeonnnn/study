package ch3;

public class OperatorEx26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		int b = 0;
		// 참일 확률이 높은 피연산자를 연산자의 왼쪾에 놓아야 더 빠른 연산결과를 얻을수있다
		System.out.printf("a=%d, b=%d%n", a, b);
		System.out.printf("a!=0 || ++b!=0 : %b%n", a != 0 || ++b != 0); // ++b 실행x
		System.out.printf("a=%d, b=%d%n", a, b);
		System.out.printf("a!=0 && ++b!=0 : %b%n", a == 0 && ++b != 0); // ++b 실행x
		System.out.printf("a=%d, b=%d%n", a, b);
	}

}
