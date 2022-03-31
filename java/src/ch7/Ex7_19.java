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
		b.buy(new Computer19()); // 잔액부족으로 구입못함
		b.summary();

	}

}

class Buyer19 {
	int money = 1000;
	Product19[] cart = new Product19[3]; // 카트
	int i = 0;

	void buy(Product19 p) {
		if (p.price > money) { // 가진 돈이 더 적으면 메서드 종료
			System.out.println("잔액이 부족하여 " + p + "을/를 살 수 없습니다");
			return;
		} else { // 가진 돈이 충분하면
			money -= p.price; // 가진 돈에서 제품 가격 빼고
			add(p); // 장바구니에 구입한 물건을 담는다

		}
	}

	void add(Product19 p) {
		if (i >= cart.length) { // i값이 장바구니의 크기보다 같거나 크면
			// 기존의 장바구니보다 2배 큰 새로운 배열을 생성
			Product19[] newCart = new Product19[cart.length * 2];
			for (int n = 0; n < cart.length; n++) {
				newCart[n] = cart[n]; // 기존의 장바구니의 내용을 새로운 배열에 복사
			}
			cart = newCart; // 새로운 장바구니와 기존의 장바구니를 바꾼다
		}
		cart[i++] = p;
	}

	void summary() {
		int sumPrice = 0;
		// 장바구니에 담긴 물건들의 목록을 만들어 출력한다
		System.out.print("구입한 물건 : ");

		for (int i = 0; i < cart.length; i++) {
			System.out.print(cart[i] + ",");

			// 장바구니에 담긴 물건들의 가격을 모두 더해서 출력한다
			sumPrice += cart[i].price;
		}
		System.out.println();
		System.out.println("사용한 금액 : " + sumPrice);

		// 물건을 사고 남은 금액을 출력한다
		System.out.println("남은 금액 : " + money);
	}
}

class Product19 {
	int price; // 제품의 가격

	Product19(int price) { // 제품가격 초기화
		this.price = price;
	}
}

class Tv19 extends Product19 {
	Tv19() {
		super(100); // product생성자 호출
	}

	public String toString() {
		return "tv";
	}
}

class Computer19 extends Product19 {
	Computer19() {
		super(200); // 가격 초기화
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