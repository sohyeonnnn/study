package ch4;

import java.util.Scanner;

public class FlowEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("���� ���� �Է��ϼ���>");

		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();

		// switch���� ���ǽ��� ������� �ݵ�� ����
		// case�� ����,���, �ߺ� �Ұ���

		switch (month) {
		case 3:
		case 4:
		case 5:
			System.out.println("������ ������ ���Դϴ�");
			break;

		case 6:
		case 7:
		case 8:
			System.out.println("������ ������ �����Դϴ�");
			break;

		case 9:
		case 10:
		case 11:
			System.out.println("������ ������ �����Դϴ�");
			break;

		default:
		case 12:
		case 1:
		case 2:
			System.out.println("������ ������ �ܿ��Դϴ�");
		}
	}
}
