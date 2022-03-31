package ch7;

class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];

	SutdaDeck() {
		/////////////////////////////////////////////////// 연습문제7-1
		// 카드 배열 초기화
		for (int i = 0; i < CARD_NUM; i++) {
			// 1~10만 출력되도록 -> i%10+1
			cards[i] = new SutdaCard(i % 10 + 1, false);
			// 한벌은 1,3,8이면 isKwang=true
			if (i < 10 && (i == 0 || i == 2 || i == 7)) {
				cards[i] = new SutdaCard(i % 10 + 1, true);
			}
		}
	}

	/////////////////////////////////////////////////// 연습문제7-2
	// shuffle
	void shuffle() {
		for (int i = 0; i < CARD_NUM; i++) {
			int random = (int) (Math.random() * 20);
			// 랜덤 숫자 정해서 카드 섞기
			SutdaCard tmp = cards[i];
			cards[i] = cards[random];
			cards[random] = tmp;
		}
	}

	// pick1
	SutdaCard pick(int index) {
		// 인덱스 유효성검사
		if (index < 0 || index > CARD_NUM) {
			System.out.println("다시 뽑아주세요");
			return null;
		}

		// 카드배열에서 index번째 요소 리턴
		return cards[index];
	}

	// pick2
	SutdaCard pick() {
		// 랜덤번째 카드 리턴
		int random = (int) (Math.random() * 20);
		// return pick(random);도 가능
		return cards[random];
	}
}

class SutdaCard {
	// 한번 값이 지정되면 변경되어서는 안되는 값 - > final로 상수 처리
	final int num;
	final boolean isKwang;

	SutdaCard() {
		this(1, true);
	}

	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}

	public String toString() {
		// 광이면 k출력
		return num + (isKwang ? "K" : "");
	}
}

public class Ex7_1 {
	public static void main(String args[]) {
		SutdaDeck deck = new SutdaDeck();
		// 기본 카드 출력
		for (int i = 0; i < deck.cards.length; i++) {
			System.out.print(deck.cards[i] + ",");
		}
		System.out.println();
		// 맨 윗장
		System.out.println("pick(0) -> " + deck.pick(0));
		// 랜덤
		System.out.println("pick -> " + deck.pick());

		// 셔플하고 출력
		deck.shuffle();
		for (int i = 0; i < deck.cards.length; i++) {
			System.out.print(deck.cards[i] + ",");
		}
		System.out.println();
		// 맨 윗장
		System.out.println("pick(0) -> " + deck.pick(0));

	}

}
