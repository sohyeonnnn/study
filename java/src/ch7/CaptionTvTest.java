package ch7;

class Tv {
	boolean power; // �ν��Ͻ�����
	int channel;

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

class CaptionTv extends Tv { // Tv�� ��ӹ��� �ڽ� Ŭ���� , ���� power, channel ��밡��
	boolean caption; // �ڵ����� �ʱ�ȭ : false

	void displayCaption(String text) {
		if (caption) {
			System.out.println(text);
		}
	}
}

public class CaptionTvTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CaptionTv ctv = new CaptionTv(); // CaptionTv ��ü ����
		ctv.channel = 10;
		ctv.channelUp();
		System.out.println(ctv.channel);
		ctv.displayCaption("Hello, World11"); // caption�� false�̱� ������ ���x
		ctv.caption = true;
		ctv.displayCaption("Hello, World22");

	}

}
