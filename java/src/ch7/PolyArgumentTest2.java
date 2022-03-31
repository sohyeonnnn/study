package ch7;

class Product2 {
	int price;
	int bonusPoint;

	Product2(int price) {
		this.price = price;
		bonusPoint = (int) (price / 10.0);
	}

	Product2() {
		} // 기본 생성자
}

class Tv2 extends Product2 {
	Tv2() {
		super(100); // product의 생성자 호출
	}

	public String toString() { // 오버라이딩
		return "Tv";
	}
}

class Computer2 extends Product2 {
	Computer2() {
		super(200);// product의 생성자 호출
	}

	public String toString() { // 오버라이딩
		return "Computer";
	}
}

class Audio2 extends Product2 {
	Audio2() {
		super(50);// product의 생성자 호출
	}

	public String toString() { // 오버라이딩
		return "Audio";
	}
}

class Buyer3 {
	int money = 1000;
	int bonusPoint = 0;
	Product2[] item = new Product2[10]; // 구입한 제품을 저장할 배열
	int i = 0; // 배열에 사용될 카운터

	void buy(Product2 p) { // product p를 구매할때
		if (money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다");
			return;
		}

		money -= p.price; // 가지고있는돈에서 가격 빼기
		bonusPoint += p.bonusPoint; // 보너스
		item[i++] = p; // item배열에 저장
		System.out.println(p + "을/를 구입하셨습니다");
	}

	void summary() {
		int sum = 0;
		String itemList = "";

		for (int i = 0; i < item.length; i++) {
			if (item[i] == null)
				break;
			sum += item[i].price; // 구입한 제품 총금액 합
			itemList += (i == 0) ? "" + item[i] : ", " + item[i]; // 구입한 제품 리스트 문자열로
		}
		System.out.println("구입하신 물품의 총금액은 " + sum + "만원 입니다");
		System.out.println("구입하신 제품은 " + itemList + "입니다");
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

	// 구입한 제품을 저장할 배열의 크기를 10으로 했기 때문에 11개 이상의 제품을 구입할수없다
	// 이런 경우 vector클래스를 사용 -> 내부적으로 object타입의 배열을 가지고있어서 이 배열에 객체를 추가하거나 제거할수있다
	// vector : 동적으로 크기가 관리되는 객체배열
}
