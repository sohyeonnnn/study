package ch2;

public class OverflowEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short sMin = -32768;
		short sMax = 32767;
		char cMin = 0;
		char cMax = 65535;

		// �ּҰ����� 1�� ���� �ִ밪�� �ǰ�
		// �ִ밪�� 1�� ���ϸ� �ּҰ��� �ȴ�
		System.out.println("sMin=" + sMin);
		System.out.println("sMin-1=" + (short) (sMin - 1));
		System.out.println("sMax=" + sMax);
		System.out.println("sMax=" + (short) (sMax + 1));
		System.out.println("cMin=" + (int) cMin);
		System.out.println("cMin=" + (int) --cMin);
		System.out.println("cMax=" + (int) cMax);
		System.out.println("cMax=" + (int) ++cMax);
	}

}
