package ch6;

class Car3 {
	String color;
	String gearType;
	int door;

	// 생성자에서 생성자를 호출할땐 this
	Car3() { // 기본 생성자
		this("white", "auto", 4); // Car2(String color, String gearType, int door) 호출
	}

	Car3(Car3 c) { // 인스턴스 복사를 위한 생성자 , 매개변수로 받은 객체의 변수값을 가져옴
		color = c.color;
		gearType = c.gearType;
		door = c.door;
	}

	Car3(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
		// this:인스턴스 자신을 가리키는 참조변수, 인스턴스의 주소가 저장되어있다
	}
}

class CarTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car3 c1 = new Car3();
		Car3 c2 = new Car3(c1); // c1의 복사본 c2를 생성

		// 같은 결과
		System.out.println("c1의 color=" + c1.color + ", gearType=" + c1.gearType + ", door=" + c1.door);
		System.out.println("c2의 color=" + c2.color + ", gearType=" + c2.gearType + ", door=" + c2.door);

		c1.door = 100; // c1의 인스턴스 변수 door의 값을 변경
		System.out.println("c1의 color=" + c1.color + ", gearType=" + c1.gearType + ", door=" + c1.door);
		System.out.println("c2의 color=" + c2.color + ", gearType=" + c2.gearType + ", door=" + c2.door);
		// c2는 c1을 복사하여 생성된 것이므로 서로 같은 상태를 갖지만,
		// 서로 독립적으로 메모리 공간에 존재하는 별도의 인스턴스 이므로 c1의 값들이 변경되어도 2는 영향을 받지 않는다
		

	}

}
