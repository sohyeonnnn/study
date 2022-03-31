package oop2;

public class Window {

	private String shape;

	public Window() {
		super();
	}

	public Window(String shape) {
		super();
		this.shape = shape;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public String toString() {
		return shape;
	}
}
