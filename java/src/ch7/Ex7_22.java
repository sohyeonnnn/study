package ch7;

class Ex7_22 {

	static double sumArea(Shape22[] arr) { // 7-23
		double sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i].calcArea();
		}
		return sum;
	}

	public static void main(String[] args) {
		Shape22[] arr = { new Circle22(5.0), new Rectangle22(3, 4), new Circle22(1) };
		System.out.println("면적의 합:" + sumArea(arr));
	}
}

abstract class Shape22 {
	Point22 p;

	Shape22() {
		this(new Point22(0, 0));
	}

	Shape22(Point22 p) {
		this.p = p;
	}

	abstract double calcArea(); // 도형의 면적을 계산해서 반환하는 메서드 - 미완성

	Point22 getPosition() {
		return p;
	}

	void setPosition(Point22 p) {
		this.p = p;
	}
}

//circle 클래스
class Circle22 extends Shape22 {
	double r;

	Circle22(double r) {
		this(new Point22(0, 0), r);
	}

	Circle22(Point22 p, double r) {
		super(p);
		this.r = r;
	}

	// 오버라이딩
	double calcArea() { // 원의 면적
		if (r > 0)
			return r * r * Math.PI;
		else
			return 0.0;
	}
}

//rectangle 클래스
class Rectangle22 extends Shape22 {
	double width;
	double height;

	Rectangle22(double width, double height) {
		this(new Point22(0, 0), width, height); // 생성자간 호출 - this
	}

	Rectangle22(Point22 p, double width, double height) {
		super(p); // this.p=p
		this.width = width;
		this.height = height;
	}

	// 오버라이딩
	double calcArea() {
		if (width > 0 && height > 0)
			return width * height;
		else
			return 0.0;
	}

	boolean isSquare() {
		if (width == height && width > 0 && height > 0) { // w,h>0이고 w=h면
			return true;
		} else {
			return false;
		}
		// return width*height!=0&&width==height; //한줄로 쓸수있음
	}
}

class Point22 {
	int x;
	int y;

	Point22() {
		this(0, 0);
	}

	Point22(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "{" + x + "," + y + "}";
	}
}
