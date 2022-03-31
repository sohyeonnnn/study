package ch5;

public class ArrayEx17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length != 3) { // �Է°��� 3������ Ȯ�� , ����2�� ������1��
			System.out.println("usage: java ArrayEx17 NUM1 OP NUM2");
			System.exit(0);
		}

		int num1 = Integer.parseInt(args[0]); // ���ڿ�->���� ��ȯ
		char op = args[1].charAt(0); // ���ڿ��� ���ڷ� ��ȯ
		int num2 = Integer.parseInt(args[2]); // ���ڿ�->����
		int result = 0;

		switch (op) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case 'x':
			result = num1 * num2;
			break;
		case '/':
			result = num1 / num2;
			break;
		default:
			System.out.println("�������� �ʴ� �����Դϴ�");
		}
		System.out.println("���: " + result);
	}

}
