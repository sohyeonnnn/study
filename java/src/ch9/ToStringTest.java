package ch9;

public class ToStringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = new String("KOREA");
		java.util.Date today = new java.util.Date();

		System.out.println(str);
		// String클래스의 toString은 String 인스턴스가 갖고있는 문자열을 반환하도록 오버라이딩되어있다
		System.out.println(str.toString());
		System.out.println(today);
		// Date인스턴스가 갖고있는 날짜와 시간을 문자열로 변환하여 반환하도록 오버라이딩
		System.out.println(today.toString());
	}

}
