package ch9;

//얕은 복사 : 객체에 저장된 것을 그대로 복제, 객체가 참조하고 있는 객체까지 복제하지는 않음 
//-> 원본 변경시 복사본도 영향받음

//깊은 복사 : 원본이 참조하고 있는 객체까지 복제하는 것  
//->원본과 복사본이 서로 다른 객체를 참조하기 때문에 원본의 변경이 복사본에 영향을 미치지 않는다

class Circle implements Cloneable {
	Point3 p; // 원점
	double r; // 반지름

	public Circle(Point3 p, double r) {
		this.p = p;
		this.r = r;
	}

	public Circle shallowCopy() { // 얕은복사
		Object obj = null; // object객체 생성

		try {
			obj = super.clone(); // 값만 복제, 같은 인스턴스를 가리킴
		} catch (CloneNotSupportedException e) {
		}
		// TODO: handle exception
		return (Circle) obj;
	}

	public Circle deepCopy() {
		Object obj = null;

		try {
			obj = super.clone(); // 값 복제
		} catch (CloneNotSupportedException e) {
		}

		Circle c = (Circle) obj; // 새로운 인스턴스 c 생성, 복제된 객체가 c를 참조하도록함
		c.p = new Point3(this.p.x, this.p.y);

		return c;
	}

	public String toString() {
		return "[p=" + p + ", r=" + r + "]";

	}
}

class Point3 {
	int x, y;

	Point3(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "(" + x + ", " + y + ")";
	}
}

public class ShallowDeepCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1 = new Circle(new Point3(1, 1), 2.0);
		Circle c2 = c1.shallowCopy();
		Circle c3 = c1.deepCopy();

		System.out.println("c1=" + c1); // 1,1
		System.out.println("c2=" + c2); // 1,1
		System.out.println("c3=" + c3); // 1,1

		c1.p.x = 9;
		c1.p.y = 9;
		System.out.println("= c1의 변경 후 = ");
		System.out.println("c1=" + c1); // 9,9
		System.out.println("c2=" + c2); // 9,9 얕은복사
		System.out.println("c3=" + c3); // 1,1 깊은복사

	}

}
