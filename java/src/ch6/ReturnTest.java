package ch6;

public class ReturnTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReturnTest r = new ReturnTest(); // ��ü ����

		int result = r.add(3, 5); // 8
		System.out.println(result);

		int[] result2 = { 0 }; // �迭�� �����ϰ� result2[0]�� ���� 0���� �ʱ�ȭ
		r.add(3, 5, result2); // �迭�� add�޼����� �Ű������� ����
		System.out.println(result2[0]); // 8
	}

	int add(int a, int b) {
		return a + b;

	}

	void add(int a, int b, int[] result) {
		result[0] = a + b; // �Ű������� �Ѱܹ��� �迭�� �������� ����
		//�̰��� �����ϸ� ���� ���� ���� ��ȯ�޴� �Ͱ� ���� ȿ���� ���� �ִ�
	}

}
