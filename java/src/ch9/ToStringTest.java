package ch9;

public class ToStringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = new String("KOREA");
		java.util.Date today = new java.util.Date();

		System.out.println(str);
		// StringŬ������ toString�� String �ν��Ͻ��� �����ִ� ���ڿ��� ��ȯ�ϵ��� �������̵��Ǿ��ִ�
		System.out.println(str.toString());
		System.out.println(today);
		// Date�ν��Ͻ��� �����ִ� ��¥�� �ð��� ���ڿ��� ��ȯ�Ͽ� ��ȯ�ϵ��� �������̵�
		System.out.println(today.toString());
	}

}
