package ch6;

class Card {
	String kind; // �ν��Ͻ�����
	int number; // �ν��Ͻ� ����
	static int width = 100; // Ŭ���� ����
	static int height = 250; // Ŭ���� ����
}

public class CardTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ŭ���� ������ ��ü���� ���� ���� ���� ����
		System.out.println("card.width=" + Card.width);
		System.out.println("card.height=" + Card.height);

		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;

		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;

		System.out.println("c1�� " + c1.kind + ", " + c1.number + "�̸�, ũ��� (" + c1.height + ")");
		System.out.println("c2�� " + c2.kind + ", " + c2.number + "�̸�, ũ��� (" + c2.height + ")");

		c1.width = 50;
		c1.height = 80;

		System.out.println("c1�� " + c1.kind + ", " + c1.number + "�̸�, ũ��� (" + c1.height + ")");
		System.out.println("c2�� " + c2.kind + ", " + c2.number + "�̸�, ũ��� (" + c2.height + ")");
	}

}
