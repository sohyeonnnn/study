package ch4;

import java.util.Scanner;

public class FlowEx28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 0, answer = 0;

		answer = (int) (Math.random() * 100) + 1; // 1~100 ������ ���� ��
		Scanner sc = new Scanner(System.in);
		// do-while���� ������ ������ �ּ��� �ѹ��� ����ȴ�
		do {
			System.out.print("1�� 100������ ������ �Է��ϼ���>");
			input = sc.nextInt();

			if (input > answer) {
				System.out.println("�� ���� ���� �ٽ� �õ��غ�����");
			} else if (input < answer) {
				System.out.println("�� ū ���� �ٽ� �õ��غ�����");
			}
		} while (input != answer);

		System.out.println("�����Դϴ�"); // �����̸� do-while�� ���ͼ� ���
	}
}
