package ch4;

import java.util.Scanner;

public class FlowEx11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("����� �ֹι�ȣ�� �Է��ϼ���.(011231-1111222)>");

		Scanner sc = new Scanner(System.in);
		String regNo = sc.nextLine();
		char gender = regNo.charAt(7); // 8��° ����

		switch (gender) {
		case '1':
		case '3':
			// switch ��ø ����
			switch (gender) {
			case '1':
				System.out.println("����� 2000�� ������ ����� �����Դϴ�");
				break;
			case '3':
				System.out.println("����� 2000�� ���Ŀ� ����� �����Դϴ�");
			}
			break;

		case '2':
		case '4':
			switch (gender) {
			case '2':
				System.out.println("����� 2000�� ������ ����� �����Դϴ�");
				break;
			case '4':
				System.out.println("����� 2000�� ���Ŀ� ����� �����Դϴ�");
				break;
			}
			break;
		default:
			System.out.println("��ȿ���� ���� �ֹε�Ϲ�ȣ�Դϴ�");
		}
	}

}
