package ch3;

public class OperatorEx11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a = 'a';
		char d = 'd';
		char zero = '0';
		char two = '2';

		// ���ڴ� ������ �ش� ������ �����ڵ�� �ٲ�� ����ǹǷ� ���� ����
		System.out.printf("'%c'-'%c'=%d%n", d, a, d - a); // 3
		System.out.printf("'%c'-'%c'=%d%n", two, zero, two - zero); // 2
		System.out.printf("'%c'=%d%n", a, (int) a); // �����ڵ� ��
		System.out.printf("'%c'=%d%n", d, (int) d);
		System.out.printf("'%c'=%d%n", zero, (int) zero); // ���� '0'�� �����ڵ�
		System.out.printf("'%c'=%d%n", two, (int) two); // ���� '2'�� �����ڵ�
	}

}
