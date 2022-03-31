package ch7;

//������ : Ŭ����, ���� �Ǵ� �޼����� ����ο� �Բ� ���Ǿ� �ΰ����� �ǹ� �ο�
//���������� public, protected, default, private
//�� �� static, final, abstract, native, transient, synchronized, volatile, strictfp

//static ��� - �������, �޼���, �ʱ�ȭ��
//�ν��Ͻ� ����� ������� �ʴ� �޼���� static�� �ٿ��� static�޼���� �����ϴ°��� ����

//final ��� - Ŭ����, �޼���, �������, ��������
//����-���, �޼���-�������̵�x, Ŭ����-�ڼ�Ŭ����x
//final������ �Ϲ������� ����� �ʱ�ȭ�� ���ÿ� ������, �ν��Ͻ������� ��� �����ڿ��� �ʱ�ȭ ����

class Card2 {
	final int NUMBER;
	final String KIND;
	static int width = 100;
	static int height = 250;

	Card2(String kind, int num) {
		NUMBER = num;
		KIND = kind;
	}

	Card2() { // �⺻ ������
		this("HEART", 1);
	}

	public String toString() {
		return KIND + "" + NUMBER;
	}
}

public class FinalCardTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card2 c = new Card2("HEART", 10);
		//c.NUMBER = 5; //final�����̱� ������ �����Ҽ�����
		System.out.println(c.KIND);
		System.out.println(c.NUMBER);
		System.out.println(c);

	}

}
