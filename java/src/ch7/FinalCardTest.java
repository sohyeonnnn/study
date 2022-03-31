package ch7;

//제어자 : 클래스, 변수 또는 메서드의 선언부와 함께 사용되어 부가적인 의미 부여
//접근제어자 public, protected, default, private
//그 외 static, final, abstract, native, transient, synchronized, volatile, strictfp

//static 사용 - 멤버변수, 메서드, 초기화블럭
//인스턴스 멤버를 사용하지 않는 메서드는 static을 붙여서 static메서드로 선언하는것이 좋다

//final 사용 - 클래스, 메서드, 멤버변수, 지역변수
//변수-상수, 메서드-오버라이딩x, 클래스-자손클래스x
//final변수는 일반적으로 선언과 초기화를 동시에 하지만, 인스턴스변수의 경우 생성자에서 초기화 가능

class Card2 {
	final int NUMBER;
	final String KIND;
	static int width = 100;
	static int height = 250;

	Card2(String kind, int num) {
		NUMBER = num;
		KIND = kind;
	}

	Card2() { // 기본 생성자
		this("HEART", 1);
	}

	public String toString() {
		return KIND + "" + NUMBER;
	}
}

public class FinalCardTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card2 c = new Card2("HEART", 10);
		//c.NUMBER = 5; //final변수이기 때문에 변경할수없다
		System.out.println(c.KIND);
		System.out.println(c.NUMBER);
		System.out.println(c);

	}

}
