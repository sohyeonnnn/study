package ch6;

//��������
//�Ű������� ������ �������� ����
//Ÿ��...������ �������� ����, �Ű����� �߿��� ���� �������� ����
public class VarArgsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strArr = { "100", "200", "300" };

		System.out.println(concatenate("", "100", "200", "300"));
		System.out.println(concatenate("=", strArr));
		System.out.println(concatenate(",", new String[] { "1", "2", "3" }));
		System.out.println("[" + concatenate(",", new String[0]) + "]");
		System.out.println("[" + concatenate(",") + "]");

	}

	// �Ű������� �Էµ� ���ڿ��� �����ڸ� ���̿� ���Խ��� �����ؼ� ��ȯ
	// �������ڷ� �Ű������� �����߱� ������ ���ڿ��� ������ ������� �Ű������� ����

	static String concatenate(String delim, String... args) {
		String result = "";

		for (String str : args) {
			result += str + delim;
		}
		return result;
	}

	// �������ڸ� ����� �޼���� �����ε����� �ʴ� ���� ����

	/*
	 * static String concatenate(String... args) { return concatenate("", args); }
	 */

}