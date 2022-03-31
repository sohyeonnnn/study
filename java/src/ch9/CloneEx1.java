package ch9;

class Point implements Cloneable {
	// Cloneable�������̽��� ������ Ŭ���������� clone()�� ȣ���Ҽ��ִ� - �׷��� ������ ���� �߻�
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
			obj = super.clone(); // clone�� �ݵ�� ����ó��
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
		Point copy = (Point) original.clone(); // �����ؼ� ���ο� ��ü�� ����
		System.out.println(original);
		System.out.println(copy);

	}

}
