package ch7;

class Product75 {
	int price;
	int bonusPoint;

	// �߰�
	Product75() {
	}

	Product75(int price) {
		this.price = price;
		bonusPoint = (int) (price / 10.0);
	}
}

class Tv75 extends Product75 {
	// ������ ���� ����
	// tv�� product�� ��ӹޱ⶧���� tv��ü�� �����ɶ� �����ڰ� ȣ��ǰ�
	// tv�� �����ڰ� ���� product�� �⺻�����ڸ� ȣ���ϴµ�
	// product�� �⺻�����ڰ� ����
	// -> �Ű������� �ִ� �����ڸ� ������� ������ �⺻�����ڰ� �ڵ����� ����������ʾҴ�

	// �ڼ�Ŭ������ �����ڿ��� ����Ŭ������ �����ڸ� ȣ���ؾ��ϴ� ����
	// �ڼ�Ŭ�������� ����Ŭ������ ����� ����ؾ��ϱ⶧����
	Tv75() {
	}

	public String toString() {
		return "Tv";
	}
}

public class Ex7_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv75 t = new Tv75();

	}

}
