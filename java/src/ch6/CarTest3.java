package ch6;

class Car3 {
	String color;
	String gearType;
	int door;

	// �����ڿ��� �����ڸ� ȣ���Ҷ� this
	Car3() { // �⺻ ������
		this("white", "auto", 4); // Car2(String color, String gearType, int door) ȣ��
	}

	Car3(Car3 c) { // �ν��Ͻ� ���縦 ���� ������ , �Ű������� ���� ��ü�� �������� ������
		color = c.color;
		gearType = c.gearType;
		door = c.door;
	}

	Car3(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
		// this:�ν��Ͻ� �ڽ��� ����Ű�� ��������, �ν��Ͻ��� �ּҰ� ����Ǿ��ִ�
	}
}

class CarTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car3 c1 = new Car3();
		Car3 c2 = new Car3(c1); // c1�� ���纻 c2�� ����

		// ���� ���
		System.out.println("c1�� color=" + c1.color + ", gearType=" + c1.gearType + ", door=" + c1.door);
		System.out.println("c2�� color=" + c2.color + ", gearType=" + c2.gearType + ", door=" + c2.door);

		c1.door = 100; // c1�� �ν��Ͻ� ���� door�� ���� ����
		System.out.println("c1�� color=" + c1.color + ", gearType=" + c1.gearType + ", door=" + c1.door);
		System.out.println("c2�� color=" + c2.color + ", gearType=" + c2.gearType + ", door=" + c2.door);
		// c2�� c1�� �����Ͽ� ������ ���̹Ƿ� ���� ���� ���¸� ������,
		// ���� ���������� �޸� ������ �����ϴ� ������ �ν��Ͻ� �̹Ƿ� c1�� ������ ����Ǿ 2�� ������ ���� �ʴ´�
		

	}

}
