package ch6;

//���� Ŭ������ ����� ���� ���� ȣ���� �� �ִ� ��ó�� ������ ������ ���� ȣ���� �����ϴ�
//1. �������� �̸����� Ŭ�����̸� ��� this�� ����Ѵ�
//2. �� �����ڿ��� �ٸ� �����ڸ� ȣ���� ���� �ݵ�� ù �ٿ����� ȣ���� �����ϴ�

class Car2 {
	String color;
	String gearType;
	int door;

	// �����ڿ��� �����ڸ� ȣ���ҋ� this
	Car2() { // �⺻ ������
		this("white", "auto", 4); // Car2(String color, String gearType, int door) ȣ��
	}

	Car2(String color) { // color�� �����ϴ� ������
		this(color, "auto", 4);
	}

	Car2(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}

public class CarTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car2 c1 = new Car2();
		Car2 c2 = new Car2("blue");

		System.out.println();
	}

}
