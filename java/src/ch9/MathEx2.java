package ch9;

import static java.lang.Math.*;
import static java.lang.System.*;

public class MathEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = Integer.MIN_VALUE;// �������� �ּҰ�

		out.println("i=" + i);
		out.println("-i=" + (-i)); //�����÷ο� �߻� - int�� �ּҰ��� �ٽ� ������ ���� �Ǿ����

		try {
			out.printf("negateExact(%d)=%d%n", 10, negateExact(10));
			out.printf("negateExact(%d)=%d%n", -10, negateExact(-10));
			out.printf("negateExact(%d)=%d%n", i, negateExact(i)); // ���� �߻�

		} catch (Exception e) {
			// TODO: handle exception
			// i�� longŸ������ ����ȯ ������ negateExact(long a) ȣ��
			out.printf("negateExact(%d)=%d%n", (long) i, negateExact((long) i));
		}

	}

}
