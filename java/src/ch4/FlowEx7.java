package ch4;

import java.util.Scanner;

public class FlowEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("����(1),����(2),��(3) �� �ϳ��� �Է��ϼ���> ");
		Scanner sc = new Scanner(System.in);
		int user = sc.nextInt();
		int com = (int) (Math.random() * 3) + 1; // 0���� �����̹Ƿ� +1, double���� ��ȯ�ϹǷ� ����ȯ

		System.out.println("����� " + user + "�Դϴ�");
		System.out.println("���� " + com + "�Դϴ�");

		// �̱�� ���
		// ����: ����1 ����2 ��3
		// ��: ��3 ����1 ����2
		// user-com : -2,1

		// ���� ���
		// ����: ����1 ����2 ��3
		// ��: ����2 ��3 ����1
		// user-com : -1,2

		switch (user - com) {
		case 2:
		case -1:
			System.out.println("����� �����ϴ�");
			break;
		case 1:
		case -2:
			System.out.println("����� �̰���ϴ�");
			break;
		case 0:
			System.out.println("�����ϴ�");
			// break; //������ �����̶� break ����� �ʿ� ����
		}
	}

}
