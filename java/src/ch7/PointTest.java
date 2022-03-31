package ch7;

//super() :  조상클래스의 생성자를 호출
// 자손 클래스의 인스턴스를 생성하면, 자송의 멤버와 조상의 멤버기 모두 합쳐진 하나의 인스턴스가 생성
// 이때 조상 클래스 멤버의 초기화 작업이 수행되어야 하니 때문에, 조상클래스의 생성자 호출 super()
public class PointTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point3D p3 = new Point3D(1, 2, 3);
	}

}

class Point1 {
	int x, y;

	public Point1() { // TODO Auto-generated constructor stub

	}

	// 생성자가 정의되어 있는 클래스에는 컴파일러가 기본 생성자를 자동적으로 추가하지 않는다

	Point1(int x, int y) {
		this.x = x;
		this.y = y;
	}

	String getLocation() {
		return "x:" + x + ", y:" + y;
	}
}

class Point3D extends Point1 {
	int z;

	Point3D(int x, int y, int z) {
		// 이 위치에 컴파일러가 생성자를 삽입해준다 super()
		/* super(); */
		this.x = x;
		this.y = y;
		this.z = z;
	}

	String getLocation() { // 오버라이딩
		return "x:" + x + "y:" + y + "z:" + z;
	}

}
