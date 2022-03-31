package ch7;

public class DrawShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point[] p = { new Point(100, 100), new Point(140, 50), new Point(200, 100) };

		Triangle t = new Triangle(p);
		Circle c = new Circle(new Point(150, 150), 50);

		// shape�κ��� ��� ����� ��ӹ޾����Ƿ�, color�� draw ��� ����
		t.draw();
		c.draw();
	}

}

class Shape { // circle�� triangle�� �θ�Ŭ����
	String color = "black";

	void draw() {
		System.out.printf("[color=%s]%n", color);
	}
}

class Point {
	int x;
	int y;

	Point(int x, int y) { // �Ű������� �ִ� ������
		this.x = x;
		this.y = y;
	}

	Point() { // �⺻ ������
		this(0, 0);
	}

	String getXY() { // x,y �� ���
		return "(" + x + "," + y + ")";
	}
}

class Circle extends Shape { // circle is a shape
	Point center; // circle has a point
	int r;

	Circle() { // �⺻ ������
		this(new Point(0, 0), 100);
	}

	Circle(Point center, int r) { // ������ ������, ������
		this.center = center;
		this.r = r;
	}

	void draw() { // ���� Ŭ������ ���ǵ� �޼���� ���� �޼��帣 �ڼ� Ŭ������ �����ϴ� ���� '�������̵�'
		System.out.printf("[center=(%d,%d),r=%d,color=%s]%n", center.x, center.y, r, color);
	}

}

class Triangle extends Shape { // triangle is a shape
	Point[] p = new Point[3]; // triagle has a point

	Triangle(Point[] p) {
		this.p = p;
	}

	void draw() { // �������̵�
		System.out.printf("[p1=%s,p2=%s,p3=%s,color=%s]%n", p[0].getXY(), p[1].getXY(), p[2].getXY(), color);
	}
}
