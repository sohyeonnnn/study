package ch7;

//다형성 : 조상클래스 타입의 참조변수로 자손클래스의 인스턴스 참조가능 -자손의 모든 멤버에 접근 가능한 것은 아님
// 반대(자손클래스로 조상클래스 인스턴스 참조) 경우는 불가능 - 자손이 멤버가 더 많다
//참조변수가 사용할 수 있는 멤버의 개수는 인스턴스의 멤버 개수보다 같거나 적어야한다

//참조변수의 형변환
//서로 상속관계에 있는 클래스사이에서만 가능
//형변환은 참조하고 있는 인스턴스에서 사용할수있는 멤버의 범위 조절 역할

class CastingTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;

		fe.water(); // water~
		car = fe; // 업캐스팅 (생략가능)
		// car.water(); //car타입으로는 water를 호출할수없음
		fe2 = (FireEngine) car; // 다운캐스팅(생략불가능)
		fe2.water(); // fireEngine은 water 호출 가능

	}
}

class Car {
	String color;
	int door;

	void drive() {
		System.out.println("drive,brrr~");
	}

	void stop() {
		System.out.println("stop!!!");
	}
}

class FireEngine extends Car { // car을 상속받아 color,door사용 가능
	void water() { // drive(),stop()도 사용가능
		System.out.println("water~~~");
	}
}
