package ch3;

public class OperatorEx26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		int b = 0;
		// ���� Ȯ���� ���� �ǿ����ڸ� �������� �ަU�� ���ƾ� �� ���� �������� �������ִ�
		System.out.printf("a=%d, b=%d%n", a, b);
		System.out.printf("a!=0 || ++b!=0 : %b%n", a != 0 || ++b != 0); // ++b ����x
		System.out.printf("a=%d, b=%d%n", a, b);
		System.out.printf("a!=0 && ++b!=0 : %b%n", a == 0 && ++b != 0); // ++b ����x
		System.out.printf("a=%d, b=%d%n", a, b);
	}

}
