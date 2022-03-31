package ch12;

enum Transportation {
	BUS(100) {int fare(int distance) {return distance*BASIC_FARE;}},
	TRAIN(150) {int fare(int distance) {return distance*BASIC_FARE;}},
	SHIP(100) {int fare(int distance) {return distance*BASIC_FARE;}},
	AIRPLANE(300) {int fare(int distance) {return distance*BASIC_FARE;}};

	protected final int BASIC_FARE; //protected�� �ؾ� �� ������� ���ٰ���

	Transportation(int basicFare) {
		BASIC_FARE = basicFare;
	}

	public int getBasicFare() {
		return BASIC_FARE;
	}

	abstract int fare(int distance); //�Ÿ��� ���� ��ݰ���ϴ� �߻�޼��� - �� ������ ����� �� �ż��带 �ݵ�� �����ؾ���
}

public class EnumEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("bus fare=" + Transportation.BUS.fare(100)); //10000
		System.out.println("train fare=" + Transportation.TRAIN.fare(100)); //15000
		System.out.println("ship=" + Transportation.SHIP.fare(100)); //10000
		System.out.println("airplane=" + Transportation.AIRPLANE.fare(100)); //30000
	}

}
