package ch6;

// ������
// �ν��Ͻ��� �����ɶ� ȣ��Ǵ� '�ν��Ͻ� �ʱ�ȭ �޼���'
// 1. Ŭ������ �̸��� ���ƾ��Ѵ�
// 2. ���ϰ��� ����

// ������ new�� �ν��Ͻ��� �����ϴ°����� �����ڰ� �ν��Ͻ��� �����ϴ� ���� �ƴϴ�

class Data1 {
	int value;
}

class Data2 {
	int value;

	Data2(int x) { // �Ű������� �ִ� ������
		value = x;
	}
}

public class ConstrutorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data1 d1 = new Data1();
		// Data d2 = new Data2();
		// ������ ���� �߻�!
		// Data2()�� ���ǵǾ����� ����
		// Data2(int x)�� �־ �⺻�����ڰ� �ڵ����� ����������ʾ���

		// **�⺻ �����ڰ� �����Ϸ��� ���ؼ� �߰��Ǵ� ���� Ŭ������ ���ǵ� �����ڰ� �ϳ��� ������**
	}

}
