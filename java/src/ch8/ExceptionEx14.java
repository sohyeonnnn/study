package ch8;

public class ExceptionEx14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			method1(); //���� �߻�
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("main�޼��忡�� ���ܰ� ó���Ǿ����ϴ�"); //catch���� ó��
		}
	}

	static void method1() throws Exception {
		throw new Exception(); //���� �߻�
	}
}
