package ch9;

import java.util.StringTokenizer;

public class StringTokenizerEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String expression = "x=100*(200+300)/2";
		// ������ '+-*/=()'�� �����ڷ� ����ؼ� ������
		StringTokenizer st = new StringTokenizer(expression, "+-*/=()", true);
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
