package ch8;

public class FinallyTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// method1()�� static�޼����̹Ƿ� �ν��Ͻ� �������� ����ȣ���� �����ϴ�
		FinallyTest3.method1();
		System.out.println("method1()�� ������ ��ġ�� main�޼���� ���ƿԽ��ϴ�");// 3
	}

	static void method1() {
		try {
			System.out.println("method1()�� ȣ��Ǿ����ϴ�");// 1
			return;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			System.out.println("method1()�� finally���� ����Ǿ����ϴ�");// 2
			//return���� ����Ǵ� ��쿡�� finally���� ���� ����->����
		}
	}

}
