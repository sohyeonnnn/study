package ch7;

class Product {
	int price; // 인스턴스변수
	int bonusPoint;

	Product(int price) {
		this.price = price; // 가격 설정
		bonusPoint = (int) (price / 10.0); // 보너스는 10%
	}
}

class Tv3 extends Product {
	Tv3() {
		// 조상 클래스의 생성자 호출
		super(100); // tv의 가격을 100만원으로 한다, 보너스는 10
	}

	// object클래스의 toString을 오버라이딩
	public String toString() {
		return "Tv";
	}
}

class Computer extends Product {
	Computer() { // 조상 클래스 생성자 호출
		super(200);
	}

	public String toString() { // 오버라이딩
		return "Computer";
	}
}

class Buyer {
	int money = 1000;
	int bonusPoint = 0;

	void buy(Product p) {
		if (money < p.price) { // 매개변수로 받은 product의 가격과 비교
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다");
			return;
		}

		money -= p.price; // 가지고 있는 돈에서 product의 가격 뺀다
		bonusPoint += p.bonusPoint; // 보너스
		System.out.println(p + "을/를 구입하셨습니다");
	}
}

class PolyArgumentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buyer b = new Buyer();
		b.buy(new Tv3()); // tv구매
		b.buy(new Computer()); // computer구매

		System.out.println("현재 남은 돈은 " + b.money + "만원 입니다");
		System.out.println("현재 보너스점수는 " + b.bonusPoint + "점 입니다.");

	}

}
