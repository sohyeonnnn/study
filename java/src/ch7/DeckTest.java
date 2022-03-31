package ch7;

public class DeckTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Deck d = new Deck(); // ī�� �ѹ�
		Card c = d.pick(0); // ���� ���� �ִ� ī�� ����
		System.out.println(c);

		d.shuffle(); // ����
		c = d.pick(0); // ���� �� ���� ���� �ִ� ī�� ����
		System.out.println(c);
	}

}

class Deck {
	final int CARD_NUM = 52; // ī�� 52��
	Card cardArr[] = new Card[CARD_NUM]; // deck has a card-���԰���

	public Deck() { // ī�� �ʱ�ȭ
		int i = 0;
		for (int k = Card.KIND_MAX; k > 0; k--) { // ī�忡 ����, ���� ���� 1~12
			for (int n = 0; n < Card.NUM_MAX; n++) {
				cardArr[i++] = new Card(k, n + 1);
			}
		}
	}

	Card pick(int index) { // index ��° ī�� ����
		return cardArr[index];
	}

	Card pick() { // �������� ���� ����
		int index = (int) (Math.random() * CARD_NUM);
		return pick(index);
	}

	void shuffle() { // ī�� ����
		for (int i = 0; i < cardArr.length; i++) {
			int r = (int) (Math.random() * CARD_NUM); // ������° ī��� ���´�

			Card temp = cardArr[i];
			cardArr[i] = cardArr[r];
			cardArr[r] = temp;
		}
	}

}

class Card {
	static final int KIND_MAX = 4;
	static final int NUM_MAX = 13;

	static final int SPADE = 4;
	static final int DIAMOND = 3;
	static final int HEART = 2;
	static final int CLOVER = 1;

	int kind;
	int number;

	Card() {
		this(SPADE, 1); // �⺻���� 1,spade ����
	}

	Card(int kind, int number) { // ����, ���ڸ� �����ϴ� ������
		this.kind = kind;
		this.number = number;
	}

	public String toString() { // ����,���ڿ� ���� �迭���� ã�Ƽ� ���
		String[] kinds = { "", "CLOVER", "HEART", "DIAMOND", "SPADE" };
		String numbers = "0123456789XJQK";
		return "kind: " + kinds[this.kind] + ", number: " + numbers.charAt(this.number);
	}
}
