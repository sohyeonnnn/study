package ch7;

class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];

	SutdaDeck() {
		/////////////////////////////////////////////////// ��������7-1
		// ī�� �迭 �ʱ�ȭ
		for (int i = 0; i < CARD_NUM; i++) {
			// 1~10�� ��µǵ��� -> i%10+1
			cards[i] = new SutdaCard(i % 10 + 1, false);
			// �ѹ��� 1,3,8�̸� isKwang=true
			if (i < 10 && (i == 0 || i == 2 || i == 7)) {
				cards[i] = new SutdaCard(i % 10 + 1, true);
			}
		}
	}

	/////////////////////////////////////////////////// ��������7-2
	// shuffle
	void shuffle() {
		for (int i = 0; i < CARD_NUM; i++) {
			int random = (int) (Math.random() * 20);
			// ���� ���� ���ؼ� ī�� ����
			SutdaCard tmp = cards[i];
			cards[i] = cards[random];
			cards[random] = tmp;
		}
	}

	// pick1
	SutdaCard pick(int index) {
		// �ε��� ��ȿ���˻�
		if (index < 0 || index > CARD_NUM) {
			System.out.println("�ٽ� �̾��ּ���");
			return null;
		}

		// ī��迭���� index��° ��� ����
		return cards[index];
	}

	// pick2
	SutdaCard pick() {
		// ������° ī�� ����
		int random = (int) (Math.random() * 20);
		// return pick(random);�� ����
		return cards[random];
	}
}

class SutdaCard {
	// �ѹ� ���� �����Ǹ� ����Ǿ�� �ȵǴ� �� - > final�� ��� ó��
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
		// ���̸� k���
		return num + (isKwang ? "K" : "");
	}
}

public class Ex7_1 {
	public static void main(String args[]) {
		SutdaDeck deck = new SutdaDeck();
		// �⺻ ī�� ���
		for (int i = 0; i < deck.cards.length; i++) {
			System.out.print(deck.cards[i] + ",");
		}
		System.out.println();
		// �� ����
		System.out.println("pick(0) -> " + deck.pick(0));
		// ����
		System.out.println("pick -> " + deck.pick());

		// �����ϰ� ���
		deck.shuffle();
		for (int i = 0; i < deck.cards.length; i++) {
			System.out.print(deck.cards[i] + ",");
		}
		System.out.println();
		// �� ����
		System.out.println("pick(0) -> " + deck.pick(0));

	}

}
