package ch9;

public class HashCodeEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = new String("abc");
		String str2 = new String("abc");

		System.out.println(str1.equals(str2)); // 값을 비교했을때 같음
		System.out.println(str1.hashCode()); // 해시코드값
		System.out.println(str2.hashCode());
		// System.identityHashCode() : 객체의 주소값으로 해시코드 생성
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
	}

}
