package ch10;

import java.util.Calendar;

public class CalendarEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length != 2) {
			System.out.println("Usage:jaca CalendarEx6 2015 9");
			return;
		}
		int year = Integer.parseInt(args[0]);
		int month = Integer.parseInt(args[1]);
		int START_DAY_OF_WEEK = 0;
		int END_DAY = 0;

		Calendar sDay = Calendar.getInstance();
		Calendar eDay = Calendar.getInstance();

		// 월의 경우 0부터 11까지의 값을 가지므로 1일 빼줘야함
		sDay.set(year, month - 1, 1);
		eDay.set(year, month, 1);

		// 다음달의 첫날에서 하루를 빼면 현재달의 마지막 날이 된다
		eDay.add(Calendar.DATE, -1);

		// 첫번째 요일이 무슨 요일인지
		START_DAY_OF_WEEK = sDay.get(Calendar.DAY_OF_WEEK);

		END_DAY = eDay.get(Calendar.DATE);

		System.out.println("   " + args[0] + "년 " + args[1] + "월");
		System.out.println(" su mo tu we th fr sa");

		for (int i = 1; i < START_DAY_OF_WEEK; i++) {
			System.out.print("  ");
		}

		for (int i = 1, n = START_DAY_OF_WEEK; i <= END_DAY; i++, n++) {
			System.out.print((i < 10) ? "  " + i : " " + i);
			if (n % 7 == 0)
				System.out.println();
		}
	}

	// 다음달의 1일에서 하루를 빼면 이번 달의 마지막 일을 알 수 있다
}
