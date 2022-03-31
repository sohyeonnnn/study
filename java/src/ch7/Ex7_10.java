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
			System.out.println("다시 설정하세요");
	}

	void setChannel(int channel) {
		if (channel <= MAX_CHANNEL && channel >= MIN_CHANNEL) {
			prevCh = this.channel; // 변수에 현재 채널 저장
			this.channel = channel;
		} else
			System.out.println("다시 설정하세요");
	}

	// getter
	int getVolume() {
		return volume;
	}

	int getChannel() {
		return channel;
	}

	// 이전 채널로 변경
	void gotoPrevChannel() {
		setChannel(prevCh);// setter이용 -> 이전채널 변수에 있는 채널로 변경
	}
}

public class Ex7_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyTv2 t = new MyTv2();

		t.setVolume(20);
		System.out.println("vol: " + t.getVolume());
		t.setChannel(10); // 10
		System.out.println("초기 ch: " + t.getChannel());
		t.setChannel(20); // 20으로 변경
		System.out.println("변경 ch: " + t.getChannel());
		t.gotoPrevChannel();
		System.out.println("이전 ch: " + t.getChannel());
		t.gotoPrevChannel();
		System.out.println("이전 ch: " + t.getChannel());

	}

}
