package ch3;

public class OperatorEx23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "abc";
		String str2 = new String("abc");

		System.out.printf("\"abc\"==\"abc\"?%b%n", "abc" == "abc");
		System.out.printf("str1==\"abc\"?%b%n", str1 == "abc");
		System.out.printf("str2==\"abc\"?%b%n", str2 == "abc");
		System.out.printf("str1.equals(\"abc\")?%b%n", str1.equals("abc"));
		System.out.printf("str2.equals(\"abc\")?%b%n", str2.equals("abc"));
		System.out.printf("str2.equals(\"ABC\")?%b%n", str2.equals("ABC"));
		System.out.printf("str2.equalsIgnoreCase(\"ABC\")?%b%n", str2.equalsIgnoreCase("ABC")); // 대소문자 구별하지 않고 비교

		// str를 ==로 비교하면 내용은 같지만 서로 다른 객체이기 때문에 false
		// equals()는 객체가 달라도 내용이 같으면 true 반환
		// 대소문자 구별없이 비교 : equalsIgnoreCase()
	}

}
