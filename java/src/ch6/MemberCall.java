package ch6;

public class MemberCall {

	int iv = 10; // �ν��Ͻ�����
	static int cv = 20; // Ŭ��������
	int iv2 = cv; // �ν��Ͻ�����
	// static int cv2=iv; //Ŭ���������� �ν��Ͻ������� ��� �Ұ�
	static int cv2 = new MemberCall().iv; // ��ü�� �����ؾ� ��밡��

	static void staticMethod1() {
		System.out.println(cv); // Ŭ���� �����̹Ƿ� ��� ����
		// System.out.println(iv); // Ŭ�����޼��忡�� �ν��Ͻ����� ��� �Ұ�
		MemberCall c = new MemberCall();
		System.out.println(c.iv); // ��ü�� ������ �� ��밡��
	}

	void instanceMethod1() {
		System.out.println(cv); //Ŭ��������
		System.out.println(iv); //�ν��Ͻ�����
	}

	static void staticMethod2() {
		staticMethod1();
		// instanceMethod1(); //�ν��Ͻ��޼��� ȣ�� �Ұ���
		MemberCall c = new MemberCall();
		c.instanceMethod1();
	}

	void instanceMethod2() {
		staticMethod1(); // �ν��Ͻ��޼��� ȣ�� ����
		instanceMethod1(); // Ŭ�����޼��� ȣ�� ����
	}

}
