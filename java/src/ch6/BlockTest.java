package ch6;

public class BlockTest {

	// BlockTest�� �޸𸮿� �ε��ɶ�, Ŭ���� �ʱ�ȭ ���� ���� ���� ����Ǿ� static{}�� ȭ�鿡 ���
	// �� ������ main�� ����Ǿ� BlockTest�ν��Ͻ��� �����Ǹ鼭 �ν��Ͻ� �ʱ�ȭ ���� ���� ����ǰ�, �����ڰ� ����

	// Ŭ���� �ʱ�ȭ ���� ó�� �޸𸮿� �ε��ɶ� �ѹ��� ����Ǿ�����
	// �ν��Ͻ� �ʱ�ȭ ���� �ν��Ͻ��� �����ɶ����� ����

	static { // Ŭ���� �ʱ�ȭ ��
		System.out.println("static { }");//1
	}

	{ // �ν��Ͻ� �ʱ�ȭ ��
		System.out.println("{ }");//3
	}

	public BlockTest() {
		System.out.println("������");//4 , 6
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("BlockTest bt=new BlockTest();");//2
		BlockTest bt = new BlockTest();

		System.out.println("BlockTest bt2=new BlockTest();");//5
		BlockTest bt2 = new BlockTest();
	}

}
