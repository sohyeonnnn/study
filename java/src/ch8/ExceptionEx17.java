package ch8;

//�� �޼��忡�� �߻��� �� �ִ� ���ܰ� �����ΰ��, ��� try-catch���� ���ؼ� �޼��峻���� ��ü������ ó��
//�� �������� ����ο� �����Ͽ� ȣ���� �޼��忡�� ó����
//�� �ϳ��� ���ܿ� ���ؼ��� ���ܰ� �߻��� �޼���� ȣ���� �޼���, ���ʿ��� ó�� ����
//-> ���ܸ� ó���� �Ŀ� ���������� �ٽ� �߻���Ű�� ����� ���ؼ� ���� : ���� �Ǵ�����(exception re-throwing)

public class ExceptionEx17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			method1();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("main�޼��忡�� ���ܰ� ó���Ǿ����ϴ�"); // ���� ó��2
		}
	}

	static void method1() throws Exception {
		try {
			throw new Exception(); // ���� �߻�
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("method1�޼��忡�� ���ܰ� ó���Ǿ����ϴ�"); // ���� ó��1
			throw e; // ���� �߻�
		}
	}
}
