package ch8;

public class ExceptionEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 100;
		int result = 0;

		for (int i = 0; i < 10; i++) {
			try {
				result = number / (int) (Math.random() * 10);
				//0���� ������ ������ �߻��� ���ɼ� �ֱ� ������ try�ȿ� ��
				System.out.println(result);
			} catch (ArithmeticException e) {
				// TODO: handle exception
				System.out.println("0"); //���� ó��
			}
		}
	}

}
