package ch7;

//������ : ����Ŭ���� Ÿ���� ���������� �ڼ�Ŭ������ �ν��Ͻ� �������� -�ڼ��� ��� ����� ���� ������ ���� �ƴ�
// �ݴ�(�ڼ�Ŭ������ ����Ŭ���� �ν��Ͻ� ����) ���� �Ұ��� - �ڼ��� ����� �� ����
//���������� ����� �� �ִ� ����� ������ �ν��Ͻ��� ��� �������� ���ų� ������Ѵ�

//���������� ����ȯ
//���� ��Ӱ��迡 �ִ� Ŭ�������̿����� ����
//����ȯ�� �����ϰ� �ִ� �ν��Ͻ����� ����Ҽ��ִ� ����� ���� ���� ����

class CastingTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;

		fe.water(); // water~
		car = fe; // ��ĳ���� (��������)
		// car.water(); //carŸ�����δ� water�� ȣ���Ҽ�����
		fe2 = (FireEngine) car; // �ٿ�ĳ����(�����Ұ���)
		fe2.water(); // fireEngine�� water ȣ�� ����

	}
}

class Car {
	String color;
	int door;

	void drive() {
		System.out.println("drive,brrr~");
	}

	void stop() {
		System.out.println("stop!!!");
	}
}

class FireEngine extends Car { // car�� ��ӹ޾� color,door��� ����
	void water() { // drive(),stop()�� ��밡��
		System.out.println("water~~~");
	}
}
