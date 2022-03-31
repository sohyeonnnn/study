package ch7;

public class Ex7_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buyer19 b = new Buyer19();
		b.buy(new Tv19());
		b.buy(new Computer19());
		b.buy(new Tv19());
		b.buy(new Audio19());
		b.buy(new Computer19());
		b.buy(new Computer19());
		b.buy(new Computer19()); // �ܾ׺������� ���Ը���
		b.summary();

	}

}

class Buyer19 {
	int money = 1000;
	Product19[] cart = new Product19[3]; // īƮ
	int i = 0;

	void buy(Product19 p) {
		if (p.price > money) { // ���� ���� �� ������ �޼��� ����
			System.out.println("�ܾ��� �����Ͽ� " + p + "��/�� �� �� �����ϴ�");
			return;
		} else { // ���� ���� ����ϸ�
			money -= p.price; // ���� ������ ��ǰ ���� ����
			add(p); // ��ٱ��Ͽ� ������ ������ ��´�

		}
	}

	void add(Product19 p) {
		if (i >= cart.length) { // i���� ��ٱ����� ũ�⺸�� ���ų� ũ��
			// ������ ��ٱ��Ϻ��� 2�� ū ���ο� �迭�� ����
			Product19[] newCart = new Product19[cart.length * 2];
			for (int n = 0; n < cart.length; n++) {
				newCart[n] = cart[n]; // ������ ��ٱ����� ������ ���ο� �迭�� ����
			}
			cart = newCart; // ���ο� ��ٱ��Ͽ� ������ ��ٱ��ϸ� �ٲ۴�
		}
		cart[i++] = p;
	}

	void summary() {
		int sumPrice = 0;
		// ��ٱ��Ͽ� ��� ���ǵ��� ����� ����� ����Ѵ�
		System.out.print("������ ���� : ");

		for (int i = 0; i < cart.length; i++) {
			System.out.print(cart[i] + ",");

			// ��ٱ��Ͽ� ��� ���ǵ��� ������ ��� ���ؼ� ����Ѵ�
			sumPrice += cart[i].price;
		}
		System.out.println();
		System.out.println("����� �ݾ� : " + sumPrice);

		// ������ ��� ���� �ݾ��� ����Ѵ�
		System.out.println("���� �ݾ� : " + money);
	}
}

class Product19 {
	int price; // ��ǰ�� ����

	Product19(int price) { // ��ǰ���� �ʱ�ȭ
		this.price = price;
	}
}

class Tv19 extends Product19 {
	Tv19() {
		super(100); // product������ ȣ��
	}

	public String toString() {
		return "tv";
	}
}

class Computer19 extends Product19 {
	Computer19() {
		super(200); // ���� �ʱ�ȭ
	}

	public String toString() {
		return "computer";
	}
}

class Audio19 extends Product19 {
	Audio19() {
		super(50);
	}

	public String toString() {
		return "audio";
	}
}