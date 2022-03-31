package oop;

public abstract class House implements HouseInterface { // HouseInterface�� ����
	// protected - ���� ��Ű��, �ڼ�Ŭ�������� ���ٰ���
	private String window;
	private String roof;
	private static String door; // ��� �ν��Ͻ��� ������� �����ϱ� ������ static -> �����ؼ� ����ؾ���

	public House() { // �⺻ ������
		door = "square"; // ��� ���� ���� square
	}

	// �߻�޼���-�̿ϼ�
	/* public abstract void setWindow(); */

	public void setWindow(String window) {
		this.window = window;
	}

	// ���� �� set
	public void setRoof(String roof) {
		this.roof = roof;
	}

	// ��� �޼���
	public void printInfo() {
		System.out.println("window : " + window + ", roof : " + roof + ", door : " + door);
	}

}
