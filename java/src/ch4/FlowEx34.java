package ch4;

import java.util.Scanner;

public class FlowEx34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int menu = 0, num = 0;
		Scanner sc = new Scanner(System.in);

		outer: while (true) {
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			System.out.println("���ϴ� �޴�(1~3)�� �����ϼ��� (����:0) >");

			String tmp = sc.nextLine();
			menu = Integer.parseInt(tmp);

			if (menu == 0) {
				System.out.println("���α׷��� �����մϴ�");
				break;
			} else if (!(1 <= menu && menu <= 3)) { // �Է��� ���ڰ� 1,2,3�߿� ������
				System.out.println("�޴��� �߸� �����ϼ̽��ϴ�(����� 0)");
				continue; // �ٽ� �ݺ��� ó������ ���ư�
			}

			for (;;) { // ���������� �����Ҷ����� ���ѹݺ�
				System.out.println("����� ���� �Է��ϼ���(��� ����:0, ��ü ����:99)> ");
				tmp = sc.nextLine();
				num = Integer.parseInt(tmp);

				if (num == 0) {
					break;
				}
				if (num == 99) {
					break outer; // outer while�� ����
				}

				switch (menu) {
				case 1:
					System.out.println("result=" + num * num);
					break;
				case 2:
					System.out.println("result=" + Math.sqrt(num));
				case 3:
					System.out.println("result=" + Math.log(num));
					break;
				}
			}
		}
	}

}
