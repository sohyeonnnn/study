package ch6;

//��ü���� - ���뼺 ����, �ڵ���� ����, ���� �ŷڼ�

public class TvTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv t; // Tv �ν��Ͻ��� �����ϱ� ���� ���� t�� ����, ���� �ν��Ͻ� ���� ���̶� �ƹ��͵� �� �� ����
		t = new Tv(); // Tv �ν��Ͻ� ���� - ������ new ���, �� �ڷ����� �⺻������ �ʱ�ȭ
		t.channel = 7; // Tv�ν��Ͻ��� ������� channel�� ���� 7�� �Ѵ�
		t.channelDown(); // Tv�ν��Ͻ��� �޼��� channelDown�� ȣ��
		System.out.println("���� ä���� " + t.channel + "�Դϴ�");

		// �ν��Ͻ��� ���������� ���ؼ��� �ٷ� �� ������,
		// ���������� Ÿ���� �ν��Ͻ��� Ÿ�԰� ��ġ�ؾ���
	}

}
