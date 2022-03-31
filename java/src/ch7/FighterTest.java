package ch7;

//�߻�Ŭ���� abstract

//�̿ϼ�����, �ν��Ͻ� ���� �Ұ���, ����� ���� �ڼ�Ŭ������ ���ؼ� �ϼ�
//�߻�Ŭ���� ��ü�δ� Ŭ�����μ��� ������ �� ��������, ���ο� Ŭ������ �ۼ��ϴµ� �־ ������ �Ǵ� ����Ŭ�����μ� �߿��� �ǹ�
//�߻�Ŭ������ �߻�޼��带 �����ϰ� �ִٴ� ���� �����ϰ�� �Ϲ�Ŭ������ ���� �ٸ�������

//�߻�޼��� : ����θ� �ۼ�, �����δ� �ۼ�x
//�޼����� ������ ��ӹ޴� Ŭ������ ���� �޶��� �� �ֱ� ������ 
//�ּ����� � ����� ������ �������� �ۼ��Ǿ����� �˷��ְ�, ���������� ��ӹ޴� Ŭ�������� �����ϵ���

//��� : �ڼ�Ŭ������ ����µ� ����Ŭ������ ����ϴ°�
//�߻�ȭ : ������ Ŭ������ ����κ��� �̾Ƽ� ����Ŭ������ ����°�

//abstract�� ���̴� ����: �ڼ�Ŭ�������� �߻�޼��带 �ݵ�� �����ϵ��� �����ϱ� ���ؼ�

//�������̽� : ���� �߻�޼���� ������� ������ �ִ� ������ �߻�Ŭ����, �ۼ��Ҷ� class ��� interface Ű����
//1. ��� ��������� public static final�̾�� �ϸ�, ��������
//2. ��� �޼���� public abstract�̾���ϸ�, �������� 
//**jdk1.8���� �������̽��� static�޼���� default�޼����� �߰��� ���

//�������̽��� �������̽��κ��͸� ��Ӱ���, Ŭ������ �޸� ���߻�� ����
//�� ��ü�� �ν��Ͻ� ����X -> �������̽� �����ؾ��� implements
//�������̽��� �Ϻ� �޼��常 �����Ѵٸ�, abstract�� �ٿ��� �߻�Ŭ������ ����
//��Ӱ� ������ ���ÿ� �Ҽ����ִ�

class FighterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fighter f = new Fighter();

		// ��� ����
		if (f instanceof Unit) {
			System.out.println("f�� unit�� �ڼ��Դϴ�");
		}
		if (f instanceof Fightable) {
			System.out.println("f�� fightable�������̽��� ����");
		}
		if (f instanceof Movable) {
			System.out.println("f�� movable�������̽��� ����");
		}
		if (f instanceof Attackable) {
			System.out.println("f�� attackable�������̽��� ����");
		}
		if (f instanceof Object) {
			System.out.println("f�� objectŬ������ �ڼ�");
		}

	}

}

class Fighter extends Unit implements Fightable { // unit�� ��ӹް�, fightable �������̽��� ����
	public void move(int x, int y) { // �޼��� ����
		/* ������� */
		// �������̵��Ҷ��� ������ �޼��庸�� ���� ������ ���������ڸ� �����ؾ���
		// movable, attackable�� move�޼����� ���������ڴ� public abstract�̹Ƿ� public
	}

	public void attack(Unit u) { // �޼��� ����
		/* ������� */
	}
}

class Unit {
	int currentHP; // ü��
	int x; // x��ǥ
	int y; // y��ǥ
}

interface Fightable extends Movable, Attackable { // �������̽� movable,attackable�� ���
}

interface Movable { // �������̽�
	void move(int x, int y);
}

interface Attackable { // �������̽�
	void attack(Unit u);
}
