package ch7;

//super() :  ����Ŭ������ �����ڸ� ȣ��
// �ڼ� Ŭ������ �ν��Ͻ��� �����ϸ�, �ڼ��� ����� ������ ����� ��� ������ �ϳ��� �ν��Ͻ��� ����
// �̶� ���� Ŭ���� ����� �ʱ�ȭ �۾��� ����Ǿ�� �ϴ� ������, ����Ŭ������ ������ ȣ�� super()
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

	// �����ڰ� ���ǵǾ� �ִ� Ŭ�������� �����Ϸ��� �⺻ �����ڸ� �ڵ������� �߰����� �ʴ´�

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
		// �� ��ġ�� �����Ϸ��� �����ڸ� �������ش� super()
		/* super(); */
		this.x = x;
		this.y = y;
		this.z = z;
	}

	String getLocation() { // �������̵�
		return "x:" + x + "y:" + y + "z:" + z;
	}

}
