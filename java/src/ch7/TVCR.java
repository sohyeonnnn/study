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

//�ڹٿ����� ���ϻ�Ӹ� ��� - ��ӹ��� ������� �̸��� ������ �� �ִ� ����� ����
public class TVCR extends Tv { // tvcr is a tv ��Ӱ��� - power,channel ��� ����
	VCR vcr = new VCR(); // tvcr has a vcr ���԰���
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
