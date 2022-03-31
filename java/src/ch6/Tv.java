package ch6;

public class Tv {
	// 클래스(객체 정의) ---인스턴스화---> 인스턴스(객체) 생성

	// 객체는 속성+기능=멤버의 집합

	// tv의 속성(멤버변수)
	String color;
	boolean power;
	int channel;

	// tv의 기능
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
