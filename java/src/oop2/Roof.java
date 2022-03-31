package oop2;

public class Roof  {

	// color 말고도 shape, size 등 추가될수 있기 때문에 클래스로 생성
	private String color;

	public Roof() {
		super();
	}

	public Roof(String color) {
		super();
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String toString() {
		return color;
	}

}
