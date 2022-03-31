package ch7;

class VCR {
	boolean power;
	int counter = 0;

	void power() {
		power = !power;
	}

	void play() {
	}

	void stop() {
	}

	void rew() {
	}

	void ff() {
	}

}

//자바에서는 단일상속만 허용 - 상속받은 멤버간의 이름을 구별할 수 있는 방법이 없다
public class TVCR extends Tv { // tvcr is a tv 상속관계 - power,channel 사용 가능
	VCR vcr = new VCR(); // tvcr has a vcr 포함관계
	int counter = vcr.counter;

	void play() {
		vcr.play();
	}

	void stop() {
		vcr.stop();
	}

	void rew() {
		vcr.rew();
	}

	void ff() {
		vcr.ff();
	}

}
