package ch9;

//toString : 인스턴스에 대한 정보를 문자열로 제공할 목적으로 정의 - 오버라이딩해서 사용

class Card {
	String kind;
	int number;

	Card() {
		this("SPADE", 1);
	}

	Card(String kind, int number) {
		this.kind = kind;
		this.number = number;
	}
}

class CardToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card c1 = new Card();
		Card c2 = new Card();

		// toString 을 오버라이딩 하지 않았기 때문에, Object클래스의 toString이 호출
		// 클래스 이름과 해시코드 출력
		System.out.println(c1.toString());
		System.out.println(c2.toString());

	}

}
