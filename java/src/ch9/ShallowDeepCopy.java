package ch9;

//���� ���� : ��ü�� ����� ���� �״�� ����, ��ü�� �����ϰ� �ִ� ��ü���� ���������� ���� 
//-> ���� ����� ���纻�� �������

//���� ���� : ������ �����ϰ� �ִ� ��ü���� �����ϴ� ��  
//->������ ���纻�� ���� �ٸ� ��ü�� �����ϱ� ������ ������ ������ ���纻�� ������ ��ġ�� �ʴ´�

class Circle implements Cloneable {
	Point3 p; // ����
	double r; // ������

	public Circle(Point3 p, double r) {
		this.p = p;
		this.r = r;
	}

	public Circle shallowCopy() { // ��������
		Object obj = null; // object��ü ����

		try {
			obj = super.clone(); // ���� ����, ���� �ν��Ͻ��� ����Ŵ
		} catch (CloneNotSupportedException e) {
		}
		// TODO: handle exception
		return (Circle) obj;
	}

	public Circle deepCopy() {
		Object obj = null;

		try {
			obj = super.clone(); // �� ����
		} catch (CloneNotSupportedException e) {
		}

		Circle c = (Circle) obj; // ���ο� �ν��Ͻ� c ����, ������ ��ü�� c�� �����ϵ�����
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
		System.out.println("= c1�� ���� �� = ");
		System.out.println("c1=" + c1); // 9,9
		System.out.println("c2=" + c2); // 9,9 ��������
		System.out.println("c3=" + c3); // 1,1 ��������

	}

}
