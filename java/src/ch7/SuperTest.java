package ch7;

//오버라이딩:조상 클래스로부터 상속받은 메서드의 내용을 변경하는것 
//        상속받은 메서드를 그대로 사용하기도 하지만, 자손 클래스 자신에 맞게 변경해야하는 경우 오버라이딩

//오버라이딩의 조건 - 메서드의
//1. 이름이 같아야함
//2. 매개변수가 같아야함
//3. 반환타입이 같아야함

//4. 접근제어자를 조상클래스의 메서드보다 좁은 범위로 변경할 수 없음 (public-protected-default-private)
//5. 예외는 조상 클래스의 메서드보다 많이 선언할 수 없다
//6. 인스턴스메서드를 static메서드로 또는 그 반대로 변경할 수 없음

//super: 자손클래스에서 조상 클래스로부터 상속받은 멤버를 참조하는데 사용되는 참조변수
//		상속받은 멤버와 자신의 멤버의 이름이 같을 때 super로 구별

public class SuperTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c = new Child();
		c.method();
	}

}

class Parent {
	int x = 10;
}

class Child extends Parent { // parent 상속
	int x = 20;

	void method() {
		System.out.println("x=" + x); //child의 x
		System.out.println("this.x=" + this.x); //child의 x
		System.out.println("super.x=" + super.x); // parent의 x, 상속받은 멤버변수
	}
}