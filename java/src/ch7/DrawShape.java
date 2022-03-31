package ch7;

public class DrawShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point[] p = { new Point(100, 100), new Point(140, 50), new Point(200, 100) };

		Triangle t = new Triangle(p);
		Circle c = new Circle(new Point(150, 150), 50);

		// shape로부터 모든 멤버를 상속받았으므로, color나 draw 사용 가능
		t.draw();
		c.draw();
	}

}

class Shape { // circle과 triangle의 부모클래스
	String color = "black";

	void draw() {
		System.out.printf("[color=%s]%n", color);
	}
}

class Point {
	int x;
	int y;

	Point(int x, int y) { // 매개변수가 있는 생성자
		this.x = x;
		this.y = y;
	}

	Point() { // 기본 생성자
		this(0, 0);
	}

	String getXY() { // x,y 값 출력
		return "(" + x + "," + y + ")";
	}
}

class Circle extends Shape { // circle is a shape
	Point center; // circle has a point
	int r;

	Circle() { // 기본 생성자
		this(new Point(0, 0), 100);
	}

	Circle(Point center, int r) { // 원점과 반지름, 생성자
		this.center = center;
		this.r = r;
	}

	void draw() { // 조상 클래스에 정의된 메서드와 같은 메서드르 자손 클래스에 정의하는 것을 '오버라이딩'
		System.out.printf("[center=(%d,%d),r=%d,color=%s]%n", center.x, center.y, r, color);
	}

}

class Triangle extends Shape { // triangle is a shape
	Point[] p = new Point[3]; // triagle has a point

	Triangle(Point[] p) {
		this.p = p;
	}

	void draw() { // 오버라이딩
		System.out.printf("[p1=%s,p2=%s,p3=%s,color=%s]%n", p[0].getXY(), p[1].getXY(), p[2].getXY(), color);
	}
}
