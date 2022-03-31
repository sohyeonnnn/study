package ch7;

//인터페이스의 장점
//개발시간 단축, 표준화 가능, 서로 관계없는 클래스에 관계 부여, 독립적 프로그래밍 가능

class RepairableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tank tank = new Tank();
		Dropship dropshop = new Dropship();
		Marine marine = new Marine();
		SCV scv = new SCV();
		scv.repair(tank);
		scv.repair(dropshop);
		//marine은 repairable인터페이스를 구현하지 않았기 때문에 repair의 매개변수 자리에 들어갈수 없다
		// scv.repair(marine); 

	}

}

interface Repairable { // 인터페이스
}

class Unit11 { // unit클래스는 hitPoint,MAX_HP를 멤버로 가진다
	int hitPoint;
	final int MAX_HP;

	Unit11(int hp) { // max_hp 초기화 하는 생성자
		MAX_HP = hp;
	}
}

class GroundUnit extends Unit11 { // unit을 상속받는 groundunit
	GroundUnit(int hp) { // 생성자
		super(hp);
	}
}

class AirUnit extends Unit11 { // unit을 상속받는 airunit
	AirUnit(int hp) { // 생성자
		super(hp);
	}
}

class Tank extends GroundUnit implements Repairable { // 인터페이스 구현, ground 상속
	Tank() { // 생성자
		super(150); // groundunit의 생성자
		hitPoint = MAX_HP;
	}

	public String toString() { // 오버라이딩
		return "Tank";
	}
}

class Dropship extends AirUnit implements Repairable {// 인터페이스 구현, air 상속

	Dropship() { // 생성자
		super(125);// airunit의 생성자
		hitPoint = MAX_HP;
	}

	public String toString() { // 오버라이딩
		return "Dropship";
	}
}

class Marine extends GroundUnit { // ground를 상속
	Marine() {
		super(40);
		hitPoint = MAX_HP;
	}
}

class SCV extends GroundUnit implements Repairable { // 인터페이스 구현, ground 상속
	SCV() {
		super(60);
		hitPoint = MAX_HP;
	}

	void repair(Repairable r) { // 인터페이스를 구현한 인스턴스를 매개변수로 받아서 repair하는 메서드
		if (r instanceof Unit11) {
			Unit11 u = (Unit11) r;
			while (u.hitPoint != u.MAX_HP) {
				u.hitPoint++; // hitpoint증가
			}
			System.out.println(u.toString() + "의 수리가 끝났습니다");
		}
	}
}
