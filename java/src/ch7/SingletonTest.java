package ch7;

//�����ڿ� ���� �����ڸ� ��������ν� �ν��Ͻ��� ������ ������ �� �ִ�
//�������� ���������ڸ� private���� �����ϸ�, �ܺο��� �����ڿ� ������ �� �����Ƿ� �ν��Ͻ��� ������ �� ����
//��� �ν��Ͻ��� �����ؼ� ��ȯ���ִ� public+static �޼��带 ���������ν� �ܺο��� �� Ŭ���� �ν��Ͻ��� ����ϵ��� �� - �ν��Ͻ� ���� ���� ����
// ->�ν��Ͻ��� �������� �ʰ� ȣ���� �� �־�� �ϹǷ� static

//�����ڰ� private�� Ŭ������ �ٸ� Ŭ������ ������ �ɼ�����
//->�ڼ�Ŭ������ �ν��Ͻ��� �����Ҷ� ����Ŭ������ �����ڸ� ȣ���ؾ��ϴµ�, �������� ���������ڰ� private�̹Ƿ� �ڼ�Ŭ�������� ȣ�� �Ұ��� 
//->final �ٿ��� ����� �� ���� Ŭ������� ���� �˸��� ���� ����

//�������� ���� ���ǻ���
//1.�޼��忡 static�� abstract�� �Բ� ����Ҽ�����
//2.Ŭ������ abstract�� final�� ���ÿ� ����Ҽ�����
//3.abstract�޼����� ���������ڰ� private�ϼ�����
//4.�޼��忡 private�� final�� ���� ������ʿ����

final class Singleton { // �����ڰ� private�̱� ������ ��� �Ұ����̱� ������ final�� ����
	private static Singleton s = new Singleton();

	private Singleton() { // private ������
		// ...
	}

	public static Singleton getInstance() { // s��ü �������ִ� �޼���
		if (s == null) {
			s = new Singleton();
		}
		return s;
	}

}

class SingletonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Singleton s = new Singleton(); //�����ڰ� private�̱� ������ �����Ҽ�����
		Singleton s = Singleton.getInstance(); // public static �޼��带 ���� ����

	}

}
