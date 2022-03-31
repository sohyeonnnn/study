package ch10;

import java.util.Calendar;

public class CalendarEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length != 2) {
			System.out.println("usage:java CalendarEx7 2015 11");
			return;
		}

		int year = Integer.parseInt(args[0]);
		int month = Integer.parseInt(args[1]);

		Calendar sDay = Calendar.getInstance();
		Calendar eDay = Calendar.getInstance();

		// 월은 0부터 시작하므로 입력월-1
		sDay.set(year, month - 1, 1);
		// 입력월의 말일로 설정
		eDay.set(year, month - 1, sDay.getActualMaximum(Calendar.DATE));
		// 1일이 속한 주의 일요일로 날짜 설정
		sDay.add(Calendar.DATE, -sDay.get(Calendar.DAY_OF_WEEK) + 1);
		// 말일이 속한 주의 토요일로 날짜 설정
		eDay.add(Calendar.DATE, 7 - eDay.get(Calendar.DAY_OF_WEEK));

		System.out.println("   " + args[0] + "년 " + args[1] + "월");
		System.out.println(" su mo tu we th fr sa");

		// 시작일부터 마지막일까지 (sDay<=eDay) 1일 씩 증가시키면서 일(Calendar.DATE)을 출력
		for (int n = 1; sDay.before(eDay) || sDay.equals(eDay); sDay.add(Calendar.DATE, 1)) {
			int day = sDay.get(Calendar.DATE);
			System.out.print((day < 10) ? "  " + day : " " + day);
			if (n++ % 7 == 0)
				System.out.println(); // 7일치를 출력 후 개행

		}
	}

}
