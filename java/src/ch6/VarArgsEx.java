package ch6;

//가변인자
//매개변수의 개수를 동적으로 지정
//타입...변수명 형식으로 선언, 매개변수 중에서 제일 마지막에 선언
public class VarArgsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strArr = { "100", "200", "300" };

		System.out.println(concatenate("", "100", "200", "300"));
		System.out.println(concatenate("=", strArr));
		System.out.println(concatenate(",", new String[] { "1", "2", "3" }));
		System.out.println("[" + concatenate(",", new String[0]) + "]");
		System.out.println("[" + concatenate(",") + "]");

	}

	// 매개변수로 입력된 문자열에 구분자를 사이에 포함시켜 결합해서 반환
	// 가변인자로 매개변수를 선언했기 때문에 문자열을 개수의 제약없이 매개변수로 지정

	static String concatenate(String delim, String... args) {
		String result = "";

		for (String str : args) {
			result += str + delim;
		}
		return result;
	}

	// 가변인자를 사용한 메서드는 오버로딩하지 않는 것이 좋다

	/*
	 * static String concatenate(String... args) { return concatenate("", args); }
	 */

}
