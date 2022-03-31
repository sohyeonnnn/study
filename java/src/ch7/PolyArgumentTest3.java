package ch7;

import java.util.Vector;

class Product4 {
	int price;
	int bonusPoint;

	Product4(int price) {
		this.price = price;
		bonusPoint = (int) (price / 10.0);
	}

	Product4() {
		price = 0;
		bonusPoint = 0;
	} // �⺻ ������
}

class Tv4 extends Product4 {
	Tv4() {
		super(100); // tv�� 100����
	}

	public String toString() {
		return "Tv";
	}
}

class Computer4 extends Product4 {
	Computer4() {
		super(200); // computer�� 200����
	}

	public String toString() {
		return "Computer";
	}
}

class Audio4 extends Product4 {
	Audio4() {
		super(50);// audio�� 50����
	}

	public String toString() {
		return "Audio";
	}
}

class Buyer4 {
	int money = 1000;
	int bonusPoint = 0;
	Vector item = new Vector(); // �������� ũ�Ⱑ �����Ǵ� ��ü�迭

	void buy(Product4 p) {
		if (money < p.price) {
			System.out.println("�ܾ��� �����Ͽ� ������ ��� �����ϴ�");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		item.add(p); // vector�� p ����
		System.out.println(p + "��/�� �����ϼ̽��ϴ�");
	}

	void refund(Product4 p) {
		if (item.remove(p)) { // vector���� p����
			money += p.price; // ȯ��
			bonusPoint -= p.bonusPoint;
			System.out.println(p + "��/�� ��ǰ�ϼ̽��ϴ�");
		} else {
			System.out.println("�����Ͻ� ��ǰ �� �ش� ��ǰ�� �����ϴ�");
		}
	}

	void summary() {
		int sum = 0;
		String itemList = "";

		if (item.isEmpty()) {
			System.out.println("�����Ͻ� ��ǰ�� �����ϴ�");
			return;
		}
		for (int i = 0; i < item.size(); i++) {
			Product4 p = (Product4) item.get(i); // vector�� i��° ��ü�� ������
			sum += p.price;
			itemList += (i == 0) ? "" + p : ", " + p; // ù��°�� ',' ��� ����
		}
		System.out.println("�����Ͻ� ��ǰ�� �ѱݾ��� " + sum + "�����Դϴ�");
		System.out.println("�����Ͻ� ��ǰ�� " + itemList + "�Դϴ�");
	}
}

class PolyArgumentTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buyer4 b = new Buyer4();
		Tv4 tv = new Tv4();
		Computer4 com = new Computer4();
		Audio4 audio = new Audio4();

		b.buy(tv); // tv����
		b.buy(com); // computer����
		b.buy(audio); // audio����
		b.summary(); // ���
		System.out.println();
		b.refund(com); // computerȯ��
		b.summary(); // ���

	}

}