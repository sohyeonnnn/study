package ch8;

public class FinallyTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			startInstall();
			copyFiles();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally { //�� ������ �ڵ忡�� finally�� �߰�
			deleteTempFiles();
		}
	}

	static void startInstall() {
		/* ���α׷� ��ġ�� �ʿ��� �غ� �ϴ� �ڵ带 ���´� */}

	static void copyFiles() {
		/* ������ �����ϴ� �ڵ带 ���´� */}

	static void deleteTempFiles() {
		/* �ӽ����ϵ��� �����ϴ� �ڵ带 ���´� */}
}
