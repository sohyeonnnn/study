package oop;

public class BlueHouse extends House {// House를 상속

	BlueHouse() {// 생성자 - 지붕 blue로 초기화
		super(); // door-square
		setRoof("blue");
		setWindow("square");
	}

	/*
	 * public void setWindow() { this.window = "square"; }
	 */

}
