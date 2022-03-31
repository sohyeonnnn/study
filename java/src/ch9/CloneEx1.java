package ch9;

class Point implements Cloneable {
	// Cloneable인터페이스를 구현한 클래스에서만 clone()을 호출할수있다 - 그렇지 않으면 예외 발생
	int x, y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "x=" + x + ", y=" + y;
	}

	public Object clone() {
		Object obj = null;
		try {
			obj = super.clone(); // clone은 반드시 예외처리
		} catch (CloneNotSupportedException e) {
		}
		// TODO: handle exception
		return obj;
	}

}

public class CloneEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point original = new Point(3, 5);
		Point copy = (Point) original.clone(); // 복제해서 새로운 객체를 생성
		System.out.println(original);
		System.out.println(copy);

	}

}
