package ch9;

import java.util.StringTokenizer;

public class StringTokenizerEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "삼십만삼천백십오";
		System.out.println(input);
		System.out.println(hangulToNum(input));
	}

	public static long hangulToNum(String input) {
		long result = 0; // 최종 변환결과를 저장하기 위한 변수
		long tmpResult = 0; // 십백천 단위의 값을 저장하기 위한 임시변수
		long num = 0;

		final String NUMBER = "영일이삼사오육칠팔구";
		final String UNIT = "십백천만억조";
		final long[] UNIT_NUM = { 10, 100, 1000, 10000, (long) 1e8, (long) 1e12 };

		StringTokenizer st = new StringTokenizer(input, UNIT, true); // '삼십만삼천백십오'를 '십백천만억조'로 구분
		// true -> 구분자도 토큰으로 간주함
		// 삼 십 만 삼 천 백 십 오

		while (st.hasMoreTokens()) {
			String token = st.nextToken(); //
			int check = NUMBER.indexOf(token); // 숫자인지 확인, 단위면 -1

			// token 삼 십 만 삼 천 백 십 오
			// System.out.println(check);

			// 토큰이 숫자면 num에 저장, 단위면 num에 단위를 곱해서 tmpResult에 저장
			if (check == -1) { // 단위일때
				if ("만억조".indexOf(token) == -1) { // 토큰이 만,억,조 단위일때
					tmpResult += (num != 0 ? num : 1) * UNIT_NUM[UNIT.indexOf(token)];
					//num이 0이면 1로 바꿔줌
					
				} else {
					// 만삼천과 같이 숫자 없이 바로 단위로 시작하는 경우에는 num이 0이기 때문에 단위를 곱해도 그 결과가 0
					// 삼항연산자를 이용해서 num의 값을 1로 바꾼후 단위값 곱한다
					tmpResult += num;
					result += (tmpResult != 0 ? tmpResult : 1) * UNIT_NUM[UNIT.indexOf(token)];
					tmpResult = 0;
				}
				num = 0;
			} else {
				num = check; // 숫자일때 num에 저장
			}
		}
		return result + tmpResult + num;
	}

}
