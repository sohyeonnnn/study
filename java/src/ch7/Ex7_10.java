package ch7;

class MyTv2 {
	boolean isPowerOn;
	int channel;
	int volume;
	int prevCh;

	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;

	// setter
	void setVolume(int volume) {
		if (volume <= MAX_VOLUME && volume >= MIN_VOLUME)
			this.volume = volume;

		else
			System.out.println("�ٽ� �����ϼ���");
	}

	void setChannel(int channel) {
		if (channel <= MAX_CHANNEL && channel >= MIN_CHANNEL) {
			prevCh = this.channel; // ������ ���� ä�� ����
			this.channel = channel;
		} else
			System.out.println("�ٽ� �����ϼ���");
	}

	// getter
	int getVolume() {
		return volume;
	}

	int getChannel() {
		return channel;
	}

	// ���� ä�η� ����
	void gotoPrevChannel() {
		setChannel(prevCh);// setter�̿� -> ����ä�� ������ �ִ� ä�η� ����
	}
}

public class Ex7_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyTv2 t = new MyTv2();

		t.setVolume(20);
		System.out.println("vol: " + t.getVolume());
		t.setChannel(10); // 10
		System.out.println("�ʱ� ch: " + t.getChannel());
		t.setChannel(20); // 20���� ����
		System.out.println("���� ch: " + t.getChannel());
		t.gotoPrevChannel();
		System.out.println("���� ch: " + t.getChannel());
		t.gotoPrevChannel();
		System.out.println("���� ch: " + t.getChannel());

	}

}
