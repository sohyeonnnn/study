package ch8;

public class FinallyTest {

	// finally���� ������ �߻����ο� ������� ����Ǿ���� �ڵ带 ���Խ�ų �������� ���
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			startInstall(); // ���α׷� ��ġ�� �ʿ��� �غ�
			copyFiles(); // ���� ����
			deleteTempFiles(); // ���α׷� ��ġ�� ���� �ӽ����� ����
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			// ���ܰ� �߻��ϴ��� �ӽ����ϵ��� �����ǵ���
			deleteTempFiles(); // ���α׷���ġ�� ���� �ӽ����� ����
		}
	}

	static void startInstall() {
		/* ���α׷� ��ġ�� �ʿ��� �غ� �ϴ� �ڵ带 ���´� */}

	static void copyFiles() {
		/* ������ �����ϴ� �ڵ带 ���´� */}

	static void deleteTempFiles() {
		/* �ӽ����ϵ��� �����ϴ� �ڵ带 ���´� */}
}
