package ch9;

class Card2 {
	String kind;
	int number;

	Card2() {
		this("SPADE", 1);
	}

	Card2(String kind, int number) {
		this.kind = kind;
		this.number = number;
	}

	public String toString() { // kind와 number을 출력하도록 오버라이딩
		return "kind:" + kind + ", number:" + number;
	}
}

public class CardToString2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card2 c1 = new Card2(); // 기본생성자에 의해 spade,1 으로 초기화
		Card2 c2 = new Card2("HEART", 10); // heart,10 으로 초기화
		System.out.println(c1.toString()); // 출력
		System.out.println(c2.toString());

	}

}
