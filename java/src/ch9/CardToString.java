package ch9;

//toString : �ν��Ͻ��� ���� ������ ���ڿ��� ������ �������� ���� - �������̵��ؼ� ���

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

		// toString �� �������̵� ���� �ʾұ� ������, ObjectŬ������ toString�� ȣ��
		// Ŭ���� �̸��� �ؽ��ڵ� ���
		System.out.println(c1.toString());
		System.out.println(c2.toString());

	}

}
