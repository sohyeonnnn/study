package ch6;

public class Tv {
	// Ŭ����(��ü ����) ---�ν��Ͻ�ȭ---> �ν��Ͻ�(��ü) ����

	// ��ü�� �Ӽ�+���=����� ����

	// tv�� �Ӽ�(�������)
	String color;
	boolean power;
	int channel;

	// tv�� ���
	void power() {
		power = !power;
	}

	void channelUp() {
		++channel;
	}

	void channelDown() {
		--channel;
	}

}
