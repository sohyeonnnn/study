package ch7;

public class PointTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point3D2 p3 = new Point3D2(); //////////Point3D2 �����ڷ� 111111111111
		System.out.println("p3.x=" + p3.x);
		System.out.println("p3.y=" + p3.y);
		System.out.println("p3.z=" + p3.z);
	}
}

class Point2 {
	int x = 10;
	int y = 20;

	Point2(int x, int y) {//////////////////5555555555555
		// ������ ù �ٿ��� �ٸ� �����ڸ� ȣ������ �ʱ� ������ �����Ϸ��� super() ���⿡ ����
		/////////66666 object ������
		this.x = x;
		this.y = y;
	}
}

class Point3D2 extends Point2 {
	int z = 30;

	public Point3D2() { //////////////////2222222222222222
		this(100, 200, 300); // �����ڰ� ȣ�� - this ���
	}

	public Point3D2(int x, int y, int z) {//////////////////333333333333
		super(x, y); // point2�� ������ ȣ�� - super()/////////444444444
		this.z = z;
	}

}