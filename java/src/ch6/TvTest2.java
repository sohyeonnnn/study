package ch6;

public class TvTest2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		System.out.println("t1�� ä�ΰ��� " + t1.channel + "�Դϴ�");
		System.out.println("t2�� ä�ΰ��� " + t2.channel + "�Դϴ�");

		t1.channel = 7; // ä�� ����
		System.out.println("t1�� ä�ΰ��� " + t1.channel + "�Դϴ�"); // ����� �� ���
		System.out.println("t2�� ä�ΰ��� " + t2.channel + "�Դϴ�");

	}

}
