package ch7;

public class CastingTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car = new Car();
		Car car2 = null;
		FireEngine fe = null;

		car.drive();
		fe = (FireEngine) car; // �������� o, ����� ����
		// ����Ÿ���� �ν��Ͻ��� �ڼ�Ÿ���� ���������� �����ϴ� ���� �ȵȴ�
		// �ڼ�Ÿ���� �����Ҽ� �ִ� ����� �� ���� ������
		fe.drive();
		car2 = fe;
		car2.drive();
	}

}
