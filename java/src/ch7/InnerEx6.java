package ch7;

//�͸�Ŭ����
//Ŭ������ ����� ��ü�� ������ ���ÿ� �ϱ� ������ �� �ѹ��� ���� �� �ְ� 
//���� �ϳ��� ��ü���� ������ �� �ִ� ��ȸ�� Ŭ����

//�̸��� ���� ������ ������x
//�� �ϳ��� Ŭ������ ��ӹްų� �� �ϳ��� �������̽����� ����

public class InnerEx6 {
	Object iv = new Object() { // �͸�Ŭ����
		void method() {
		}
	};
	static Object cv = new Object() {// �͸�Ŭ����
		void method() {
		}
	};

	void myMethod() {
		Object lv = new Object() {// �͸�Ŭ����
			void method() {
			}
		};
	}
}
