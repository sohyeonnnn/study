package ch10;

public class CalendarEx9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("2014. 5. 31 : " + getDayOfWeek(2014, 5, 31));
	}

	// 각 달의 마지막 일
	public static int[] endOfMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	// 윤년인지 확인
	public static boolean isLeapYear(int year) {
		return ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
	}

	// 두 날짜간의 차이를 일단위로 반환
	public static int dayDiff(int y1, int m1, int d1, int y2, int m2, int d2) {
		return convertDateToDay(y1, m1, d1) - convertDateToDay(y2, m2, d2);
	}

	// 요일 값 반환(1:일요일)
	public static int getDayOfWeek(int year, int month, int day) {
		return convertDateToDay(year, month, day) % 7 + 1;
	}

	//일단위의 값을 년월일의 형태의 문자열로 변환하여 반환
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
			// 윤년이고 윤달이 포함되어 있으면, 1일을 더한다
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

	// 년월일을 입력받아서 일단위로 변환
	public static int convertDateToDay(int year, int month, int day) {
		int numOfLeapYear = 0; // 윤년의 수

		// 전 년도까지의 윤년의 수
		for (int i = 1; i < year; i++) {
			if (isLeapYear(i))
				numOfLeapYear++;
		}

		// 전년도 까지의 일수를 구한다
		int toLastYearDaySum = (year - 1) * 365 + numOfLeapYear;

		// 올해의 현재 월까지의 일수 계산
		int thisYearDaySum = 0;

		for (int i = 0; i < month - 1; i++) {
			thisYearDaySum += endOfMonth[i];
		}

		// 윤년이고ㅡ 2월이 포함되어있으면 1일을 증가
		if (month > 2 && isLeapYear(year))
			thisYearDaySum++;

		thisYearDaySum += day;

		return toLastYearDaySum + thisYearDaySum;

	}

}
