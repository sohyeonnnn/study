package oop2;

public class Door implements HouseIF {

	private String shape;

	public Door() {
		super();
	}

	public Door(String shape) {
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

	@Override
	public void make() {
		toString();
		
	}
	
	

}
