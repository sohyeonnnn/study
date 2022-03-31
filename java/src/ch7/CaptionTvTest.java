package ch7;

class Tv {
	boolean power; // 인스턴스변수
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

class CaptionTv extends Tv { // Tv를 상속받은 자식 클래스 , 변수 power, channel 사용가능
	boolean caption; // 자동으로 초기화 : false

	void displayCaption(String text) {
		if (caption) {
			System.out.println(text);
		}
	}
}

public class CaptionTvTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CaptionTv ctv = new CaptionTv(); // CaptionTv 객체 생성
		ctv.channel = 10;
		ctv.channelUp();
		System.out.println(ctv.channel);
		ctv.displayCaption("Hello, World11"); // caption이 false이기 때문에 출력x
		ctv.caption = true;
		ctv.displayCaption("Hello, World22");

	}

}
