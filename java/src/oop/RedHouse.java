package oop;

public class RedHouse extends House {// House를 상속

	RedHouse() { // 생성자 - 지붕 red로 초기화
		super(); // door-square
		setRoof("red");
		setWindow("circle");
	}

	/*
	 * public void setWindow() { this.window = "circle"; }
	 */

}
