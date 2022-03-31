package ch10;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateFormatEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pattern = "yyyy/MM/dd";
		DateFormat df = new SimpleDateFormat(pattern);
		Scanner s = new Scanner(System.in);

		Date inDate = null;

		System.out.println("날짜를 " + pattern + "의 형태로 입력해주세요(예: 2015/12/31)");

		// while과 try-catch문을 이용해서 사용자가 올바르형식으로 날짜를 입력할때까지 반복해서 입력받도록 함
		while (s.hasNextLine()) {
			try {
				inDate = df.parse(s.nextLine());
				break;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("날짜를 " + pattern + "의 형태로 다시 입력해주세요(예: 2015/12/31)");
			}
		}

		Calendar cal = Calendar.getInstance();
		cal.setTime(inDate);
		Calendar today = Calendar.getInstance();
		long day = (cal.getTimeInMillis() - today.getTimeInMillis()) / (60 * 60 * 1000);
		System.out.println("입력하신 날짜는 현재와 " + day + "시간 차이가 있습니다");
	}

}
