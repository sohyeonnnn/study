package ch2;

public class FloatToBinEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float f = 9.1234567f;
		int i = Float.floatToIntBits(f); // floatŸ���� ���� intŸ���� ������ �ؼ��ؼ� ��ȯ

		System.out.printf("%f%n", f);
		System.out.printf("%X%n", i);
	}

}
