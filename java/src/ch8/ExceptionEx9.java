package ch8;

public class ExceptionEx9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Exception e = new Exception("���Ƿ� �߻�������");
			throw e; //����Ŭ������ ��ü�� ���� throw�� ���� �߻���Ŵ
			// throw new Exception("���Ƿ� �߻�������");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("�����޽��� : " + e.getMessage()); //�����޽��� ���
			e.printStackTrace();
		}
		System.out.println("���α׷��� ���� ����Ǿ���");
	}

}
