package ch7;

//����κ��� �̾Ƽ� UnitŬ���� ����
abstract class Unit17 {
	int x, y;

	// Ŭ�������� �̵��ϴ� ����� �ٸ��Ƿ� �߻�޼���
	abstract void move(int x, int y);

	void stop() {
		/* ���� ��ġ�� ���� */
	}
}

class Marine17 extends Unit17 {
	void move(int x, int y) {
		/* ������ ��ġ�� �̵� */
	}

	void stimPack() {
		/* �������� ����Ѵ� */
	}
}

class Tank17 extends Unit17 {
	void move(int x, int y) {
		/* ������ ��ġ�� �̵� */
	}

	void changeMode() {
		/* ���ݸ�带 ��ȯ�Ѵ� */
	}
}

class Dropship17 extends Unit17 {
	void move(int x, int y) {
		/* ������ ��ġ�� �̵� */
	}

	void load() {
		/* ���õ� ����� �¿�� */
	}

	void unload() {
		/* ���õ� ����� ������ */
	}
}
