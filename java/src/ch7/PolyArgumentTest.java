package ch7;

class Product {
	int price; // �ν��Ͻ�����
	int bonusPoint;

	Product(int price) {
		this.price = price; // ���� ����
		bonusPoint = (int) (price / 10.0); // ���ʽ��� 10%
	}
}

class Tv3 extends Product {
	Tv3() {
		// ���� Ŭ������ ������ ȣ��
		super(100); // tv�� ������ 100�������� �Ѵ�, ���ʽ��� 10
	}

	// objectŬ������ toString�� �������̵�
	public String toString() {
		return "Tv";
	}
}

class Computer extends Product {
	Computer() { // ���� Ŭ���� ������ ȣ��
		super(200);
	}

	public String toString() { // �������̵�
		return "Computer";
	}
}

class Buyer {
	int money = 1000;
	int bonusPoint = 0;

	void buy(Product p) {
		if (money < p.price) { // �Ű������� ���� product�� ���ݰ� ��
			System.out.println("�ܾ��� �����Ͽ� ������ �� �� �����ϴ�");
			return;
		}

		money -= p.price; // ������ �ִ� ������ product�� ���� ����
		bonusPoint += p.bonusPoint; // ���ʽ�
		System.out.println(p + "��/�� �����ϼ̽��ϴ�");
	}
}

class PolyArgumentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buyer b = new Buyer();
		b.buy(new Tv3()); // tv����
		b.buy(new Computer()); // computer����

		System.out.println("���� ���� ���� " + b.money + "���� �Դϴ�");
		System.out.println("���� ���ʽ������� " + b.bonusPoint + "�� �Դϴ�.");

	}

}
