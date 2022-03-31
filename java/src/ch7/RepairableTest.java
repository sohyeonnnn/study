package ch7;

//�������̽��� ����
//���߽ð� ����, ǥ��ȭ ����, ���� ������� Ŭ������ ���� �ο�, ������ ���α׷��� ����

class RepairableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tank tank = new Tank();
		Dropship dropshop = new Dropship();
		Marine marine = new Marine();
		SCV scv = new SCV();
		scv.repair(tank);
		scv.repair(dropshop);
		//marine�� repairable�������̽��� �������� �ʾұ� ������ repair�� �Ű����� �ڸ��� ���� ����
		// scv.repair(marine); 

	}

}

interface Repairable { // �������̽�
}

class Unit11 { // unitŬ������ hitPoint,MAX_HP�� ����� ������
	int hitPoint;
	final int MAX_HP;

	Unit11(int hp) { // max_hp �ʱ�ȭ �ϴ� ������
		MAX_HP = hp;
	}
}

class GroundUnit extends Unit11 { // unit�� ��ӹ޴� groundunit
	GroundUnit(int hp) { // ������
		super(hp);
	}
}

class AirUnit extends Unit11 { // unit�� ��ӹ޴� airunit
	AirUnit(int hp) { // ������
		super(hp);
	}
}

class Tank extends GroundUnit implements Repairable { // �������̽� ����, ground ���
	Tank() { // ������
		super(150); // groundunit�� ������
		hitPoint = MAX_HP;
	}

	public String toString() { // �������̵�
		return "Tank";
	}
}

class Dropship extends AirUnit implements Repairable {// �������̽� ����, air ���

	Dropship() { // ������
		super(125);// airunit�� ������
		hitPoint = MAX_HP;
	}

	public String toString() { // �������̵�
		return "Dropship";
	}
}

class Marine extends GroundUnit { // ground�� ���
	Marine() {
		super(40);
		hitPoint = MAX_HP;
	}
}

class SCV extends GroundUnit implements Repairable { // �������̽� ����, ground ���
	SCV() {
		super(60);
		hitPoint = MAX_HP;
	}

	void repair(Repairable r) { // �������̽��� ������ �ν��Ͻ��� �Ű������� �޾Ƽ� repair�ϴ� �޼���
		if (r instanceof Unit11) {
			Unit11 u = (Unit11) r;
			while (u.hitPoint != u.MAX_HP) {
				u.hitPoint++; // hitpoint����
			}
			System.out.println(u.toString() + "�� ������ �������ϴ�");
		}
	}
}
