package ch9;

//String클래스는 인스턴스를 생성할 때 지정된 문자열을 변경할 수 없지만
//StringBuffer클래스는 변경이 가능
public class StringBufferEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer sb = new StringBuffer("abc");
		StringBuffer sb2 = new StringBuffer("abc");

		System.out.println("sb==sb2 ? " + (sb == sb2));
		System.out.println("sb.equals(sb2) ? " + sb.equals(sb2));

		// StringBuffer의 내용을 String으로 변환
		String s = sb.toString();
		String s2 = sb2.toString();

		// String으로 변환후 비교하면 같음
		System.out.println("s.equals(s2) ? " + s.equals(s2));

	}

}
