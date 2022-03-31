package ch7;

//abstract : �޼����� ����θ� �ۼ��ϰ� ���� ���೻���� �������� ���� �߻�޼��带 �����ϴµ� ��� - Ŭ����, �޼���
//�̿ϼ��̹Ƿ� �ν��Ͻ� ���� �Ұ�
//�ٸ� Ŭ������ �� Ŭ������ ��ӹ޾Ƽ� �Ϻ��� ���ϴ� �޼��常 �������̵� �ص� �ȴٴ� ����

//����������
//private : ���� Ŭ���� ������ ���� ����
//default : ���� ��Ű�� ������ ���� ���� (�ƹ��� ���������ڸ� ������ �ʴ°�)
//protected : ���� ��Ű�� ������, �ٸ� ��Ű���� �ڼ�Ŭ�������� ���� ����
//public : ���� ���� ����

//���������� ��� ���� : Ŭ���� ���ο� ����� �����͸� ��ȣ�ϱ� ���ؼ�, �ܺο��� �����͸� �Ժη� �������� ���ϰ� �ϱ� ���� -> ĸ��ȭ
//���� ������ �ּ�ȭ�ϴ� ���� ���� -> �޼��� ������ ������ �ִ��� Ȯ���غ� ������ ������

//��������� private,protected�� �����ϰ�, ��������� ���� �а� ������ �� �ִ� public�޼��带 �����ϴ°��� �ٶ���

class Time {
	private int hour, minute, second; //private:���� Ŭ������������ ���ٰ���

	Time(int hour, int minute, int second) { //������
		setHour(hour); //set�޼��� ȣ��
		setMinute(minute);
		setSecond(second);
	}

	public int getHour() {
		return hour; //hour�� ��ȯ
	}

	public void setHour(int hour) {
		if (hour < 0 || hour > 23) //���� ���ǿ� ���������� return
			return;
		this.hour = hour; //�Ű������� ���� ���� hour�� ����
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		if (minute < 0 || minute > 59)
			return;
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		if (second < 0 || second > 59)
			return;
		this.second = second;
	}

	public String toString() { //���ڿ��� ��ȯ
		return hour + ":" + minute + ":" + second;
	}

}

public class TimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Time t = new Time(12, 35, 30);
		System.out.println(t);
		//t.hour = 13; //hour�� private���� �����߱� ������ �����Ҽ�����, getter�� �����;���
		t.setHour(t.getHour() + 1); //t�� hour�� �����ͼ� 1 ������ set
		System.out.println(t);

	}

}
