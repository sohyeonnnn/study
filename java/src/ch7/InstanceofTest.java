package ch7;

//���������� �����ϰ� �ִ� �ν��Ͻ��� ���� Ÿ���� �˾ƺ��� �� : instanceof ������
public class InstanceofTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FireEngine fe = new FireEngine();

		// � Ÿ�Կ� ���� instanceof������ ����� true��� ����
		// �˻��� Ÿ������ ����ȯ�� �����ϴٴ� ��

		if (fe instanceof FireEngine) { // true
			System.out.println("This is a fireEngine instance");
		}

		if (fe instanceof Car) {// true -���
			System.out.println("This is a Car instance");
		}

		if (fe instanceof Object) {// true -���
			System.out.println("This is an Object instance");
		}
		System.out.println(fe.getClass().getName()); // Ŭ���� �̸��� ���
	}

}
