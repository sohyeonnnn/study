package oop;

public class BlackHouse extends House {// House를 상속

	BlackHouse() { // 생성자 - 지붕 black으로 초기화
		super(); // door-square
		setRoof("black");
		setWindow("triangle");
	}

	// 오버라이딩
	/*
	 * public void setWindow() { this.window = "triangle"; }
	 */
}
