package ch6;

//같은 클래스의 멤버들 간에 서로 호출할 수 있는 것처럼 생성자 간에도 서로 호출이 가능하다
//1. 생성자의 이름으로 클래스이름 대신 this를 사용한다
//2. 한 생성자에서 다른 생성자를 호출할 때는 반드시 첫 줄에서만 호출이 가능하다

class Car2 {
	String color;
	String gearType;
	int door;

	// 생성자에서 생성자를 호출할떈 this
	Car2() { // 기본 생성자
		this("white", "auto", 4); // Car2(String color, String gearType, int door) 호출
	}

	Car2(String color) { // color만 설정하는 생성자
		this(color, "auto", 4);
	}

	Car2(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}

public class CarTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car2 c1 = new Car2();
		Car2 c2 = new Car2("blue");

		System.out.println();
	}

}
