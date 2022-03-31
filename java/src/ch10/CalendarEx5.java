package ch10;

import java.util.Calendar;

public class CalendarEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar date = Calendar.getInstance();

		date.set(2015, 0, 31); // 2015-01-31
		System.out.println(toString(date));
		date.roll(Calendar.MONTH, 1);
		// 월+1 이므로 2월엔 31일이 없기 때문에 28일로 자동 변경
		System.out.println(toString(date));
	}

	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR) + "년 " + (date.get(Calendar.MONTH) + 1) + "월 " + date.get(Calendar.DATE) + "일";
	}
}
