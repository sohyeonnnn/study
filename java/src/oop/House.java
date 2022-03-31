package oop;

public abstract class House implements HouseInterface { // HouseInterface를 구현
	// protected - 같은 패키지, 자손클래스에서 접근가능
	private String window;
	private String roof;
	private static String door; // 모든 인스턴스의 문모양은 동일하기 때문에 static -> 주의해서 사용해야함

	public House() { // 기본 생성자
		door = "square"; // 모든 집의 문은 square
	}

	// 추상메서드-미완성
	/* public abstract void setWindow(); */

	public void setWindow(String window) {
		this.window = window;
	}

	// 지붕 색 set
	public void setRoof(String roof) {
		this.roof = roof;
	}

	// 출력 메서드
	public void printInfo() {
		System.out.println("window : " + window + ", roof : " + roof + ", door : " + door);
	}

}
