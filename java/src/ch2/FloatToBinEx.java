package ch2;

public class FloatToBinEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float f = 9.1234567f;
		int i = Float.floatToIntBits(f); // float타입의 값을 int타입의 값으로 해석해서 반환

		System.out.printf("%f%n", f);
		System.out.printf("%X%n", i);
	}

}
