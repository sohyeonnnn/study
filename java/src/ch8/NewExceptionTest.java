package ch8;

//checked ���� : �ݵ�� ����ó���� ���־����, ������
//unchecked ���� : �ʿ信 ���� ����ó���� ���θ� ���� ����
class NewExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			startInstall(); // ���α׷� ��ġ�� �ʿ��� �غ�
			copyFiles(); // ���� ����
		} catch (SpaceException e) {
			// TODO: handle exception
			System.out.println("�����޽��� : " + e.getMessage());
			e.printStackTrace();
			System.out.println("������ Ȯ���� �Ŀ� �ٽ� ��ġ�Ͻñ� �ٶ��ϴ�");
		} catch (MemoryException me) {
			// TODO: handle exception
			System.out.println("�����޽��� : " + me.getMessage());
			me.printStackTrace();
			System.gc(); // garbage collection�� �����Ͽ� �޸𸮸� �÷��ش�
			System.out.println("�ٽ� ��ġ�� �õ��ϼ���");
		} finally {
			deleteTempFiles(); // ���α׷� ��ġ�� ���� �ӽ����� ����
		}
	}

	static void startInstall() throws SpaceException, MemoryException {
		if (!enoughSpace()) { // ����� ��ġ ������ ������
			throw new SpaceException("��ġ�� ������ �����մϴ�");
		}
		if (!enoughMemory()) { // ����� �޸𸮰� ������
			throw new MemoryException("�޸𸮰� �����մϴ�");
		}
	}

	static void copyFiles() {
		/* ���ϵ��� �����ϴ� �ڵ带 ���´� */}

	static void deleteTempFiles() {
		/* �ӽ����ϵ��� �����ϴ� �ڵ带 ���´� */}

	static boolean enoughSpace() {
		// ��ġ�ϴµ� �ʿ��� ������ �ִ��� Ȯ���ϴ� �ڵ带 ���´�
		return false;
	}

	static boolean enoughMemory() {
		// ��ġ�ϴµ� �ʿ��� �޸𸮰����� �ִ��� Ȯ���ϴ� �ڵ�
		return true;
	}
}

class SpaceException extends Exception {
	SpaceException(String msg) {
		super(msg);
	}
}

class MemoryException extends Exception {
	public MemoryException(String msg) {
		super(msg);
	}
}