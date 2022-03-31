package ch10;

public class CalendarEx9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("2014. 5. 31 : " + getDayOfWeek(2014, 5, 31));
	}

	// �� ���� ������ ��
	public static int[] endOfMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	// �������� Ȯ��
	public static boolean isLeapYear(int year) {
		return ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
	}

	// �� ��¥���� ���̸� �ϴ����� ��ȯ
	public static int dayDiff(int y1, int m1, int d1, int y2, int m2, int d2) {
		return convertDateToDay(y1, m1, d1) - convertDateToDay(y2, m2, d2);
	}

	// ���� �� ��ȯ(1:�Ͽ���)
	public static int getDayOfWeek(int year, int month, int day) {
		return convertDateToDay(year, month, day) % 7 + 1;
	}

	//�ϴ����� ���� ������� ������ ���ڿ��� ��ȯ�Ͽ� ��ȯ
	public static String convertDayToDate(int day) {
		int year = 1;
		int month = 0;

		while (true) {
			int aYear = isLeapYear(year) ? 366 : 365;
			if (day > aYear) {
				day -= aYear;
				year++;
			} else {
				break;
			}
		}

		while (true) {
			int endDay = endOfMonth[month];
			// �����̰� ������ ���ԵǾ� ������, 1���� ���Ѵ�
			if (isLeapYear(year) && month == 1)
				endDay++;

			if (day > endDay) {
				day -= endDay;
				month++;
			} else {
				break;
			}
		}
		return year + "-" + (month + 1) + "-" + day;
	}

	// ������� �Է¹޾Ƽ� �ϴ����� ��ȯ
	public static int convertDateToDay(int year, int month, int day) {
		int numOfLeapYear = 0; // ������ ��

		// �� �⵵������ ������ ��
		for (int i = 1; i < year; i++) {
			if (isLeapYear(i))
				numOfLeapYear++;
		}

		// ���⵵ ������ �ϼ��� ���Ѵ�
		int toLastYearDaySum = (year - 1) * 365 + numOfLeapYear;

		// ������ ���� �������� �ϼ� ���
		int thisYearDaySum = 0;

		for (int i = 0; i < month - 1; i++) {
			thisYearDaySum += endOfMonth[i];
		}

		// �����̰�� 2���� ���ԵǾ������� 1���� ����
		if (month > 2 && isLeapYear(year))
			thisYearDaySum++;

		thisYearDaySum += day;

		return toLastYearDaySum + thisYearDaySum;

	}

}
