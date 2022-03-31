package ch10;

import java.util.Calendar;

public class CalendarEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar date = Calendar.getInstance();
		date.set(2015, 7, 31); // 2015-08-31

		System.out.println(toString(date));
		System.out.println("= 1�� �� =");
		date.add(Calendar.DATE, 1);
		System.out.println(toString(date));

		System.out.println("= 6�� �� =");
		date.add(Calendar.MONTH, -6);
		System.out.println(toString(date));

		// roll�� �ٸ� �ʵ忡 ������ �̯��� �ʴ´�, ���� �޷� �Ѿ�� �� �ʵ��� ���� ������ �ʰ� �� �ʵ��� ���� �ٲ��
		System.out.println("= 31�� ��(roll) =");
		date.roll(Calendar.DATE, 31);
		System.out.println(toString(date));

		System.out.println("= 31�� ��(add) =");
		date.add(Calendar.DATE, 31);
		System.out.println(toString(date));

	}

	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR) + "�� " + (date.get(Calendar.MONTH) + 1) + "�� " + date.get(Calendar.DATE) + "��";
	}

}
