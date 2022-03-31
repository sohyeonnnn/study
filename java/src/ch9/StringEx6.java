package ch9;

public class StringEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int iVal = 100;
		String strVal = String.valueOf(iVal); // int를 String으로 변환

		double dVal = 200.0;
		String strVal2 = dVal + ""; // int를 String으로 변환하는 또 다른 방법 ""을 더해줌

		double sum = Integer.parseInt("+" + strVal) + Double.parseDouble(strVal2);
		double sum2 = Integer.valueOf(strVal) + Double.valueOf(strVal2);

		System.out.println(String.join("", strVal, "+", strVal2, "=") + sum);
		System.out.println(strVal + "+" + strVal2 + "=" + sum2);

		// parseInt나 parseFloat같은 메서드는 문자열에 공백 또는 문자가 포함되어 있는 경우 변환시 예외가 발생
		// -> 양 끝의 공백을 제거해주는 trim을 사용
		// 부호를 의미하는 + / 소수점을 의미하는 . / float형 값을 뜻하는 f와 같은 자료형 접미사는 허용
	}

}
