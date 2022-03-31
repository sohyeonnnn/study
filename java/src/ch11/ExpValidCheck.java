package ch11;

import java.util.Stack;

public class ExpValidCheck {

	// �Է��� ������ ��ȣ�� �ùٸ��� üũ
	// ( �� ������ ���ÿ� �ְ� ) �� ������ ���ÿ��� ( �� ������

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length != 1) {
			System.out.println("usage : java ExpValidCheck \"EXPRESSION\"");
			System.out.println("example : java ExpValidCheck \"((2+3)*1)+3\"");
			System.exit(0);
		}

		Stack st = new Stack();
		String expression = args[0];

		System.out.println("expression: " + expression);

		try {
			for (int i = 0; i < expression.length(); i++) {
				char ch = expression.charAt(i);

				if (ch == '(') {
					st.push(ch + "");
				} else if (ch == ')') {
					st.pop();
				}
			}
			if (st.isEmpty()) {
				System.out.println("��ȣ�� ��ġ�մϴ�");
			} else {
				System.out.println("��ȣ�� ��ġ���� �ʽ��ϴ�");
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("��ȣ�� ��ġ���� �ʽ��ϴ�");
		}
	}

}
