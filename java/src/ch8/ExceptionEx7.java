package ch8;

public class ExceptionEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0 / 0); // ArithmeticException �߻�
			System.out.println(4);// ����x
		} catch (ArithmeticException ae) {
			// TODO: handle exception
			if (ae instanceof ArithmeticException) //� �������� Ȯ��
				System.out.println("true");
			System.out.println("ArithmeticException");
		} catch (Exception e) { //ArithmeticException�� ������ ��� ���ܰ� ó��
			System.out.println("exception");
		}
		System.out.println(6);
	}

}
