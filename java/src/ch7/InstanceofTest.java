package ch7;

//참조변수가 참조하고 있는 인스턴스의 실제 타입을 알아보는 법 : instanceof 연산자
public class InstanceofTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FireEngine fe = new FireEngine();

		// 어떤 타입에 대한 instanceof연산의 결과가 true라는 것은
		// 검사한 타입으로 형변환이 가능하다는 것

		if (fe instanceof FireEngine) { // true
			System.out.println("This is a fireEngine instance");
		}

		if (fe instanceof Car) {// true -상속
			System.out.println("This is a Car instance");
		}

		if (fe instanceof Object) {// true -상속
			System.out.println("This is an Object instance");
		}
		System.out.println(fe.getClass().getName()); // 클래스 이름을 출력
	}

}
