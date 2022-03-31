package ch9;

import java.util.StringTokenizer;

public class StringTokenizerEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String source = "1,김천재,100,100,100|2,박수재,95,80,90|3,이자바,80,90,90";
		StringTokenizer st = new StringTokenizer(source, "|"); // |을 기준으로 자른다

		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			StringTokenizer st2 = new StringTokenizer(token, ","); // ','을 기준으로 자른다
			while (st2.hasMoreTokens()) {
				System.out.println(st2.nextToken());
			}
			System.out.println("--------");
		}
	}

}
