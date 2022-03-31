package ch8;

public class TryWithResourceEx {

	// try-with-resources���� ��ȣ�ȿ� ��ü�� �����ϴ� ������ ������,
	// �� ��ü�� ���� close()�� ȣ������ �ʾƵ� try���� ����� ���� �ڵ������� close()�� ȣ��
	// - > Ŭ������ AutoCloseable�̶�� �������̽��� ������ ���̾�� �Ѵ�

	public static void main(String[] args) {
		try (CloseableResource cr = new CloseableResource()) {
			cr.exceptionWork(false); // ���� �߻���������
		} catch (WorkException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println();

		try (CloseableResource cr = new CloseableResource()) {
			cr.exceptionWork(true); //���� �߻�
			//exceptionWork()���� �߻��� ���ܿ� ���� ���� ���, close() ���
			//�� ���ܰ� ���ÿ� �߻��� ���� ���� ������ 
			//���� �߻��� ���ܸ� WorkException����, CloseException�� ������ ���ܷ� �ٷ��
		} catch (WorkException e) {
			e.printStackTrace();
		} catch (CloseException e) {
			e.printStackTrace();
		}
	}
}

//�ΰ��� try-catch���� �ִµ�, ù��° ���� close()������ ���ܹ߻�
//�ι�° ���� exceptionWorl()�� close()���� ��� ���� �߻�


class CloseableResource implements AutoCloseable {
	public void exceptionWork(boolean exception) throws WorkException {
		System.out.println("exceptionWork(" + exception + ")�� ȣ���");
		if (exception) {
			throw new WorkException("WorkException�߻�!!");
		}
	}

	public void close() throws CloseException {
		System.out.println("close()�� ȣ���");
		throw new CloseException("CloseException�߻�!!");
	}
}

class WorkException extends Exception {
	WorkException(String msg) {
		super(msg);
	}
}

class CloseException extends Exception {
	 CloseException(String msg) {
		super(msg);
	}
}