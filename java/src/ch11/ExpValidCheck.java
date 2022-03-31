package ch11;

import java.util.Stack;

public class ExpValidCheck {

	// 입력한 수식의 괄호가 올바르지 체크
	// ( 를 만나면 스택에 넣고 ) 를 만나면 스택에서 ( 를 꺼낸다

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
				System.out.println("괄호가 일치합니다");
			} else {
				System.out.println("괄호가 일치하지 않습니다");
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("괄호가 일치하지 않습니다");
		}
	}

}
