package ch7;

class InnerEx3 {
	private int outerIv = 0;
	static int outerCv = 0;

	class InstanceInner {
		// ����Ŭ�������� �ܺ�Ŭ������ ���� ���� ����
		int iiv = outerIv; // ���� Ŭ���� ���̶� private�̾ ��� ����
		int iiv2 = outerCv;
	}

	static class StaticInner {
		// ����ƽ Ŭ������ �ܺ� Ŭ������ �ν��Ͻ� ����� ������ �� ����
		// int siv=outerIv;
		static int scv = outerCv;
	}

	void myMethod() {
		final int lv = 0;
		final int LV = 0; //1.8���ʹ� final ��������
		//����� constant pool���� ���� ���� - �޼��尡 ����Ǿ ��� ��� ����

		class LocalInner {
			// lv ���ٺҰ��� - lv�� �޼��� ����� �Բ� �Ҹ�, ���� Ŭ������ ��ü�� ������������ �� ���� ���簡��
			int liv = outerIv;
			int liv2 = outerCv;
			// �ܺ�Ŭ������ ���������� final�� ���� ����(���)�� ���ٰ���
			// int liv3=lv; //1.8���� final�Ⱥٿ��� �����ƴ�
			int liv4 = LV;

		}
	}
}
