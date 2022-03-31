package ch7;

public class DeckTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Deck d = new Deck(); // 카드 한벌
		Card c = d.pick(0); // 가장 위에 있는 카드 한장
		System.out.println(c);

		d.shuffle(); // 셔플
		c = d.pick(0); // 셔플 후 가장 위에 있는 카드 한장
		System.out.println(c);
	}

}

class Deck {
	final int CARD_NUM = 52; // 카드 52장
	Card cardArr[] = new Card[CARD_NUM]; // deck has a card-포함관계

	public Deck() { // 카드 초기화
		int i = 0;
		for (int k = Card.KIND_MAX; k > 0; k--) { // 카드에 무늬, 숫자 설정 1~12
			for (int n = 0; n < Card.NUM_MAX; n++) {
				cardArr[i++] = new Card(k, n + 1);
			}
		}
	}

	Card pick(int index) { // index 번째 카드 고르기
		return cardArr[index];
	}

	Card pick() { // 랜덤으로 한장 고르기
		int index = (int) (Math.random() * CARD_NUM);
		return pick(index);
	}

	void shuffle() { // 카드 셔플
		for (int i = 0; i < cardArr.length; i++) {
			int r = (int) (Math.random() * CARD_NUM); // 랜덤번째 카드와 섞는다

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
		this(SPADE, 1); // 기본으로 1,spade 설정
	}

	Card(int kind, int number) { // 무늬, 숫자를 설정하는 생성자
		this.kind = kind;
		this.number = number;
	}

	public String toString() { // 무늬,숫자에 따라 배열에서 찾아서 출력
		String[] kinds = { "", "CLOVER", "HEART", "DIAMOND", "SPADE" };
		String numbers = "0123456789XJQK";
		return "kind: " + kinds[this.kind] + ", number: " + numbers.charAt(this.number);
	}
}
