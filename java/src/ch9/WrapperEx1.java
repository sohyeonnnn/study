package ch9;

public class WrapperEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer i = new Integer(100);
		Integer i2 = new Integer(100);

		System.out.println("i==i2 ? " + (i == i2)); // �ٸ� �ν��Ͻ��� �ּҰ��� �ٸ��Ƿ� false
		System.out.println("i.equals(i2) ? " + i.equals(i2)); // ���� �����Ƿ� true
		System.out.println("i.compareTo(i2) ? " + i.compareTo(i2));
		System.out.println("i.toString()=" + i.toString());

		System.out.println("MAX_VALUE=" + Integer.MAX_VALUE); // �ִ밪
		System.out.println("MIN_VALUE=" + Integer.MIN_VALUE); // �ּҰ�
		System.out.println("SIZE=" + Integer.SIZE + "bits"); // bits
		System.out.println("BYTES=" + Integer.BYTES + "bytes"); // bytes
		System.out.println("TYPE=" + Integer.TYPE); // Ÿ��

	}

}
