package ch7;

class Product2 {
	int price;
	int bonusPoint;

	Product2(int price) {
		this.price = price;
		bonusPoint = (int) (price / 10.0);
	}

	Product2() {
		} // �⺻ ������
}

class Tv2 extends Product2 {
	Tv2() {
		super(100); // product�� ������ ȣ��
	}

	public String toString() { // �������̵�
		return "Tv";
	}
}

class Computer2 extends Product2 {
	Computer2() {
		super(200);// product�� ������ ȣ��
	}

	public String toString() { // �������̵�
		return "Computer";
	}
}

class Audio2 extends Product2 {
	Audio2() {
		super(50);// product�� ������ ȣ��
	}

	public String toString() { // �������̵�
		return "Audio";
	}
}

class Buyer3 {
	int money = 1000;
	int bonusPoint = 0;
	Product2[] item = new Product2[10]; // ������ ��ǰ�� ������ �迭
	int i = 0; // �迭�� ���� ī����

	void buy(Product2 p) { // product p�� �����Ҷ�
		if (money < p.price) {
			System.out.println("�ܾ��� �����Ͽ� ������ �� �� �����ϴ�");
			return;
		}

		money -= p.price; // �������ִµ����� ���� ����
		bonusPoint += p.bonusPoint; // ���ʽ�
		item[i++] = p; // item�迭�� ����
		System.out.println(p + "��/�� �����ϼ̽��ϴ�");
	}

	void summary() {
		int sum = 0;
		String itemList = "";

		for (int i = 0; i < item.length; i++) {
			if (item[i] == null)
				break;
			sum += item[i].price; // ������ ��ǰ �ѱݾ� ��
			itemList += (i == 0) ? "" + item[i] : ", " + item[i]; // ������ ��ǰ ����Ʈ ���ڿ���
		}
		System.out.println("�����Ͻ� ��ǰ�� �ѱݾ��� " + sum + "���� �Դϴ�");
		System.out.println("�����Ͻ� ��ǰ�� " + itemList + "�Դϴ�");
	}
}

class PolyArgumentTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Buyer3 b = new Buyer3();
		b.buy(new Tv2());
		b.buy(new Computer2());
		b.buy(new Audio2());
		b.summary();
	}

	// ������ ��ǰ�� ������ �迭�� ũ�⸦ 10���� �߱� ������ 11�� �̻��� ��ǰ�� �����Ҽ�����
	// �̷� ��� vectorŬ������ ��� -> ���������� objectŸ���� �迭�� �������־ �� �迭�� ��ü�� �߰��ϰų� �����Ҽ��ִ�
	// vector : �������� ũ�Ⱑ �����Ǵ� ��ü�迭
}
