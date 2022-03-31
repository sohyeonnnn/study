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
	} // 기본 생성자
}

class Tv4 extends Product4 {
	Tv4() {
		super(100); // tv는 100만원
	}

	public String toString() {
		return "Tv";
	}
}

class Computer4 extends Product4 {
	Computer4() {
		super(200); // computer는 200만원
	}

	public String toString() {
		return "Computer";
	}
}

class Audio4 extends Product4 {
	Audio4() {
		super(50);// audio는 50만원
	}

	public String toString() {
		return "Audio";
	}
}

class Buyer4 {
	int money = 1000;
	int bonusPoint = 0;
	Vector item = new Vector(); // 동적으로 크기가 관리되는 객체배열

	void buy(Product4 p) {
		if (money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살수 없습니다");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		item.add(p); // vector에 p 저장
		System.out.println(p + "을/를 구입하셨습니다");
	}

	void refund(Product4 p) {
		if (item.remove(p)) { // vector에서 p제거
			money += p.price; // 환불
			bonusPoint -= p.bonusPoint;
			System.out.println(p + "을/를 반품하셨습니다");
		} else {
			System.out.println("구입하신 제품 중 해당 제품이 없습니다");
		}
	}

	void summary() {
		int sum = 0;
		String itemList = "";

		if (item.isEmpty()) {
			System.out.println("구입하신 제품이 없습니다");
			return;
		}
		for (int i = 0; i < item.size(); i++) {
			Product4 p = (Product4) item.get(i); // vector의 i번째 객체를 가져옴
			sum += p.price;
			itemList += (i == 0) ? "" + p : ", " + p; // 첫번째는 ',' 출력 안함
		}
		System.out.println("구입하신 물품의 총금액은 " + sum + "만원입니다");
		System.out.println("구입하신 제품은 " + itemList + "입니다");
	}
}

class PolyArgumentTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buyer4 b = new Buyer4();
		Tv4 tv = new Tv4();
		Computer4 com = new Computer4();
		Audio4 audio = new Audio4();

		b.buy(tv); // tv구매
		b.buy(com); // computer구매
		b.buy(audio); // audio구매
		b.summary(); // 출력
		System.out.println();
		b.refund(com); // computer환불
		b.summary(); // 출력

	}

}