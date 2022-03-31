package ch9;

final class Card4 {
	String kind;
	int num;

	Card4() {
		this("SPADE", 1);
	}

	Card4(String kind, int num) {
		this.kind = kind;
		this.num = num;
	}

	public String toString() {
		return kind + ":" + num;
	}
}

public class ClassEx1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Card4 c = new Card4("HEART", 3);
		Card4 c2 = Card4.class.newInstance(); // class 객체를 통해서 객체 생성

		Class cObj = c.getClass();

		System.out.println(c); // heart,3
		System.out.println(c2); // spade,1
		System.out.println(cObj.getName()); // 클래스이름
		System.out.println(cObj.toGenericString());
		System.out.println(cObj.toString());
	}

}
