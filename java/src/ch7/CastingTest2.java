package ch7;

public class CastingTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car = new Car();
		Car car2 = null;
		FireEngine fe = null;

		car.drive();
		fe = (FireEngine) car; // 컴파일은 o, 실행시 오류
		// 조상타입의 인스턴스를 자손타입의 참조변수로 참조하는 것은 안된다
		// 자손타입이 접근할수 있는 멤버가 더 많기 때문에
		fe.drive();
		car2 = fe;
		car2.drive();
	}

}
