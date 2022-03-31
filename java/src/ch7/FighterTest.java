package ch7;

//추상클래스 abstract

//미완성상태, 인스턴스 생성 불가능, 상속을 통해 자손클래스에 의해서 완성
//추상클래스 자체로는 클래스로서의 역할을 다 못하지만, 새로운 클래스를 작성하는데 있어서 바탕이 되는 조상클래스로서 중요한 의미
//추상클래스는 추상메서드를 포함하고 있다는 것을 제외하고는 일반클래스와 전혀 다르지않음

//추상메서드 : 선언부만 작성, 구현부는 작성x
//메서드의 내용이 상속받는 클래스에 따라 달라질 수 있기 때문에 
//주석으로 어떤 기능을 수행할 목적으로 작성되었는지 알려주고, 실제내용은 상속받는 클래스에서 구현하도록

//상속 : 자손클래스를 만드는데 조상클래스를 사용하는것
//추상화 : 기존의 클래스의 공통부분을 뽑아서 조상클래스를 만드는것

//abstract를 붙이는 이유: 자손클래스에서 추상메서드를 반드시 구현하도록 강요하기 위해서

//인터페이스 : 오직 추상메서드와 상수만을 가질수 있는 일종의 추상클래스, 작성할때 class 대신 interface 키워드
//1. 모든 멤버변수는 public static final이어야 하며, 생략가능
//2. 모든 메서드는 public abstract이어야하며, 생략가능 
//**jdk1.8부터 인터페이스에 static메서드와 default메서드의 추가를 허용

//인터페이스는 인터페이스로부터만 상속가능, 클래스와 달리 다중상속 가능
//그 자체로 인스턴스 생성X -> 인터페이스 구현해야함 implements
//인터페이스의 일부 메서드만 구현한다면, abstract를 붙여서 추상클래스로 선언
//상속과 구현을 동시에 할수도있다

class FighterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fighter f = new Fighter();

		// 모두 만족
		if (f instanceof Unit) {
			System.out.println("f는 unit의 자손입니다");
		}
		if (f instanceof Fightable) {
			System.out.println("f는 fightable인터페이스를 구현");
		}
		if (f instanceof Movable) {
			System.out.println("f는 movable인터페이스를 구현");
		}
		if (f instanceof Attackable) {
			System.out.println("f는 attackable인터페이스를 구현");
		}
		if (f instanceof Object) {
			System.out.println("f는 object클래스의 자손");
		}

	}

}

class Fighter extends Unit implements Fightable { // unit을 상속받고, fightable 인터페이스를 구현
	public void move(int x, int y) { // 메서드 구현
		/* 내용생략 */
		// 오버라이딩할때는 조상의 메서드보다 넓은 범위의 접근제어자를 지정해야함
		// movable, attackable의 move메서드의 접근제어자는 public abstract이므로 public
	}

	public void attack(Unit u) { // 메서드 구현
		/* 내용생략 */
	}
}

class Unit {
	int currentHP; // 체력
	int x; // x좌표
	int y; // y좌표
}

interface Fightable extends Movable, Attackable { // 인터페이스 movable,attackable을 상속
}

interface Movable { // 인터페이스
	void move(int x, int y);
}

interface Attackable { // 인터페이스
	void attack(Unit u);
}
