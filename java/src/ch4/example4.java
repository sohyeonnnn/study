package ch4;

import java.util.Scanner;

public class example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ��������4-1
		// 1) if(x>10 && x<20)
		// 2) if(ch!='' || ch!='\t')
		// 3) if(ch=='x' || ch=='X')
		// 4) if(ch>='0' && ch<='9')
		// 5) if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z'))
		// 6) if(year%400==0||year%4==0||year%100!=0)
		// 7) if(!powerOn)
		// 8) if(str.equals("yes"))

		// ��������4-2 : 1~20 ������ 2 �Ǵ� 3�� ����� �ƴ� ���� ����
		System.out.print("[��������4-2] ");
		int sum2 = 0;
		for (int i = 1; i <= 20; i++) {
			if (!(i % 2 == 0 || i % 3 == 0)) { // 2,3�� ����� �ƴ� ��
				sum2 += i;
			}
		}
		System.out.println(sum2);

		// ��������4-3 : 1+(1+2)+(1+2+3)+(1+2+3+4)+..+(1+2+3+...+10)�� ���
		int sum3 = 0;
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= i; j++)
				sum3 += j;
		}
		System.out.print("[��������4-3] ");
		System.out.println(sum3);

		// ��������4-4 : 1+(-2)+3+(-4)+... , �� ���� ������ ��� ���س����� �� ����� ���ؾ� ������ 100�̻��� �Ǵ���
		// Ȧ����° ���� +, ¦����° ���� -
		int sum4 = 0;
		int num4 = 0;
		int s = 1;

		for (int i = 1; true; i++, s *= -1) { // s�� 1,-1,1,-1,1,-1,1,-1... �ݺ�
			num4 = i * s;
			sum4 += num4;
			sum4 += num4;
			if (sum4 > 100) {
				System.out.print("[��������4-4] ");
				System.out.println(i);
				break;
			}
		}

		// ��������4-5 :
		System.out.println("[��������4-5] ");
		/*
		 * for (int i = 0; i <= 10; i++) { for (int j = 0; j <= i; j++)
		 * System.out.print("*"); System.out.println(); }
		 */

		// ----> while������ �ٲٱ�
		int i5 = 0;
		while (i5 <= 10) {// 0,1,2,3,...,10
			int j5 = 0;
			while (j5 <= i5) {
				System.out.print("*");
				j5++;
			}
			System.out.println();
			i5++;
		}

		// ��������4-6 : �� ���� �ֻ����� ������ ��, ���� ���� 6�� �Ǵ� ��� ����� ���� ���
		System.out.print("[��������4-6] ");
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= 6; j++) {
				if (i + j == 6) {
					System.out.printf("(%d , %d)", i, j);
				}
			}
		}
		System.out.println();

		// ��������4-7 : 1���� 6������ ������ ������ ������ ����
		int value = (int) (Math.random() * 6) + 1;
		System.out.print("[��������4-7] ");
		System.out.println(value);

		// ��������4-8 : ������ 2x+4y=10�� ��� �ظ� ���Ͻÿ� x,y�� 0~10���� ��
		System.out.print("[��������4-8] ");
		for (int x = 0; x <= 10; x++) {
			for (int y = 0; y <= 10; y++) {
				if (2 * x + 4 * y == 10) {
					System.out.printf("(x=%d, y=%d)", x, y);
				}
			}
		}
		System.out.println();

		// ��������4-9 : ���ڷ� �̷���� ���ڿ��� ���� �� �� �ڸ��� ���� ���� ����� ���
		String str = "12345";
		int sum9 = 0;
		for (int i = 0; i < str.length(); i++) {
			sum9 += (str.charAt(i) - '0'); // ����->���� : '0'�� ����
		}
		System.out.print("[��������4-9] ");
		System.out.println("sum=" + sum9);

		// ��������4-10 : �� �ڸ��� ���� ���� ����� ���
		int num10 = 12345;
		int sum10 = 0;

		for (;;) {
			sum10 += num10 % 10; // ���� �ڸ� ��
			num10 /= 10;
			if (num10 == 0) {
				break;
			}
		}
		System.out.print("[��������4-10] ");
		System.out.println("sum=" + sum10);

		// ��������4-11 : �Ǻ���ġ������ 10��° �� ���
		// ������ ù �� ���ڸ� 1,1
		int num1 = 1;
		int num2 = 1;
		int num3 = 0;
		System.out.print("[��������4-11] ");
		System.out.print(num1 + "," + num2);
		for (int i = 0; i < 8; i++) {
			num3 = num1 + num2;
			System.out.print("," + num3);
			num1 = num2;
			num2 = num3;
		}
		System.out.println();

		// ��������4-12 : ������ ���
		System.out.println("[��������4-12] ");
		for (int i = 1; i < 9; i += 3) {
			for (int j = 1; j <= 3; j++) {
				System.out.printf("%d * %d = %d \t %d * %d = %d \t %d * %d = %d \t\n", i + 1, j, (i + 1) * j, i + 2, j,
						(i + 2) * j, i + 3, j, (i + 3) * j);
			}
			System.out.println();
		}

		// ��������4-13 : �־��� ���ڿ��� �������� �Ǻ�
		String value13 = "12o34";
		char ch = ' ';
		boolean isNumber = true;

		for (int i = 0; i < value13.length(); i++) {
			if (!(value13.charAt(i) >= '0' && value13.charAt(i) <= '9')) {
				isNumber = false;
			}
		}
		System.out.print("[��������4-13] ");
		if (isNumber) {
			System.out.println(value13 + "�� �����Դϴ�");
		} else {
			System.out.println(value13 + "�� ���ڰ� �ƴմϴ�");
		}

		// ��������4-14 : ���ڸ��߱� ����
		int answer = (int) (Math.random() * 100) + 1;
		int input = 0;
		int count = 0;

		Scanner sc = new Scanner(System.in);
		System.out.print("[��������4-14] ");
		/*do {
			count++;
			System.out.print("1�� 100������ ���� �Է��ϼ���:");
			input = sc.nextInt();

			if (input == answer) {
				System.out.println("������ϴ�");
				System.out.printf("�õ�Ƚ���� %d�� �Դϴ�.", count);
				break;
			} else if (answer > input) {
				System.out.println("�� ū ���� �Է��ϼ���");
			} else {
				System.out.println("�� ���� ���� �Է��ϼ���");
			}

		} while (true);*/

		// ��������4-15 : ȸ����
		int number = 12321;
		int tmp = number;

		int result = 0; // ���� number�� �Ųٷ� ��ȯ�ؼ� ���� ����

		while (tmp != 0) {
			result = result * 10 + tmp % 10;
			tmp = tmp / 10;
		}
		System.out.print("[��������4-15] ");
		if (number == result) {
			System.out.println(number + "�� ȸ���� �Դϴ�");
		} else {
			System.out.println(number + "�� ȸ������ �ƴմϴ�");
		}
	}

}
