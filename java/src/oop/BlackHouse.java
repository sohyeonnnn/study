package oop;

public class BlackHouse extends House {// House�� ���

	BlackHouse() { // ������ - ���� black���� �ʱ�ȭ
		super(); // door-square
		setRoof("black");
		setWindow("triangle");
	}

	// �������̵�
	/*
	 * public void setWindow() { this.window = "triangle"; }
	 */
}
