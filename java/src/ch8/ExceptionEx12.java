package ch8;

public class ExceptionEx12 {

	// ���ܸ� �޼��忡 ���� throws(throw�� ���ܸ� �߻���ų��)
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		method1();
	}

	static void method1() throws Exception { // ���� ����
		method2();
	}

	static void method2() throws Exception { // ���� ����
		throw new Exception(); // ���� �߻�
	}

	//���ܰ� �߻����� �� 3���� �޼��� ��ΰ� ȣ�⽺�ÿ� ����
	//���ܰ� �߻��� ���� ���� ���ٿ� �ִ� method2
	// main -> method1 -> method2 ȣ��

}