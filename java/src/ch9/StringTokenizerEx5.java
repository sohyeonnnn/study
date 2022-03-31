package ch9;

import java.util.StringTokenizer;

public class StringTokenizerEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data = "100,,,200,300";

		String[] result = data.split(","); // 빈 문자열도 토큰으로 인식
		StringTokenizer st = new StringTokenizer(data, ","); // 빈 문자열은 토큰으로 인식x

		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + "|");
		}
		System.out.println("개수:" + result.length);

		int i = 0;
		for (; st.hasMoreTokens(); i++) {
			System.out.print(st.nextToken() + "|");
		}
		System.out.println("개수:" + i);
	}

}
