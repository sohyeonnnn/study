package ch7;

class Product75 {
	int price;
	int bonusPoint;

	// 추가
	Product75() {
	}

	Product75(int price) {
		this.price = price;
		bonusPoint = (int) (price / 10.0);
	}
}

class Tv75 extends Product75 {
	// 에러가 나는 이유
	// tv가 product를 상속받기때문에 tv객체가 생성될때 생성자가 호출되고
	// tv의 생성자가 조상 product의 기본생성자를 호출하는데
	// product의 기본생성자가 없음
	// -> 매개변수가 있는 생성자를 만들었기 때문에 기본생성자가 자동으로 만들어지지않았다

	// 자손클래스의 생성자에서 조상클래스의 생성자를 호출해야하는 이유
	// 자손클래스에서 조상클래스의 멤버를 사용해야하기때문에
	Tv75() {
	}

	public String toString() {
		return "Tv";
	}
}

public class Ex7_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv75 t = new Tv75();

	}

}
