package ch9;

import java.util.StringTokenizer;

public class StringTokenizerEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String source = "100,200,300,400";
		StringTokenizer st = new StringTokenizer(source, ",");

		// ','를 구분자로 하는 StringTokenizer를 생성해서 문자열을 나누어 출력
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
