package ch9;

import java.util.regex.*;

public class RegularEx1 {

	// 정규식 - 텍스트 데이터 중에서 원하는 조건과 일치하는 문자열을 찾아내기 위해 사용

	// data라는 문자열배열에 담긴 문자열 중에서 지정한 정규식과 일치하는 문자열을 출력하는 예제
	// Pattern은 정규식을 정의하는데 사용되고, Mathcher는 정규식을 데이터와 비교하는 역할

	// 1.정규식을 매개변수로 pattern클래스의 compile을 호출하여 pattern인스턴스 얻음
	// 2.정규식으로 비교할 대상을 매개변수로 pattern클래스의 matcher를 호출하여 matcher인스턴스 얻음
	// 3.matcher인스턴스에 matches를 호출해서 정규식에 부합하는지 확인

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] data = { "bat", "baby", "bonus", "cA", "ca", "co", "c.", "c0", "car", "combat", "count", "date",
				"disc" };
		Pattern p = Pattern.compile("c[a-z]*"); // c로 시작하는 소문자영단어

		for (int i = 0; i < data.length; i++) {
			Matcher m = p.matcher(data[i]);
			if (m.matches()) {
				System.out.print(data[i] + ",");
			}
		}

	}

}
