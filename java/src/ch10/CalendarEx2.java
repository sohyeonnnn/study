package ch10;

import java.util.Calendar;

import ch9.ToStringTest;

public class CalendarEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ������ 1���� �����ϱ� ������, [0]�� �����
		final String[] DAY_OF_WEEK = { "", "��", "��", "ȭ", "��", "��", "��", "��" };
		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();
		date1.set(2015, 7, 15); // 2015-08-15
		System.out.println("date1�� " + toString(date1) + DAY_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)] + "�����̰�, ");
		System.out.println("����(date2)�� " + toString(date2) + DAY_OF_WEEK[date2.get(Calendar.DAY_OF_WEEK)] + "���� �Դϴ�.");

		// �� ��¥���� ���̸� ��������, getTimeInMillis()
		long difference = (date2.getTimeInMillis() - date1.getTimeInMillis()) / 1000;

		System.out.println("�� ��(date1)���� ����(date2)���� " + difference + "�ʰ� �������ϴ�");
		System.out.println("��(day)�� ����ϸ� " + difference / (24 * 60 * 60) + "���Դϴ�");
	}

	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR) + "�� " + (date.get(Calendar.MONTH) + 1) + "�� " + date.get(Calendar.DATE) + "��";
	}
}
