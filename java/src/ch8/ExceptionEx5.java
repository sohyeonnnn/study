package ch8;

public class ExceptionEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0); //0���� ������ ���Ƿ� ArithmeticExeption �߻�
			System.out.println(4); //catch�� �ٷ� ���� ������ ����x
		} catch (ArithmeticException ae) {
			// TODO: handle exception
			System.out.println(5); 
		}
		System.out.println(6);
	}

}
